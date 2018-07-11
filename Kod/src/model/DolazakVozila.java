package model;

import java.util.Date;

public class DolazakVozila {

    private KategorijaVozila kategorija;
    private Date vreme;
    private String registracija;
    private Deonica deonica;

    public DolazakVozila(KategorijaVozila kategorija, Date vreme, String registracija, Deonica deonica) {
        this.kategorija = kategorija;
        this.vreme = vreme;
        this.registracija = registracija;
        this.deonica = deonica;
    }

    public KategorijaVozila getKategorija() {
        return kategorija;
    }

    public void setKategorija(KategorijaVozila kategorija) {
        this.kategorija = kategorija;
    }

    public Date getVreme() {
        return vreme;
    }

    public void setVreme(Date vreme) {
        this.vreme = vreme;
    }

    public String getRegistracija() {
        return registracija;
    }

    public void setRegistracija(String registracija) {
        this.registracija = registracija;
    }

    public Deonica getDeonica() {
        return deonica;
    }

    public void setDeonica(Deonica deonica) {
        this.deonica = deonica;
    }
}
