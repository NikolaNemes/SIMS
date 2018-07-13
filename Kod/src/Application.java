import UI.FajlMenadzer;
import controller.LoginActions;
import model.Centrala;
import model.Deonica;
import model.ProlazakVozila;
import model.RadnaStanica;
import viewer.CentralWorkerWindow;
import viewer.LoginWindow;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args){
       /* LoginWindow lw = new LoginWindow();
        LoginActions la = new LoginActions();
        lw.setController(la);
        lw.setVisible(true);
        */
        Centrala centrala = new Centrala();
        centrala = FajlMenadzer.ucitajKorisnike("korisnici.txt", centrala);

        ArrayList<RadnaStanica> radneStanice = centrala.getRadneStanice();

        RadnaStanica vrbas = new RadnaStanica("Vrbas", "Vrbas");
        radneStanice.add(vrbas);

        RadnaStanica noviSad = new RadnaStanica("Novi Sad", "Novi Sad");
        radneStanice.add(noviSad);

        RadnaStanica nis = new RadnaStanica("Nis", "Nis");
        radneStanice.add(nis);

        RadnaStanica valjevo = new RadnaStanica("Valjevo", "Valjevo");
        radneStanice.add(valjevo);

        ArrayList<Deonica> deonice = centrala.getDeonice();

        Deonica vrbasNoviSad = new Deonica(vrbas, noviSad, "1");
        Deonica vrbasNis = new Deonica(vrbas, nis, "2");
        Deonica vrbasValjevo = new Deonica(vrbas, valjevo, "3");

        Deonica noviSadVrbas = new Deonica(noviSad, vrbas, "4");
        Deonica noviSadNis = new Deonica(noviSad, nis, "5");
        Deonica noviSadValjevo = new Deonica(noviSad, valjevo, "6");

        Deonica nisVrbas = new Deonica(nis, vrbas, "7");
        Deonica nisNoviSad = new Deonica(nis, noviSad, "8");
        Deonica nisValjevo = new Deonica(nis, valjevo, "9");

        Deonica valjevoVrbas = new Deonica(valjevo, vrbas, "10");
        Deonica valjevoNoviSad = new Deonica(valjevo, noviSad, "11");
        Deonica valjevoNis = new Deonica(valjevo, nis, "12");

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


        //FajlMenadzer.ucitajKorisnike("korisnici.txt", centrala);
        CentralWorkerWindow cww = new CentralWorkerWindow(centrala);
        cww.setVisible(true);
    }
}
