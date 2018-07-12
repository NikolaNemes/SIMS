package UI;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FajlMenadzer {

    public static void ucitajKorisnike(String korisnickiFajl) {
        BufferedReader bf = null;
        try {
            bf = new BufferedReader(new FileReader(korisnickiFajl));
            while ((linija = bf.readLine()) != null) {

            }
            bf.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void snimiKorisnike() {

    }



}
