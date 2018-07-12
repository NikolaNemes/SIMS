package model;

import java.util.ArrayList;

public class RadnaStanica {

    private String mesto;
    private boolean aktivna;
    private ArrayList<ProlazakVozila> prolasci;
    private ArrayList<NaplatnoMesto> naplatnaMesta;
    private ArrayList<Kvar> kvarovi;
    private ArrayList<Deonica> deonice;
    private String id;

    public RadnaStanica(String mesto, String id) {
        this.mesto = mesto;
        this.aktivna = false;
        this.prolasci = new ArrayList<ProlazakVozila>();
        this.naplatnaMesta = new ArrayList<NaplatnoMesto>();
        this.deonice = new ArrayList<Deonica>();
        this.id = id;
    }

    public void dodajNaplatnoMesto(NaplatnoMesto naplatnoMesto) {
        this.naplatnaMesta.add(naplatnoMesto);
    }

    public void izbrisiNaplatnoMesto(NaplatnoMesto naplatnoMesto) {
        for (NaplatnoMesto i : naplatnaMesta) {
            if (i.equals(naplatnoMesto)) {
                i.setAktivno(false);
                break;
            }
        }
    }

    public void dodajKvar(Kvar kvar) {
        this.kvarovi.add(kvar);
    }

    public void izbrisiKvar(Kvar kvar) {
        for (Kvar i : this.kvarovi) {
            if (i.equals(kvar)) {
                i.setAktivan(false);
                break;
            }
        }
    }

    public Deonica pronadjiDeonicu(RadnaStanica polaznaStanica) {
        Deonica retVal = null;
        for (Deonica i : this.deonice) {
            if (i.getPolaznaStanica().equals(polaznaStanica)) {
                retVal = i;
                break;
            }
        }
        return retVal;
    }

    public void dodajProlazakVozila(ProlazakVozila prolazakVozila) {
        this.prolasci.add(prolazakVozila);
    }

    public String getMesto() {
        return mesto;
    }

    public void setMesto(String mesto) {
        this.mesto = mesto;
    }

    public boolean isAktivna() {
        return aktivna;
    }

    public void setAktivna(boolean aktivna) {
        this.aktivna = aktivna;
    }

    public ArrayList<ProlazakVozila> getProlasci() {
        return prolasci;
    }

    public void setProlasci(ArrayList<ProlazakVozila> prolasci) {
        this.prolasci = prolasci;
    }

    public ArrayList<Deonica> getDeonice() {
        return deonice;
    }

    public void setDeonice(ArrayList<Deonica> deonice) {
        this.deonice = deonice;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
