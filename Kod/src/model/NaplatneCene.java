package model;

import java.util.Date;
import java.util.Map;

public class NaplatneCene {

    private Date datumPocetka;
    private Date datumKraja;
    private Map<KategorijaVozila, Integer> cene;

    public NaplatneCene(Date datumPocetka, Date datumKraja, Map<KategorijaVozila, Integer> cene) {
        this.datumPocetka = datumPocetka;
        this.datumKraja = datumKraja;
        this.cene = cene;
    }

    public Date getDatumPocetka() {
        return datumPocetka;
    }

    public void setDatumPocetka(Date datumPocetka) {
        this.datumPocetka = datumPocetka;
    }

    public Date getDatumKraja() {
        return datumKraja;
    }

    public void setDatumKraja(Date datumKraja) {
        this.datumKraja = datumKraja;
    }

    public Map<KategorijaVozila, Integer> getCene() {
        return cene;
    }

    public void setCene(Map<KategorijaVozila, Integer> cene) {
        this.cene = cene;
    }
}
