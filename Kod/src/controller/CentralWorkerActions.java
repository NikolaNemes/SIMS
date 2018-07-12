package controller;

import model.Centrala;
import viewer.DodajDeonicuWindow;
import viewer.DodajKorisnikaWindow;
import viewer.DodajRadnuStanicuWindow;

public class CentralWorkerActions {
    private Centrala model;
    public CentralWorkerActions(Centrala model){this.model = model;}

    public void dodajRadnuStanicu(){
        DodajRadnuStanicuWindow dialog = new DodajRadnuStanicuWindow(model);
        dialog.setVisible(true);
    }

    public void dodajKorisnika(){
        DodajKorisnikaWindow dialog = new DodajKorisnikaWindow(model);
        dialog.setVisible(true);
    }

    public void dodajDeonicu() {
        DodajDeonicuWindow dialog = new DodajDeonicuWindow(model);
        dialog.setVisible(true);
    }
}
