package model;

import java.util.Date;

public class Kvar {

    private Date vreme;
    private String opis;
    private boolean aktivan;

    public Kvar(Date vreme, String opis) {
        this.vreme = vreme;
        this.opis = opis;
    }

    public Date getVreme() {
        return vreme;
    }

    public void setVreme(Date vreme) {
        this.vreme = vreme;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public boolean isAktivan() {
        return aktivan;
    }

    public void setAktivan(boolean aktivan) {
        this.aktivan = aktivan;
    }
}
