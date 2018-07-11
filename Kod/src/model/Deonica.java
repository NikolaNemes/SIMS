package model;

public class Deonica {

    private boolean aktivna;
    private RadnaStanica polaznaStanica;
    private RadnaStanica dolaznaStanica;

    public Deonica(RadnaStanica polaznaStanica, RadnaStanica dolaznaStanica) {
        this.aktivna = true;
        this.polaznaStanica = polaznaStanica;
        this.dolaznaStanica = dolaznaStanica;
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
}
