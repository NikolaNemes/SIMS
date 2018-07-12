package viewer;


import controller.CentralWorkerActions;
import net.miginfocom.swing.MigLayout;
import org.jdesktop.swingx.JXDatePicker;
import model.Centrala;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CentralWorkerWindow extends JFrame{
    private CentralWorkerActions controller;
    private Centrala model;

    public void setController(CentralWorkerActions controller) {
        this.controller = controller;
    }
    public void setModel(Centrala c) {this.model = c;}
    public CentralWorkerWindow() {
        setSize(800, 600);
        setLayout(new MigLayout("wrap 5"));
        JMenuBar meniTraka = new JMenuBar();
        JMenu novoMeni = new JMenu("Novo");
        JMenu izvestajMeni = new JMenu("Izvestaj");
        meniTraka.add(novoMeni);
        meniTraka.add(izvestajMeni);

        JMenuItem novaRSMeniDugme = new JMenuItem("Radna stanica");
        novoMeni.add(novaRSMeniDugme);
        novaRSMeniDugme.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                controller.dodajRadnuStanicu();
            }
        });

        JMenuItem novaDeonicaMeniDugme = new JMenuItem("Deonica");
        novoMeni.add(novaDeonicaMeniDugme);
        novaDeonicaMeniDugme.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.dodajDeonicu(model);
            }
        });

        JMenuItem noviKorisnikMeniDugme = new JMenuItem("Korisnik");
        novoMeni.add(noviKorisnikMeniDugme);
        noviKorisnikMeniDugme.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.dodajKorisnika();
            }
        });

        add(meniTraka, "wrap");

        JButton novaRSDugme = new JButton("Nova radna stanica");
        novaRSDugme.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                controller.dodajRadnuStanicu();
            }
        });

        JButton novaDeonicaDugme = new JButton("Nova deonica");
        novaDeonicaDugme.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.dodajDeonicu(model);
            }
        });

        JButton noviKorisnikDugme = new JButton("Novi korisnik");
        noviKorisnikDugme.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.dodajKorisnika();
            }
        });

        add(novaRSDugme);
        add(novaDeonicaDugme);
        add(noviKorisnikDugme, "wrap");

    }
}

