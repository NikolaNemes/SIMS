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

    void dodajRadnuStanicu(RadnaStanica radnaStanica) {
        this.radneStanice.add(radnaStanica);
    }

    void izbrisiRadnuStanicu(RadnaStanica radnaStanica) {
        for (RadnaStanica i : this.radneStanice) {
            if (i.equals(radnaStanica)) {
                i.setAktivna(false);
                break;
            }
        }
    }

    void dodajDeonicu(Deonica deonica) {
        this.deonice.add(deonica);
    }

    void izbrisiDeonicu(Deonica deonica) {
        for (Deonica i : this.deonice) {
            if (i.equals(deonica)) {
                i.setAktivna(false);
                break;
            }
        }
    }

    void dodajKorisnika(Korisnik korisnik) {
        this.korisnici.add(korisnik);
    }

    void izbrisiKorisnika(Korisnik korisnik) {
        for (Korisnik i : this.korisnici) {
            if (i.equals(korisnik)) {
                i.setAktivan(false);
                break;
            }
        }
    }

    void izvestajBrojVozila(Date pocetak, Date kraj) {

    }

    void izvestajIznosNovca(Date pocetak, Date kraj) {

    }

    void izvestajBrojVozilaKat(Date pocetak, Date kraj, KategorijaVozila kategorija) {

    }

    void izvestajNovcaKat(Date pocetak, Date kraj, KategorijaVozila kategorija) {

    }



}
