package model;

public class Korisnik {

    private TipKorisnika tip;
    private String korisnickoIme;
    private String lozinka;
    private String ime;
    private String prezime;

    public Korisnik() {

    }

    public Korisnik(TipKorisnika tip, String korisnickoIme, String lozinka, String ime, String prezime) {
        this.tip = tip;
        this.korisnickoIme = korisnickoIme;
        this.lozinka = lozinka;
        this.ime = ime;
        this.prezime = prezime;
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
}
