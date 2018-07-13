package model;

public enum TipIzvestaja {
    ZARADA("Zarada"), BROJ_VOZILA("Broj vozila");

    private String opis;

    private TipIzvestaja(String opis) {
        this.opis = opis;
    }

    @Override
    public String toString() {
        return this.opis;
    }

    public static TipIzvestaja odrediTip(String tekst) {
        if (tekst.equals("Zarada")) {
            return ZARADA;
        } else if (tekst.equals("Broj vozila")) {
            return BROJ_VOZILA;
        }
        return BROJ_VOZILA;
    }
}

