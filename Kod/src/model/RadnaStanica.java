package model;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Date;

public class RadnaStanica implements Model{

    private String mesto;
    private boolean aktivna;
    private ArrayList<ProlazakVozila> prolasci;
    private ArrayList<NaplatnoMesto> naplatnaMesta;
    private ArrayList<Kvar> kvarovi;
    private ArrayList<Deonica> deonice;
    private String id;
    private int brUredjaja = 0;

    public RadnaStanica(String mesto, String id) {
        this.mesto = mesto;
        this.aktivna = true;
        this.prolasci = new ArrayList<ProlazakVozila>();
        this.naplatnaMesta = new ArrayList<NaplatnoMesto>();
        this.kvarovi = new ArrayList<Kvar>();
        this.deonice = new ArrayList<Deonica>();
        this.id = id;
    }

    public NaplatnoMesto pronadjiNaplatnoMesto(String id) {
        NaplatnoMesto retVal = null;
        for (NaplatnoMesto i : this.naplatnaMesta) {
            if (i.getId().equals(id)) {
                retVal = i;
                break;
            }
        }
        return retVal;
    }

    public boolean dodajNaplatnoMesto(NaplatnoMesto naplatnoMesto) {
        NaplatnoMesto temp = null;
        temp = pronadjiNaplatnoMesto(naplatnoMesto.getId());
        if (temp == null) {
            this.naplatnaMesta.add(naplatnoMesto);
            return true;
        }
        return false;
    }

    public void izbrisiNaplatnoMesto(String id) {
        for (NaplatnoMesto i : naplatnaMesta) {
            if (i.getId().equals(id)) {
                i.setAktivno(false);
                break;
            }
        }
    }

    public Kvar pronadjiKvar(String id) {
        Kvar retVal = null;
        for (Kvar i : this.kvarovi) {
            if (i.getId().equals(id)) {
                retVal = i;
                break;
            }
        }
        return retVal;
    }

    public boolean dodajKvar(Kvar kvar) {
        Kvar temp = null;
        temp = pronadjiKvar(kvar.getId());
        if (temp == null) {
            this.kvarovi.add(kvar);
            return true;
        }
        return false;
    }

    public void izbrisiKvar(Kvar kvar) {
        for (Kvar i : this.kvarovi) {
            if (i.equals(kvar)) {
                i.setAktivan(false);
                break;
            }
        }
    }

    public Deonica pronadjiDeonicu(RadnaStanica polaznaStanica) {
        Deonica retVal = null;
        for (Deonica i : this.deonice) {
            if (i.getPolaznaStanica().equals(polaznaStanica)) {
                retVal = i;
                break;
            }
        }
        return retVal;
    }
    public Deonica pronadjiDeonicu(String id) {
        Deonica retVal = null;
        for (Deonica i : deonice) {
            if (i.getId().equals(id)) {

                break;
            }
        }
        return retVal;
    }

    public boolean dodajDeonicu(Deonica deonica) {
        Deonica temp = null;
        temp = pronadjiDeonicu(deonica.getId());
        if (temp == null) {
            this.deonice.add(deonica);
            return true;
        }
        return false;
    }

    public void izbrisiDeonicu(String id) {
        for (Deonica i : this.deonice) {
            if (i.getId().equals(id)) {
                i.setAktivna(false);
            }
            break;
        }
    }

    public ProlazakVozila pronadjiProlazakVozila(String id) {
        ProlazakVozila retVal = null;
        for (ProlazakVozila i : this.prolasci) {
            if (i.getId().equals(id)) {
                retVal = i;
                break;
            }
        }
        return retVal;
    }

    public boolean dodajProlazakVozila(ProlazakVozila prolazakVozila) {
        ProlazakVozila temp = null;
        temp = pronadjiProlazakVozila(prolazakVozila.getId());
        if (temp == null) {
            this.prolasci.add(prolazakVozila);
            return true;
        }
        return false;
    }

    public Pair<ArrayList<ProlazakVozila>, Integer> izvestajBrojVozila(Date pocetak, Date kraj) {
           ArrayList<ProlazakVozila> potrebniProlasci = new ArrayList<ProlazakVozila>();
           for (ProlazakVozila pv: this.prolasci) {
                if (pv.getVreme().compareTo(pocetak) >= 0 && pv.getVreme().compareTo(kraj) <= 0) {
                    potrebniProlasci.add(pv);
                }
           }
           return new Pair<ArrayList<ProlazakVozila>, Integer>(potrebniProlasci, potrebniProlasci.size());
    }

    public Pair<ArrayList<ProlazakVozila>, Integer> izvestajIznosNovca(Date pocetak, Date kraj) {
        ArrayList<ProlazakVozila> potrebniProlasci = new ArrayList<ProlazakVozila>();
        int ukupanIznos = 0;
        for (ProlazakVozila pv: this.prolasci) {
            if (pv.getVreme().compareTo(pocetak) >= 0 && pv.getVreme().compareTo(kraj) <= 0) {
                potrebniProlasci.add(pv);
                ukupanIznos += pv.getCena();
            }
        }
        return new Pair<ArrayList<ProlazakVozila>, Integer>(potrebniProlasci, ukupanIznos);

    }

    public Pair<ArrayList<ProlazakVozila>, Integer> izvestajBrojVozilaKat(Date pocetak, Date kraj, KategorijaVozila kategorija) {
        ArrayList<ProlazakVozila> potrebniProlasci = new ArrayList<>();
        for (ProlazakVozila pv: this.prolasci) {
            if (pv.getVreme().compareTo(pocetak) >= 0 && pv.getVreme().compareTo(kraj) <= 0 && kategorija.equals(pv.getKategorija())) {
                potrebniProlasci.add(pv);
            }
        }
        return new Pair<ArrayList<ProlazakVozila>, Integer>(potrebniProlasci, potrebniProlasci.size());
    }

    public Pair<ArrayList<ProlazakVozila>, Integer> izvestajNovcaKat(Date pocetak, Date kraj, KategorijaVozila kategorija) {
        ArrayList<ProlazakVozila> potrebniProlasci = new ArrayList<>();
        int ukupanIznos = 0;
        for (ProlazakVozila pv: this.prolasci) {
            if (pv.getVreme().compareTo(pocetak) >= 0 && pv.getVreme().compareTo(kraj) <= 0 && kategorija.equals(pv.getKategorija())) {
                potrebniProlasci.add(pv);
                ukupanIznos += pv.getCena();
            }
        }
        return new Pair<ArrayList<ProlazakVozila>, Integer>(potrebniProlasci, ukupanIznos);
    }

    public ArrayList<ProlazakVozila> getProlasci() {
        return prolasci;
    }

    public ArrayList<NaplatnoMesto> getNaplatnaMesta() {
        return naplatnaMesta;
    }

    public ArrayList<Kvar> getKvarovi() {
        return kvarovi;
    }

    public ArrayList<Deonica> getDeonice() {
        return deonice;
    }

    @Override
    public String toString() {
        return mesto;
    }

    public String getMesto() {
        return mesto;
    }

    public void setMesto(String mesto) {
        this.mesto = mesto;
    }

    public boolean isAktivna() {
        return aktivna;
    }

    public void setAktivna(boolean aktivna) {
        this.aktivna = aktivna;
    }

    public void setDeonice(ArrayList<Deonica> deonice) {
        this.deonice = deonice;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getBrUredjaja() {
        return brUredjaja;
    }

    public void setBrUredjaja(int brUredjaja) {
        this.brUredjaja = brUredjaja;
    }
}
