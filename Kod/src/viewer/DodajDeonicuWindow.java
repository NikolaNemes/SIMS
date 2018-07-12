package viewer;

import controller.DodajDeonicuAkcije;
import model.Centrala;
import model.RadnaStanica;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;

public class DodajDeonicuWindow extends JFrame {
    private DodajDeonicuAkcije controller;
    private Centrala model;

    public DodajDeonicuWindow(Centrala model){
        this.model = model;
        this.controller = new DodajDeonicuAkcije(model);
        setSize(400, 300);
        setLayout(new MigLayout("wrap 5"));
        JLabel unosLabela = new JLabel("Unos podataka za novu deonicu");
        JLabel idLabela = new JLabel("Id:");
        JTextField id = new JTextField(10);
        RadnaStanica[] stanice = new RadnaStanica[model.getRadneStanice().size()];
        stanice  = model.getRadneStanice().toArray(stanice);
        JLabel rs1labela = new JLabel("Radna stanica 1:");
        JComboBox staniceIzbor1 = new JComboBox(stanice);
        JLabel rs2labela = new JLabel("Radna stanica 2:");
        JComboBox staniceIzbor2 = new JComboBox(stanice);
        JLabel cenaKatALabela = new JLabel("Cena kategorija A:");
        JTextField cenaKatA = new JTextField(5);
        JLabel cenaKatBLabela = new JLabel("Cena kategorija B:");
        JTextField cenaKatB = new JTextField(5);
        JLabel cenaKatCLabela = new JLabel("Cena kategorija C:");
        JTextField cenaKatC = new JTextField(5);
        JLabel cenaKatDLabela = new JLabel("Cena kategorija D:");
        JTextField cenaKatD = new JTextField(5);
        JButton dodajDugme = new JButton("Dodaj deonicu");

        add(unosLabela, "wrap");
        add(idLabela);
        add(id, "wrap");
        add(rs1labela);
        add(staniceIzbor1, "wrap");
        add(rs2labela);
        add(staniceIzbor2, "wrap");
        add(cenaKatALabela);
        add(cenaKatA, "wrap");
        add(cenaKatBLabela);
        add(cenaKatB, "wrap");
        add(cenaKatCLabela);
        add(cenaKatC, "wrap");
        add(cenaKatDLabela);
        add(cenaKatD, "wrap");
        add(dodajDugme);
    }
}
