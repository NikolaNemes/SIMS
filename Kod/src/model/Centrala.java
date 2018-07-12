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

    public void izbrisiRadnuStanicu(String id) {
        for (RadnaStanica i : this.radneStanice) {
            if (i.getId().equals(id)) {
                i.setAktivna(false);
                break;
            }
        }
    }

    public Deonica pronadjiDeonicu(String id) {
        Deonica retVal = null;
        for (Deonica i : this.deonice) {
            if (i.getId().equals(id)) {
                retVal = i;
                break;
            }
        }
        return retVal;
    }

    public boolean dodajDeonicu(Deonica deonica) {
        Deonica temp = null;
        temp = pronadjiDeonicu(deonica.getId());
        if (temp == null) {
            this.deonice.add(deonica);
            return true;
        }
        return false;
    }

    public void izbrisiDeonicu(String id) {
        for (Deonica i : this.deonice) {
            if (i.getId().equals(id)) {
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

    public void izbrisiKorisnika(String id) {
        for (Korisnik i : this.korisnici) {
            if (i.getId().equals(id)) {
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

    public ArrayList<Korisnik> getKorisnici() {
        return korisnici;
    }

    public ArrayList<Deonica> getDeonice() {
        return deonice;
    }

    public ArrayList<RadnaStanica> getRadneStanice() {
        return radneStanice;
    }
}
