package controller;

import UI.FajlMenadzer;
import model.Centrala;
import model.Korisnik;
import model.TipKorisnika;

public class DodajKorisnikaAkcije {
    private Centrala model;
    public DodajKorisnikaAkcije(Centrala centrala) {this.model = centrala;}
    public boolean dodajKorisnika(String korisnickoIme, String lozinka, String ime, String prezime, TipKorisnika tipKorisnika){
        Korisnik k = new Korisnik(tipKorisnika, korisnickoIme, lozinka, ime, prezime, korisnickoIme);
        boolean uspeh = model.dodajKorisnika(k);
        if (uspeh) {
            FajlMenadzer.snimiKorisnike("korisnici.txt", model);
        }
        return uspeh;
    }
}
