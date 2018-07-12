package model;

public enum TipKorisnika {
    RADNIK_U_STANICI("Radnik u stanici"), SEF_STANICE("Sef stanice"), RADNIK_U_CENTRALI("Radnik u centrali");

    private String opis;

    private TipKorisnika(String opis) {
        this.opis = opis;
    }

    @Override
    public String toString() {
        return this.opis;
    }

    public static TipKorisnika odrediTip(String tekst) {
        if (tekst.equals("Radnik u stanici")) {
            return RADNIK_U_STANICI;
        } else if (tekst.equals("Sef stanice")) {
            return SEF_STANICE;
        } else {
            return RADNIK_U_CENTRALI;
        }
    }
}
