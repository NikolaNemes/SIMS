package model;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Date;

public interface Model {
    public Pair<ArrayList<ProlazakVozila>, Integer> izvestajBrojVozila(Date pocetak, Date kraj);
    public Pair<ArrayList<ProlazakVozila>, Integer> izvestajIznosNovca(Date pocetak, Date kraj);
    public Pair<ArrayList<ProlazakVozila>, Integer> izvestajBrojVozilaKat(Date pocetak, Date kraj, KategorijaVozila kategorija);
    public Pair<ArrayList<ProlazakVozila>, Integer> izvestajNovcaKat(Date pocetak, Date kraj, KategorijaVozila kategorija);
}
