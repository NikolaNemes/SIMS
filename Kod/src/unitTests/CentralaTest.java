package unitTests;

import model.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class CentralaTest {

    @Test
    public void testPronadjiStanicuUspesno() {

        Centrala c = new Centrala();
        RadnaStanica rs = new RadnaStanica("Novi Sad", "1");
        c.getRadneStanice().add(rs);
        Assertions.assertEquals(rs, c.pronadjiRadnuStanicu("1"));
    }

    @Test
    public void testPronadjiStanicuNepostojecu() {
        Centrala c = new Centrala();
        Assertions.assertNull(c.pronadjiRadnuStanicu("69"));
    }

    @Test
    public void testPronadjiStanicuIzbrisanu() {
        Centrala c = new Centrala();
        RadnaStanica rs = new RadnaStanica("Novi Sad", "1");
        rs.setAktivna(false);
        c.dodajRadnuStanicu(rs);
        Assertions.assertNull(c.pronadjiRadnuStanicu("1"));
    }

    @Test
    public void testDodajRadnuStanicuUspesno() {
        Centrala c = new Centrala();
        RadnaStanica rs = new RadnaStanica("Novi Sad", "1");
        Assertions.assertTrue(c.dodajRadnuStanicu(rs));
    }

    @Test
    public void testDodajRadnuStanicuDuplikat() {
        Centrala c = new Centrala();
        RadnaStanica rs = new RadnaStanica("Novi Sad", "1");
        c.dodajRadnuStanicu(rs);
        Assertions.assertFalse(c.dodajRadnuStanicu(rs));
    }

    @Test
    public void testBrisanjaRadneStanice() {
        Centrala c = new Centrala();
        RadnaStanica rs = new RadnaStanica("Novi Sad", "1");
        c.dodajRadnuStanicu(rs);
        c.izbrisiRadnuStanicu("1");
        Assertions.assertNull(c.pronadjiRadnuStanicu("1"));
    }

    @Test
    public void testPronadjiDeonicuUspesno() {
        Centrala c = new Centrala();
        RadnaStanica r1 = new RadnaStanica("Novi Sad", "1");
        RadnaStanica r2 = new RadnaStanica("Beograd", "2");
        Deonica d = new Deonica(r1, r2, "1");
        c.getDeonice().add(d);
        Assertions.assertEquals(d, c.pronadjiDeonicu("1"));
    }

    @Test
    public void testPronadjiDeonicuNepostojecu() {
        Centrala c = new Centrala();
        Assertions.assertNull(c.pronadjiDeonicu("1"));
    }

    @Test
    public void testPronadjiDeonicuIzbrisanu() {
        Centrala c = new Centrala();
        RadnaStanica r1 = new RadnaStanica("Novi Sad", "1");
        RadnaStanica r2 = new RadnaStanica("Beograd", "2");
        Deonica d = new Deonica(r1, r2, "1");
        d.setAktivna(false);
        c.getDeonice().add(d);
        Assertions.assertNull(c.pronadjiDeonicu("1"));
    }

    @Test
    public void testDodajDeonicuUspesno() {
        Centrala c = new Centrala();
        RadnaStanica r1 = new RadnaStanica("Novi Sad", "1");
        RadnaStanica r2 = new RadnaStanica("Beograd", "2");
        Deonica d = new Deonica(r1, r2, "1");
        Assertions.assertTrue(c.dodajDeonicu(d));
    }

    @Test
    public void testDodajDeonicuDuplikat() {
        Centrala c = new Centrala();
        RadnaStanica r1 = new RadnaStanica("Novi Sad", "1");
        RadnaStanica r2 = new RadnaStanica("Beograd", "2");
        Deonica d = new Deonica(r1, r2, "1");
        c.dodajDeonicu(d);
        Assertions.assertFalse(c.dodajDeonicu(d));
    }

    @Test
    public void testBrisanjaDeonice() {
        Centrala c = new Centrala();
        RadnaStanica r1 = new RadnaStanica("Novi Sad", "1");
        RadnaStanica r2 = new RadnaStanica("Beograd", "2");
        Deonica d = new Deonica(r1, r2, "1");
        c.dodajDeonicu(d);
        c.izbrisiDeonicu("1");
        Assertions.assertNull(c.pronadjiDeonicu("1"));
    }

    @Test
    public void testPronadjiKorisnikaUspesno() {
        Centrala c = new Centrala();
        Korisnik k = new Korisnik(TipKorisnika.SEF_STANICE,
                "korisnicko", "sifra", "ime", "prezime", "1");
        c.getKorisnici().add(k);
        Assertions.assertEquals(k, c.pronadjiKorisnika("1"));
    }

    @Test
    public void testPronadjiKorisnikaNepostojeceg() {
        Centrala c = new Centrala();
        Assertions.assertNull(c.pronadjiKorisnika("1"));
    }

    @Test
    public void pronadjiKorisnikaIzbrisanog() {
        Centrala c = new Centrala();
        Korisnik k = new Korisnik(TipKorisnika.SEF_STANICE,
                "korisnicko", "sifra", "ime", "prezime", "1");
        k.setAktivan(false);
        c.getKorisnici().add(k);
        Assertions.assertNull(c.pronadjiKorisnika("1"));
    }

    @Test
    public void dodajKorisnikaUspesno() {
        Centrala c = new Centrala();
        Korisnik k = new Korisnik(TipKorisnika.SEF_STANICE,
                "korisnicko", "sifra", "ime", "prezime", "1");
        Assertions.assertTrue(c.dodajKorisnika(k));
    }

    @Test
    public void dodajKorisnikaDuplikat() {
        Centrala c = new Centrala();
        Korisnik k = new Korisnik(TipKorisnika.SEF_STANICE,
                "korisnicko", "sifra", "ime", "prezime", "1");
        c.dodajKorisnika(k);
        Assertions.assertFalse(c.dodajKorisnika(k));
    }

    @Test
    public void testBrisanjaKorisnika() {
        Centrala c = new Centrala();
        Korisnik k = new Korisnik(TipKorisnika.SEF_STANICE,
                "korisnicko", "sifra", "ime", "prezime", "1");
        c.dodajKorisnika(k);
        c.izbrisiKorisnika("1");
        Assertions.assertNull(c.pronadjiKorisnika("1"));
    }
}
