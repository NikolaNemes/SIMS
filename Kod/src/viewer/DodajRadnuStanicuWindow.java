package viewer;

import controller.DodajRadnuStanicuAkcije;
import model.Centrala;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;

public class DodajRadnuStanicuWindow extends JFrame {
    private Centrala model;
    private DodajRadnuStanicuAkcije controller;
    public DodajRadnuStanicuWindow(Centrala model) {
        this.model = model;
        this.controller = new DodajRadnuStanicuAkcije(model);
        setSize(400, 300);
        setLayout(new MigLayout("wrap 5"));
        JLabel unosLabela = new JLabel("Unos podataka za novu radnu stanicu");
        JLabel idLabela = new JLabel("Identifikator:");
        JTextField id = new JTextField(10);
        JLabel mestoLabela = new JLabel("Mesto:");
        JTextField mesto = new JTextField(10);
        JButton dodajDugme = new JButton("Dodaj radnu stanicu");


        add(unosLabela, "wrap");
        add(idLabela);
        add(id, "wrap");
        add(mestoLabela);
        add(mesto, "wrap");
        add(dodajDugme, "span 2");
    }
}
