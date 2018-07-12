package model;

public class Deonica {

    private boolean aktivna;
    private RadnaStanica polaznaStanica;
    private RadnaStanica dolaznaStanica;
    private String id;

    public Deonica(RadnaStanica polaznaStanica, RadnaStanica dolaznaStanica, String id) {
        this.aktivna = true;
        this.polaznaStanica = polaznaStanica;
        this.dolaznaStanica = dolaznaStanica;
        this.id = id;
    }

    public boolean isAktivna() {
        return aktivna;
    }

    public void setAktivna(boolean aktivna) {
        this.aktivna = aktivna;
    }

    public RadnaStanica getPolaznaStanica() {
        return polaznaStanica;
    }

    public void setPolaznaStanica(RadnaStanica polaznaStanica) {
        this.polaznaStanica = polaznaStanica;
    }

    public RadnaStanica getDolaznaStanica() {
        return dolaznaStanica;
    }

    public void setDolaznaStanica(RadnaStanica dolaznaStanica) {
        this.dolaznaStanica = dolaznaStanica;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
