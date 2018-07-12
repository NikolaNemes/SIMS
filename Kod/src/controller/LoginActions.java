package controller;

import model.Centrala;
import model.Korisnik;
import viewer.LoginWindow;

public class LoginActions {
    private LoginWindow viewer;
    private Centrala model;
    private int attempts = 0;

    public void setModel(Centrala model) {
        this.model = model;
    }

    public void setViewer(LoginWindow lw) {
        this.viewer = lw;
    }

    public void checkUser(String username, String password){
        System.out.println("GUT GUT");
        System.out.println(username);
        System.out.println(password);
        Korisnik k = model.pronadjiKorisnika(username, password);
        if (k == null){
            if (++attempts == 3){
                viewer.setVisible(false);
                System.exit(1);
            }
        }
        else{

        }
    }
}
