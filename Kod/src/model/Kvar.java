package model;

import java.util.Date;

public class Kvar {

    private Date vreme;
    private String opis;
    private boolean aktivan;
    private String id;

    public Kvar(Date vreme, String opis, String id) {
        this.vreme = vreme;
        this.opis = opis;
        this.id = id;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
