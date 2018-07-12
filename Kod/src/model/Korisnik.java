package model;

import java.io.Serializable;
import java.util.Objects;

public class Korisnik implements Serializable {

    private TipKorisnika tip;
    private String korisnickoIme;
    private String lozinka;
    private String ime;
    private String prezime;
    private boolean aktivan;
    private String id;

    public Korisnik(TipKorisnika tip, String korisnickoIme, String lozinka, String ime, String prezime, String id) {
        this.tip = tip;
        this.korisnickoIme = korisnickoIme;
        this.lozinka = lozinka;
        this.ime = ime;
        this.prezime = prezime;
        this.aktivan = true;
        this.id = id;
    }

    @Override
    public String toString() {
        String retVal = this.tip + "|" + this.korisnickoIme + "|" + this.lozinka +
                "|" + this.ime + "|" + this.prezime + "|" + this.id;
        return retVal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Korisnik korisnik = (Korisnik) o;
        return Objects.equals(id, korisnik.id);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id);
    }

    public TipKorisnika getTip() {
        return tip;
    }

    public void setTip(TipKorisnika tip) {
        this.tip = tip;
    }

    public String getKorisnickoIme() {
        return korisnickoIme;
    }

    public void setKorisnickoIme(String korisnickoIme) {
        this.korisnickoIme = korisnickoIme;
    }

    public String getLozinka() {
        return lozinka;
    }

    public void setLozinka(String lozinka) {
        this.lozinka = lozinka;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public boolean isAktivan() {
        return aktivan;
    }

    public void setAktivan(boolean aktivan) {
        this.aktivan = aktivan;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
