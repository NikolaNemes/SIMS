package controller;

import viewer.DodajRadnuStanicuWindow;

public class CentralWorkerActions {
    public CentralWorkerActions(){}

    public void dodajRadnuStanicu(){
        DodajRadnuStanicuWindow dialog = new DodajRadnuStanicuWindow();
        dialog.setVisible(true);
    }
}
