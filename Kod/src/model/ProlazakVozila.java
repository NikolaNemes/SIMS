package model;

import java.util.Date;

public class ProlazakVozila {

    private Deonica predjenaDeonica;
    private KategorijaVozila kategorija;
    private Date vreme;
    private String registracija;
    private String id;

    public ProlazakVozila(Deonica predjenaDeonica, KategorijaVozila kategorija, Date vreme, String registracija, String id) {
        this.predjenaDeonica = predjenaDeonica;
        this.kategorija = kategorija;
        this.vreme = vreme;
        this.registracija = registracija;
        this.id = id;
    }

    public Deonica getPredjenaDeonica() {
        return predjenaDeonica;
    }

    public void setPredjenaDeonica(Deonica predjenaDeonica) {
        this.predjenaDeonica = predjenaDeonica;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
