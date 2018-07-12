package model;

import java.util.ArrayList;

public class Deonica {

    private boolean aktivna;
    private RadnaStanica polaznaStanica;
    private RadnaStanica dolaznaStanica;
    private ArrayList<NaplatneCene> naplatneCene;
    private NaplatneCene trenutneCene;
    private String id;

    public Deonica(RadnaStanica polaznaStanica, RadnaStanica dolaznaStanica, String id) {
        this.aktivna = true;
        this.polaznaStanica = polaznaStanica;
        this.dolaznaStanica = dolaznaStanica;
        this.id = id;
        this.trenutneCene = null;
    }

    public NaplatneCene pronadjiNaplatneCene(String id) {
        NaplatneCene retVal = null;
        for (NaplatneCene i : this.naplatneCene) {
            if (i.getId().equals(id)) {
                retVal = i;
                break;
            }
        }
        return retVal;
    }

    public boolean dodajNaplatneCene(NaplatneCene naplatneCene) {
        NaplatneCene temp = null;
        temp = pronadjiNaplatneCene(naplatneCene.getId());
        if (temp == null) {
            this.naplatneCene.add(naplatneCene);
            this.trenutneCene = naplatneCene;
            return true;
        }
        return false;
    }

    public void izbrisiNaplatneCene(String id) {
        for (NaplatneCene i : this.naplatneCene) {
            if (i.getId().equals(id)) {
                break;
            }
        }
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

    public NaplatneCene getTrenutneCene() {
        return trenutneCene;
    }

    public void setTrenutneCene(NaplatneCene trenutneCene) {
        this.trenutneCene = trenutneCene;
    }
}
