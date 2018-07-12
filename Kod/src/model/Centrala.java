package model;

import java.util.ArrayList;
import java.util.Date;

public class Centrala {

    private ArrayList<Korisnik> korisnici;
    private ArrayList<Deonica> deonice;
    private ArrayList<RadnaStanica> radneStanice;
    private String naziv;

    public Centrala() {
        this.korisnici = new ArrayList<Korisnik>();
        this.deonice = new ArrayList<Deonica>();
        this.radneStanice = new ArrayList<RadnaStanica>();
    }

    public void dodajRadnuStanicu(RadnaStanica radnaStanica) {
        this.radneStanice.add(radnaStanica);
    }

    public void izbrisiRadnuStanicu(RadnaStanica radnaStanica) {
        for (RadnaStanica i : this.radneStanice) {
            if (i.equals(radnaStanica)) {
                i.setAktivna(false);
                break;
            }
        }
    }

    public void dodajDeonicu(Deonica deonica) {
        this.deonice.add(deonica);
    }

    public void izbrisiDeonicu(Deonica deonica) {
        for (Deonica i : this.deonice) {
            if (i.equals(deonica)) {
                i.setAktivna(false);
                break;
            }
        }
    }

    public void dodajKorisnika(Korisnik korisnik) {
        this.korisnici.add(korisnik);
    }

    public void izbrisiKorisnika(Korisnik korisnik) {
        for (Korisnik i : this.korisnici) {
            if (i.equals(korisnik)) {
                i.setAktivan(false);
                break;
            }
        }
    }

    public void izvestajBrojVozila(Date pocetak, Date kraj) {

    }

    public void izvestajIznosNovca(Date pocetak, Date kraj) {

    }

    public void izvestajBrojVozilaKat(Date pocetak, Date kraj, KategorijaVozila kategorija) {

    }

    public void izvestajNovcaKat(Date pocetak, Date kraj, KategorijaVozila kategorija) {

    }



}
