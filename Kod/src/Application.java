import UI.FajlMenadzer;
import controller.LoginActions;
import model.*;
import viewer.CentralWorkerWindow;
import viewer.LoginWindow;

import java.util.ArrayList;
import java.util.Calendar;
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
        //centrala = FajlMenadzer.ucitajKorisnike("korisnici.txt", centrala);

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
        ceneMapa.put(KategorijaVozila.B, 200);
        ceneMapa.put(KategorijaVozila.C, 300);
        ceneMapa.put(KategorijaVozila.D, 400);
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

        Date temp;
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2018);


        cal.set(Calendar.MONTH, 1);
        cal.set(Calendar.DATE, 2);
        temp = cal.getTime();
        vrbas.dodajProlazakVozila(new ProlazakVozila(noviSadVrbas, KategorijaVozila.A, temp, "NS 249", "1", cene.getCene().get(KategorijaVozila.A)));

        cal.set(Calendar.MONTH, 1);
        cal.set(Calendar.DATE, 4);
        temp = cal.getTime();
        vrbas.dodajProlazakVozila(new ProlazakVozila(noviSadVrbas, KategorijaVozila.A, temp, "NS 250", "2", cene.getCene().get(KategorijaVozila.A)));

        cal.set(Calendar.MONTH, 1);
        cal.set(Calendar.DATE, 3);
        temp = cal.getTime();
        vrbas.dodajProlazakVozila(new ProlazakVozila(nisVrbas, KategorijaVozila.C, temp, "NIS 222", "3", cene.getCene().get(KategorijaVozila.C)));

        cal.set(Calendar.MONTH, 2);
        cal.set(Calendar.DATE, 10);
        temp = cal.getTime();
        vrbas.dodajProlazakVozila(new ProlazakVozila(valjevoVrbas, KategorijaVozila.B, temp, "VALJ 225", "4", cene.getCene().get(KategorijaVozila.B)));

        cal.set(Calendar.MONTH, 2);
        cal.set(Calendar.DATE, 15);
        temp = cal.getTime();
        vrbas.dodajProlazakVozila(new ProlazakVozila(valjevoVrbas, KategorijaVozila.B, temp, "VALJ 1134", "5", cene.getCene().get(KategorijaVozila.B)));

        cal.set(Calendar.MONTH, 3);
        cal.set(Calendar.DATE, 12);
        temp = cal.getTime();
        vrbas.dodajProlazakVozila(new ProlazakVozila(nisVrbas, KategorijaVozila.D, temp, "NIS 6969", "6", cene.getCene().get(KategorijaVozila.D)));


        cal.set(Calendar.MONTH, 2);
        cal.set(Calendar.DATE, 3);
        temp = cal.getTime();
        noviSad.dodajProlazakVozila(new ProlazakVozila(vrbasNoviSad, KategorijaVozila.A, temp, "VS 6969", "7", cene.getCene().get(KategorijaVozila.A)));

        cal.set(Calendar.MONTH, 3);
        cal.set(Calendar.DATE, 5);
        temp = cal.getTime();
        noviSad.dodajProlazakVozila(new ProlazakVozila(vrbasNoviSad, KategorijaVozila.A, temp, "VS 5555", "8", cene.getCene().get(KategorijaVozila.A)));

        cal.set(Calendar.MONTH, 4);
        cal.set(Calendar.DATE, 6);
        temp = cal.getTime();
        noviSad.dodajProlazakVozila(new ProlazakVozila(valjevoNoviSad, KategorijaVozila.C, temp, "VALJ 2233", "9", cene.getCene().get(KategorijaVozila.C)));

        cal.set(Calendar.MONTH, 4);
        cal.set(Calendar.DATE, 7);
        temp = cal.getTime();
        noviSad.dodajProlazakVozila(new ProlazakVozila(nisNoviSad, KategorijaVozila.C, temp, "NIS 3333", "10", cene.getCene().get(KategorijaVozila.C)));

        cal.set(Calendar.MONTH, 5);
        cal.set(Calendar.DATE, 5);
        temp = cal.getTime();
        noviSad.dodajProlazakVozila(new ProlazakVozila(nisNoviSad, KategorijaVozila.D, temp, "NIS 6666", "11", cene.getCene().get(KategorijaVozila.C)));

        cal.set(Calendar.MONTH, 2);
        cal.set(Calendar.DATE, 10);
        temp = cal.getTime();
        noviSad.dodajProlazakVozila(new ProlazakVozila(nisNoviSad, KategorijaVozila.A, temp, "NIS 5555", "12", cene.getCene().get(KategorijaVozila.A)));


        cal.set(Calendar.MONTH, 2);
        cal.set(Calendar.DATE, 15);
        temp = cal.getTime();
        valjevo.dodajProlazakVozila(new ProlazakVozila(vrbasValjevo, KategorijaVozila.B, temp,"VS 3322", "13", cene.getCene().get(KategorijaVozila.B)));

        cal.set(Calendar.MONTH, 3);
        cal.set(Calendar.DATE, 19);
        temp = cal.getTime();
        valjevo.dodajProlazakVozila(new ProlazakVozila(vrbasValjevo, KategorijaVozila.B, temp,"VS 3322", "14", cene.getCene().get(KategorijaVozila.B)));

        cal.set(Calendar.MONTH, 1);
        cal.set(Calendar.DATE, 23);
        temp = cal.getTime();
        valjevo.dodajProlazakVozila(new ProlazakVozila(nisValjevo, KategorijaVozila.D, temp, "NIS 2269", "15", cene.getCene().get(KategorijaVozila.D)));

        cal.set(Calendar.MONTH, 4);
        cal.set(Calendar.DATE, 3);
        temp = cal.getTime();
        valjevo.dodajProlazakVozila(new ProlazakVozila(nisValjevo, KategorijaVozila.C, temp, "NIS 2233", "16", cene.getCene().get(KategorijaVozila.C)));

        cal.set(Calendar.MONTH, 2);
        cal.set(Calendar.DATE, 7);
        temp = cal.getTime();
        valjevo.dodajProlazakVozila(new ProlazakVozila(nisValjevo, KategorijaVozila.C, temp, "NIS 2222", "17", cene.getCene().get(KategorijaVozila.C)));

        cal.set(Calendar.MONTH, 1);
        cal.set(Calendar.DATE, 22);
        temp = cal.getTime();
        valjevo.dodajProlazakVozila(new ProlazakVozila(noviSadValjevo, KategorijaVozila.A, temp, "NS 6969", "18", cene.getCene().get(KategorijaVozila.A)));


        cal.set(Calendar.MONTH, 1);
        cal.set(Calendar.DATE, 3);
        temp = cal.getTime();
        nis.dodajProlazakVozila(new ProlazakVozila(vrbasNis, KategorijaVozila.D, temp, "VS 2222", "19", cene.getCene().get(KategorijaVozila.D)));

        cal.set(Calendar.MONTH, 4);
        cal.set(Calendar.DATE, 3);
        temp = cal.getTime();
        nis.dodajProlazakVozila(new ProlazakVozila(valjevoNis, KategorijaVozila.D, temp, "VALJ 3333", "20", cene.getCene().get(KategorijaVozila.D)));

        cal.set(Calendar.MONTH, 3);
        cal.set(Calendar.DATE, 4);
        temp = cal.getTime();
        nis.dodajProlazakVozila(new ProlazakVozila(valjevoNis, KategorijaVozila.C, temp, "VALJ 5555", "21", cene.getCene().get(KategorijaVozila.C)));

        cal.set(Calendar.MONTH, 2);
        cal.set(Calendar.DATE, 12);
        temp = cal.getTime();
        nis.dodajProlazakVozila(new ProlazakVozila(valjevoNis, KategorijaVozila.A, temp, "VALJ 6969", "22", cene.getCene().get(KategorijaVozila.A)));

        cal.set(Calendar.MONTH, 3);
        cal.set(Calendar.DATE, 15);
        temp = cal.getTime();
        nis.dodajProlazakVozila(new ProlazakVozila(noviSadNis, KategorijaVozila.B, temp, "NS 2233", "23", cene.getCene().get(KategorijaVozila.B)));

        cal.set(Calendar.MONTH, 1);
        cal.set(Calendar.DATE, 17);
        temp = cal.getTime();
        nis.dodajProlazakVozila(new ProlazakVozila(noviSadNis, KategorijaVozila.B, temp, "NS 3322", "24", cene.getCene().get(KategorijaVozila.B)));

        //FajlMenadzer.ucitajKorisnike("korisnici.txt", centrala);
        CentralWorkerWindow cww = new CentralWorkerWindow(centrala);
        cww.setVisible(true);
    }
}
