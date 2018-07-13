import UI.FajlMenadzer;
import controller.LoginActions;
import model.*;
import viewer.CentralWorkerWindow;
import viewer.LoginWindow;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Application {
    public static void main(String[] args){
       /* LoginWindow lw = new LoginWindow();
        LoginActions la = new LoginActions();
        lw.setController(la);
        lw.setVisible(true);
        */
        Centrala centrala = new Centrala();
        centrala = FajlMenadzer.ucitajKorisnike("korisnici.txt", centrala);

        /*ArrayList<RadnaStanica> radneStanice = centrala.getRadneStanice();

        RadnaStanica vrbas = new RadnaStanica("Vrbas", "Vrbas");
        radneStanice.add(vrbas);

        RadnaStanica noviSad = new RadnaStanica("Novi Sad", "Novi Sad");
        radneStanice.add(noviSad);

        RadnaStanica nis = new RadnaStanica("Nis", "Nis");
        radneStanice.add(nis);

        RadnaStanica valjevo = new RadnaStanica("Valjevo", "Valjevo");
        radneStanice.add(valjevo);

        ArrayList<Deonica> deonice = centrala.getDeonice();

        HashMap<KategorijaVozila, Integer> ceneMapa = new HashMap<KategorijaVozila, Integer>();
        ceneMapa.put(KategorijaVozila.A, 100);
        ceneMapa.put(KategorijaVozila.B, 100);
        ceneMapa.put(KategorijaVozila.C, 100);
        ceneMapa.put(KategorijaVozila.D, 100);
        NaplatneCene cene = new NaplatneCene(new Date(), null, ceneMapa, "2");


        Deonica vrbasNoviSad = new Deonica(vrbas, noviSad, "1");
        vrbasNoviSad.dodajNaplatneCene(cene);
        Deonica vrbasNis = new Deonica(vrbas, nis, "2");
        vrbasNis.dodajNaplatneCene(cene);
        Deonica vrbasValjevo = new Deonica(vrbas, valjevo, "3");
        vrbasValjevo.dodajNaplatneCene(cene);

        Deonica noviSadVrbas = new Deonica(noviSad, vrbas, "4");
        noviSadVrbas.dodajNaplatneCene(cene);
        Deonica noviSadNis = new Deonica(noviSad, nis, "5");
        noviSadNis.dodajNaplatneCene(cene);
        Deonica noviSadValjevo = new Deonica(noviSad, valjevo, "6");
        noviSadValjevo.dodajNaplatneCene(cene);

        Deonica nisVrbas = new Deonica(nis, vrbas, "7");
        nisVrbas.dodajNaplatneCene(cene);
        Deonica nisNoviSad = new Deonica(nis, noviSad, "8");
        nisNoviSad.dodajNaplatneCene(cene);
        Deonica nisValjevo = new Deonica(nis, valjevo, "9");
        nisValjevo.dodajNaplatneCene(cene);

        Deonica valjevoVrbas = new Deonica(valjevo, vrbas, "10");
        valjevoVrbas.dodajNaplatneCene(cene);
        Deonica valjevoNoviSad = new Deonica(valjevo, noviSad, "11");
        valjevoNoviSad.dodajNaplatneCene(cene);
        Deonica valjevoNis = new Deonica(valjevo, nis, "12");
        valjevoNis.dodajNaplatneCene(cene);

        deonice.add(vrbasNoviSad);
        deonice.add(vrbasNis);
        deonice.add(vrbasValjevo);

        deonice.add(noviSadVrbas);
        deonice.add(noviSadNis);
        deonice.add(noviSadValjevo);
        deonice.add(nisVrbas);
        deonice.add(nisNoviSad);
        deonice.add(nisValjevo);
        deonice.add(valjevoVrbas);
        deonice.add(valjevoNoviSad);
        deonice.add(valjevoNis);

        vrbas.dodajDeonicu(noviSadVrbas);
        vrbas.dodajDeonicu(valjevoVrbas);
        vrbas.dodajDeonicu(nisVrbas);

        noviSad.dodajDeonicu(vrbasNoviSad);
        noviSad.dodajDeonicu(valjevoNoviSad);
        noviSad.dodajDeonicu(nisNoviSad);

        nis.dodajDeonicu(vrbasNis);
        nis.dodajDeonicu(valjevoNis);
        nis.dodajDeonicu(noviSadNis);

        valjevo.dodajDeonicu(vrbasValjevo);
        valjevo.dodajDeonicu(noviSadValjevo);
        valjevo.dodajDeonicu(nisValjevo);
        */

        //FajlMenadzer.ucitajKorisnike("korisnici.txt", centrala);
        CentralWorkerWindow cww = new CentralWorkerWindow(centrala);
        cww.setVisible(true);
    }
}
