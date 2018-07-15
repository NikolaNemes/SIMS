package unitTests;

import model.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Date;
import java.util.HashMap;

public class DeoniceTest {

    @Test
    public void testUspesnogDodavanjaCena() {
        RadnaStanica r1 = new RadnaStanica("Novi Sad", "1");
        RadnaStanica r2 = new RadnaStanica("Beograd", "2");
        Deonica d = new Deonica(r1, r2, "1");
        HashMap<KategorijaVozila, Integer> cene = new HashMap<KategorijaVozila, Integer>();
        cene.put(KategorijaVozila.A, 100);
        cene.put(KategorijaVozila.B, 200);
        cene.put(KategorijaVozila.C, 300);
        cene.put(KategorijaVozila.D, 400);
        NaplatneCene naplatneCene = new NaplatneCene(new Date(), null, cene, "1");
        d.dodajNaplatneCene(naplatneCene);
        Assertions.assertEquals(naplatneCene, d.pronadjiNaplatneCene("1"));
    }

    @Test
    public void testDodavanjaDuplikata() {
        RadnaStanica r1 = new RadnaStanica("Novi Sad", "1");
        RadnaStanica r2 = new RadnaStanica("Beograd", "2");
        Deonica d = new Deonica(r1, r2, "1");
        HashMap<KategorijaVozila, Integer> cene = new HashMap<KategorijaVozila, Integer>();
        cene.put(KategorijaVozila.A, 100);
        cene.put(KategorijaVozila.B, 200);
        cene.put(KategorijaVozila.C, 300);
        cene.put(KategorijaVozila.D, 400);
        NaplatneCene naplatneCene = new NaplatneCene(new Date(), null, cene, "1");
        d.dodajNaplatneCene(naplatneCene);
        Assertions.assertFalse(d.dodajNaplatneCene(naplatneCene));
    }

    @Test
    public void testBrisanjaCena() {
        RadnaStanica r1 = new RadnaStanica("Novi Sad", "1");
        RadnaStanica r2 = new RadnaStanica("Beograd", "2");
        Deonica d = new Deonica(r1, r2, "1");
        HashMap<KategorijaVozila, Integer> cene = new HashMap<KategorijaVozila, Integer>();
        cene.put(KategorijaVozila.A, 100);
        cene.put(KategorijaVozila.B, 200);
        cene.put(KategorijaVozila.C, 300);
        cene.put(KategorijaVozila.D, 400);
        NaplatneCene naplatneCene = new NaplatneCene(new Date(), null, cene, "1");
        d.dodajNaplatneCene(naplatneCene);
        d.izbrisiNaplatneCene("1");
        Assertions.assertNull(d.pronadjiNaplatneCene("1"));
    }
}
