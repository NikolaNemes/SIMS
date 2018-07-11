package model;

import java.util.ArrayList;

public class NaplatnoMesto {

    private boolean aktivno;
    private RadnaStanica radnaStanica;
    private ArrayList<Uredjaj> uredjaji;

    


    public boolean isAktivno() {
        return aktivno;
    }

    public void setAktivno(boolean aktivno) {
        this.aktivno = aktivno;
    }
}
