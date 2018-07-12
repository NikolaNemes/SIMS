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

    public RadnaStanica pronadjiRadnuStanicu(String id) {
        RadnaStanica retVal = null;
        for (RadnaStanica i : this.radneStanice) {
            if (i.getId().equals(id)) {
                retVal = i;
                break;
            }
        }
        return retVal;
    }

    public boolean dodajRadnuStanicu(RadnaStanica radnaStanica) {
        RadnaStanica temp = null;
        temp = pronadjiRadnuStanicu(radnaStanica.getId());
        if (temp == null) {
            this.radneStanice.add(radnaStanica);
            return true;
        }
        return false;
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

    public Korisnik pronadjiKorisnika(String id) {
        Korisnik retVal = null;
        for (Korisnik i : this.korisnici) {
            if (i.getId().equals(id)) {
                retVal = i;
                break;
            }
        }
        return retVal;
    }

    public boolean dodajKorisnika(Korisnik korisnik) {
        Korisnik temp = pronadjiKorisnika(korisnik.getId());
        if (temp == null) {
            this.korisnici.add(korisnik);
            return true;
        }
        return false;
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
