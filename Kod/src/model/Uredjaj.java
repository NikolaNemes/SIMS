package model;

public abstract class Uredjaj {

    private TipUredjaja tipUredjaja;
    private boolean aktivan;

    public TipUredjaja getTipUredjaja() {
        return tipUredjaja;
    };

    public void setTipUredjaja(TipUredjaja tipUredjaja) {
        this.tipUredjaja = tipUredjaja;
    }

    public boolean isAktivan() {
        return aktivan;
    }

    public void setAktivan(boolean aktivan) {
        this.aktivan = aktivan;
    }
}
