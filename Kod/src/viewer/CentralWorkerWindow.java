package viewer;


import UI.FajlMenadzer;
import model.TipIzvestaja;
import net.miginfocom.swing.MigLayout;
import model.Centrala;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CentralWorkerWindow extends JFrame{
    private Centrala model;

    public CentralWorkerWindow(Centrala centrala) {
        this.model = centrala;
        setSize(800, 600);
        setLayout(new MigLayout("wrap 5"));
        JMenuBar meniTraka = new JMenuBar();
        JMenu novoMeni = new JMenu("Novo");
        JMenu izbrisiMeni = new JMenu("Izbrisi");
        JMenu izmeniMeni = new JMenu("Izmeni");
        JMenu izvestajMeni = new JMenu("Izvestaj");
        JMenu fajlMeni = new JMenu("Fajl");
        meniTraka.add(fajlMeni);
        meniTraka.add(novoMeni);
        meniTraka.add(izbrisiMeni);
        meniTraka.add(izmeniMeni);
        meniTraka.add(izvestajMeni);

        JMenuItem snimiMeniDugme = new JMenuItem("Snimi");
        fajlMeni.add(snimiMeniDugme);
        snimiMeniDugme.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FajlMenadzer.snimiKorisnike("korisnici.txt", model);
            }
        });

        JMenuItem novaRSMeniDugme = new JMenuItem("Radna stanica");
        novoMeni.add(novaRSMeniDugme);
        novaRSMeniDugme.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                DodajRadnuStanicuWindow dialog = new DodajRadnuStanicuWindow(model);
                dialog.setVisible(true);
            }
        });

        JButton novaRSDugme = new JButton("Nova radna stanica");
        novaRSDugme.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                DodajRadnuStanicuWindow dialog = new DodajRadnuStanicuWindow(model);
                dialog.setVisible(true);
            }
        });

        JMenuItem novaDeonicaMeniDugme = new JMenuItem("Deonica");
        novoMeni.add(novaDeonicaMeniDugme);
        novaDeonicaMeniDugme.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DodajDeonicuWindow dialog = new DodajDeonicuWindow(model);
                dialog.setVisible(true);
            }
        });

        JButton novaDeonicaDugme = new JButton("Nova deonica");
        novaDeonicaDugme.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DodajDeonicuWindow dialog = new DodajDeonicuWindow(model);
                dialog.setVisible(true);
            }
        });

        JMenuItem noviKorisnikMeniDugme = new JMenuItem("Korisnik");
        novoMeni.add(noviKorisnikMeniDugme);
        noviKorisnikMeniDugme.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DodajKorisnikaWindow dialog = new DodajKorisnikaWindow(model);
                dialog.setVisible(true);
            }
        });

        JButton noviKorisnikDugme = new JButton("Novi korisnik");
        noviKorisnikDugme.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DodajKorisnikaWindow dialog = new DodajKorisnikaWindow(model);
                dialog.setVisible(true);
            }
        });

        JMenuItem izbrisiRSMeniDugme = new JMenuItem("Radnu stanicu");
        izbrisiMeni.add(izbrisiRSMeniDugme);
        izbrisiRSMeniDugme.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                IzbrisiRadnuStanicuWindow dialog = new IzbrisiRadnuStanicuWindow(model);
                dialog.setVisible(true);
            }
        });

        JButton izbrisiRSDugme = new JButton("Izbrisi radnu stanicu");
        izbrisiRSDugme.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                IzbrisiRadnuStanicuWindow dialog = new IzbrisiRadnuStanicuWindow(model);
                dialog.setVisible(true);
            }
        });

        JMenuItem izbrisiDeonicuMeniDugme = new JMenuItem("Deonicu");
        izbrisiMeni.add(izbrisiDeonicuMeniDugme);
        izbrisiDeonicuMeniDugme.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                IzbrisiDeonicuWindow dialog = new IzbrisiDeonicuWindow(model);
                dialog.setVisible(true);
            }
        });

        JButton izbrisiDeonicuDugme = new JButton("Izbrisi deonicu");
        izbrisiDeonicuDugme.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                IzbrisiDeonicuWindow dialog = new IzbrisiDeonicuWindow(model);
                dialog.setVisible(true);
            }
        });

        JMenuItem izbrisiKorisnikaMeniDugme = new JMenuItem("Korisnika");
        izbrisiMeni.add(izbrisiKorisnikaMeniDugme);
        izbrisiKorisnikaMeniDugme.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                IzbrisiKorisnikaWindow dialog = new IzbrisiKorisnikaWindow(model);
                dialog.setVisible(true);
            }
        });

        JButton izbrisiKorisnikaDugme = new JButton("Izbrisi korisnika");
        izbrisiKorisnikaDugme.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                IzbrisiKorisnikaWindow dialog = new IzbrisiKorisnikaWindow(model);
                dialog.setVisible(true);
            }
        });

        JMenuItem izmeniDeonicuMeniDugme = new JMenuItem("Deonicu");
        izmeniMeni.add(izmeniDeonicuMeniDugme);
        izmeniDeonicuMeniDugme.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                IzmeniDeonicuWindow dialog = new IzmeniDeonicuWindow(model);
                dialog.setVisible(true);
            }
        });

        JButton izmeniDeonicuDugme = new JButton("Izmeni deonicu");
        izmeniDeonicuDugme.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                IzmeniDeonicuWindow dialog = new IzmeniDeonicuWindow(model);
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

        add(meniTraka, "wrap");
        novaRSDugme.setPreferredSize(new Dimension(150,20));
        novaDeonicaDugme.setPreferredSize(new Dimension(150,20));
        noviKorisnikDugme.setPreferredSize(new Dimension(150, 20));
        izmeniDeonicuDugme.setPreferredSize(new Dimension(150, 20));
        brSvihVozilaDugme.setPreferredSize(new Dimension(304, 20));
        brKatVozilaDugme.setPreferredSize(new Dimension(304, 20));
        zaradaSvihVozilaDugme.setPreferredSize(new Dimension(304, 20));
        zaradaKatVozilaDugme.setPreferredSize(new Dimension(304, 20));
        izbrisiRSDugme.setPreferredSize(new Dimension(202, 20));
        izbrisiDeonicuDugme.setPreferredSize(new Dimension(201, 20));
        izbrisiKorisnikaDugme.setPreferredSize(new Dimension(201, 20));

        add(novaRSDugme, "split 5");
        add(novaDeonicaDugme);
        add(noviKorisnikDugme);
        add(izmeniDeonicuDugme, "wrap");
        add(brSvihVozilaDugme, "split 5");
        add(brKatVozilaDugme, "wrap");
        add(zaradaSvihVozilaDugme, "split 5");
        add(zaradaKatVozilaDugme, "wrap");
        add(izbrisiRSDugme, "split 5");
        add(izbrisiDeonicuDugme);
        add(izbrisiKorisnikaDugme, "wrap");
    }
}

