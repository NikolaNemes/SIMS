package viewer;

import UI.FajlMenadzer;
import model.Centrala;
import model.RadnaStanica;
import model.TipIzvestaja;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SefStaniceWindow extends JFrame {
    private Centrala modelCentrala;
    private RadnaStanica model;
    public SefStaniceWindow(Centrala c, RadnaStanica model){
        this.model = model;
        this.modelCentrala = c;
        setSize(800, 600);
        setLayout(new MigLayout("wrap 5"));
        JMenuBar meniTraka = new JMenuBar();
        JMenu novoMeni = new JMenu("Novo");
        JMenu izvestajMeni = new JMenu("Izvestaj");
        JMenu fajlMeni = new JMenu("Fajl");
        meniTraka.add(fajlMeni);
        meniTraka.add(novoMeni);
        meniTraka.add(izvestajMeni);

        JMenuItem snimiMeniDugme = new JMenuItem("Snimi");
        fajlMeni.add(snimiMeniDugme);
        snimiMeniDugme.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FajlMenadzer.snimiKorisnike("korisnici.txt", modelCentrala);
            }
        });

        JMenuItem novoNaplatnoMestoMeniDugme = new JMenuItem("Naplatno mesto");
        novoMeni.add(novoNaplatnoMestoMeniDugme);
        novoNaplatnoMestoMeniDugme.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DodajNaplatnoMestoWindow dialog = new DodajNaplatnoMestoWindow(model);
                dialog.setVisible(true);
            }
        });

        JButton novoNaplatnoMestoDugme = new JButton("Novo naplatno mesto");
        novoNaplatnoMestoDugme.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DodajNaplatnoMestoWindow dialog = new DodajNaplatnoMestoWindow(model);
                dialog.setVisible(true);
            }
        });

        JMenu brVozilaMeni = new JMenu("Broj vozila");
        izvestajMeni.add(brVozilaMeni);

        JMenuItem brSvihVozilaMeniDugme = new JMenuItem("Sva vozila");
        brVozilaMeni.add(brSvihVozilaMeniDugme);
        brSvihVozilaMeniDugme.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                IzvestajSvaVozilaWindow dialog = new IzvestajSvaVozilaWindow(model, TipIzvestaja.BROJ_VOZILA);
                dialog.setVisible(true);
            }
        });

        JButton brSvihVozilaDugme = new JButton("Broj svih vozila");
        brSvihVozilaDugme.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                IzvestajSvaVozilaWindow dialog = new IzvestajSvaVozilaWindow(model, TipIzvestaja.BROJ_VOZILA);
                dialog.setVisible(true);
            }
        });

        JMenuItem brKatVozilaMeniDugme = new JMenuItem("Vozila odredjene kategorije");
        brVozilaMeni.add(brKatVozilaMeniDugme);
        brKatVozilaMeniDugme.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                IzvestajKatVozilaWindow dialog = new IzvestajKatVozilaWindow(model, TipIzvestaja.BROJ_VOZILA);
                dialog.setVisible(true);
            }
        });

        JButton brKatVozilaDugme = new JButton("Broj vozila odredjene kategorije");
        brKatVozilaDugme.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                IzvestajKatVozilaWindow dialog = new IzvestajKatVozilaWindow(model, TipIzvestaja.BROJ_VOZILA);
                dialog.setVisible(true);
            }
        });

        JMenu zaradaMeni = new JMenu("Zarada");
        izvestajMeni.add(zaradaMeni);

        JMenuItem zaradaSvihVozilaMeniDugme = new JMenuItem("Sva vozila");
        zaradaMeni.add(zaradaSvihVozilaMeniDugme);
        zaradaSvihVozilaMeniDugme.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                IzvestajSvaVozilaWindow dialog = new IzvestajSvaVozilaWindow(model, TipIzvestaja.ZARADA);
                dialog.setVisible(true);
            }
        });

        JButton zaradaSvihVozilaDugme = new JButton("Zarada od svih vozila");
        zaradaSvihVozilaDugme.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                IzvestajSvaVozilaWindow dialog = new IzvestajSvaVozilaWindow(model, TipIzvestaja.ZARADA);
                dialog.setVisible(true);
            }
        });

        JMenuItem zaradaKatVozilaMeniDugme = new JMenuItem("Vozila odredjene kategorije");
        zaradaMeni.add(zaradaKatVozilaMeniDugme);
        zaradaKatVozilaMeniDugme.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                IzvestajKatVozilaWindow dialog = new IzvestajKatVozilaWindow(model, TipIzvestaja.ZARADA);
                dialog.setVisible(true);
            }
        });

        JButton zaradaKatVozilaDugme = new JButton("Zarada od vozila odredjene kategorije");
        zaradaKatVozilaDugme.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                IzvestajKatVozilaWindow dialog = new IzvestajKatVozilaWindow(model, TipIzvestaja.ZARADA);
                dialog.setVisible(true);
            }
        });

        JMenuItem kvaroviMeniDugme = new JMenuItem("Kvarovi");
        meniTraka.add(kvaroviMeniDugme);
        kvaroviMeniDugme.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                IzvestajKvarovi dialog = new IzvestajKvarovi(model);
                dialog.setVisible(true);
            }
        });

        JButton kvaroviDugme = new JButton("K0varovi");
        kvaroviDugme.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                IzvestajKvarovi dialog = new IzvestajKvarovi(model);
                dialog.setVisible(true);
            }
        });

        add(meniTraka, "wrap");
        add(novoNaplatnoMestoDugme, "wrap");
        add(brSvihVozilaDugme, "split 5");
        add(brKatVozilaDugme, "wrap");
        add(zaradaSvihVozilaDugme, "split 5");
        add(zaradaKatVozilaDugme, "wrap");
        add(kvaroviDugme, "wrap");
    }
}
