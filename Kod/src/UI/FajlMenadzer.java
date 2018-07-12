package UI;

import model.Centrala;
import model.Korisnik;
import model.TipKorisnika;

import java.io.*;
import java.util.ArrayList;


public class FajlMenadzer {

    public static void ucitajKorisnike(String korisnickiFajl, Centrala centrala) {
        BufferedReader bf = null;
        String linija = null;
        try {
            bf = new BufferedReader(new FileReader(korisnickiFajl));
            while ((linija = bf.readLine()) != null) {
                String[] delovi = linija.split("\\|");
                TipKorisnika tipKorisnika = TipKorisnika.odrediTip(delovi[0]);
                centrala.getKorisnici().add(new Korisnik(tipKorisnika, delovi[1], delovi[2], delovi[3], delovi[4], delovi[5]));
            }
            bf.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void snimiKorisnike(String korisnickiFajl, Centrala centrala) {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new FileWriter(korisnickiFajl));
            for (Korisnik i: centrala.getKorisnici()) {
                pw.write(i.toString() + "\n");
            }
            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}


