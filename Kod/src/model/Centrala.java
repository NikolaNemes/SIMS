package model;

import java.util.ArrayList;

public class Centrala {

    private ArrayList<Korisnik> korisnici;
    private ArrayList<Deonica> deonice;
    private ArrayList<RadnaStanica> radneStanice;
    private String naziv;

    public Centrala() {
        this.korisnici = new ArrayList<Korisnik>();
        this.deonice = new ArrayList<Deonica>();
        this.radneStanice = new ArrayList<RadnaStanica>();
    }

    void dodajRadnuStanicu(RadnaStanica radnaStanica) {
        this.radneStanice.add(radnaStanica);
    }

    void izbrisiRadnuStanicu(RadnaStanica radnaStanica) {
        for (RadnaStanica i : this.radneStanice) {
            
        }
    }

}
