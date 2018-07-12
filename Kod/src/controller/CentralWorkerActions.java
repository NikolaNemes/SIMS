package controller;

import model.Centrala;
import viewer.DodajDeonicuWindow;
import viewer.DodajKorisnikaWindow;
import viewer.DodajRadnuStanicuWindow;

public class CentralWorkerActions {
    public CentralWorkerActions(){}

    public void dodajRadnuStanicu(){
        DodajRadnuStanicuWindow dialog = new DodajRadnuStanicuWindow();
        dialog.setVisible(true);
    }

    public void dodajKorisnika(){
        DodajKorisnikaWindow dialog = new DodajKorisnikaWindow();
        dialog.setVisible(true);
    }

    public void dodajDeonicu(Centrala centrala) {
        DodajDeonicuWindow dialog = new DodajDeonicuWindow(centrala);
        dialog.setVisible(true);
    }
}
