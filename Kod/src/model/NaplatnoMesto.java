package model;

import java.util.ArrayList;

public class NaplatnoMesto {

    private boolean aktivno;
    private RadnaStanica radnaStanica;
    private ArrayList<Uredjaj> uredjaji;

    public NaplatnoMesto() {
        this.aktivno = true;
        this.uredjaji = new ArrayList<Uredjaj>();
    }

    public void naplataRucna(DolazakVozila dolazakVozila) {

    }

    public void naplataENP(DolazakVozila dolazakVozila) {

    }

    public Kvar prijaviKvar(Kvar kvar) {


        return null;
    }

    public boolean  izvrsiTransakcijuENP(int cena) {

        return false;
    }

    public boolean izvrsiTransakcijuRucno(int cena) {
        return false;
    }

    public void dodajUredjaj(Uredjaj uredjaj) {
        this.uredjaji.add(uredjaj);
    }

    public void ukloniUredjaj(Uredjaj uredjaj) {
        for (Uredjaj i : this.uredjaji) {
            if (i.equals(uredjaj)) {
                i.setAktivan(false);
                break;
            }
        }
    }

    public Uredjaj dobaviUredjaj(TipUredjaja tipUredjaja) {
        Uredjaj retVal = null;
        for (Uredjaj i : this.uredjaji) {
            if (i.isAktivan() && i.getTipUredjaja() == tipUredjaja) {
                retVal = i;
                break;
            }
        }
        return retVal;
    }

    public boolean isAktivno() {
        return aktivno;
    }

    public void setAktivno(boolean aktivno) {
        this.aktivno = aktivno;
    }

    public RadnaStanica getRadnaStanica() {
        return radnaStanica;
    }

    public void setRadnaStanica(RadnaStanica radnaStanica) {
        this.radnaStanica = radnaStanica;
    }

    public ArrayList<Uredjaj> getUredjaji() {
        return uredjaji;
    }

    public void setUredjaji(ArrayList<Uredjaj> uredjaji) {
        this.uredjaji = uredjaji;
    }
}
