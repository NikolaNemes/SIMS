package model;

public abstract class Uredjaj {

    protected TipUredjaja tipUredjaja;
    protected boolean aktivan = true;
    protected String id;

    public TipUredjaja getTipUredjaja() {
        return tipUredjaja;
    }

    public void setTipUredjaja(TipUredjaja tipUredjaja) {
        this.tipUredjaja = tipUredjaja;
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
