package controller;

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
}
