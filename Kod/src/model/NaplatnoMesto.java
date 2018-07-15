package model;

import java.util.ArrayList;

public class NaplatnoMesto {

    private String id;
    private boolean aktivno;
    private RadnaStanica radnaStanica;
    private ArrayList<Uredjaj> uredjaji;

    public NaplatnoMesto(String id) {
        this.aktivno = true;
        this.uredjaji = new ArrayList<Uredjaj>();
        this.id = id;
    }

    public void naplataRucna(DolazakVozila dolazakVozila) {

    }

    public void naplataENP(DolazakVozila dolazakVozila) {

    }

    public Kvar prijaviKvar(Kvar kvar) {

        radnaStanica.getKvarovi().add(kvar);
        return null;
    }

    public boolean  izvrsiTransakcijuENP(int cena) {

        return false;
    }

    public boolean izvrsiTransakcijuRucno(int cena) {
        return false;
    }

    public Uredjaj pronadjiUredjaj(String id) {
        Uredjaj retVal = null;
        for (Uredjaj i : this.uredjaji) {
            if (i.getId().equals(id) && i.isAktivan()) {
                retVal = i;
                break;
            }
        }
        return retVal;
    }

    public boolean dodajUredjaj(Uredjaj uredjaj) {
        Uredjaj temp = null;
        temp = pronadjiUredjaj(uredjaj.getId());
        if (temp == null) {
            this.uredjaji.add(uredjaj);
            return true;
        }
        return false;
    }

    public void ukloniUredjaj(String id) {
        for (Uredjaj i : this.uredjaji) {
            if (i.getId().equals(id) && i.isAktivan()) {
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
