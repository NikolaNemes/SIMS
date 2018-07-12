package model;

public enum TipKorisnika {
    RADNIK_U_STANICI("Radnik u stanici"), SEF_STANICE("Sef stanice"), RADNIK_U_CENTRALI("Radnik u centrali");

    private String opis;

    private TipKorisnika(String opis) {
        this.opis = opis;
    }

    public String getOpis() {
        return this.opis;
    }
}
