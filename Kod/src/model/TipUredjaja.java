package model;

public enum TipUredjaja {
    KONTOLER_RAMPE("Kontroler rampe"), KONTROLER_SEMAFORA("Kontroler semafora"), KONTROLER_SENZORA_PRILASKA("Kontroler senzora prilaska"), KONTROLER_SENZORA_ENP("Radnik u centrali");

    private String opis;

    private TipUredjaja(String opis) {this.opis = opis;}

    @Override
    public String toString() {return this.opis;}
}
