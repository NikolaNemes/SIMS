package viewer;


import UI.FajlMenadzer;
import net.miginfocom.swing.MigLayout;
import org.jdesktop.swingx.JXDatePicker;
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
        JMenu izmeniMeni = new JMenu("Izmeni");
        JMenu izvestajMeni = new JMenu("Izvestaj");
        JMenu fajlMeni = new JMenu("Fajl");
        meniTraka.add(fajlMeni);
        meniTraka.add(novoMeni);
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
                //TODO
            }
        });

        JButton brSvihVozilaDugme = new JButton("Broj svih vozila");
        brSvihVozilaMeniDugme.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO
            }
        });

        JMenuItem brKatVozilaMeniDugme = new JMenuItem("Vozila odredjene kategorije");
        brVozilaMeni.add(brKatVozilaMeniDugme);
        brKatVozilaMeniDugme.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO
            }
        });

        JButton brKatVozilaDugme = new JButton("Broj vozila odredjene vrste");
        brKatVozilaDugme.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO
            }
        });

        JMenu zaradaMeni = new JMenu("Zarada");
        izvestajMeni.add(zaradaMeni);

        JMenuItem zaradaSvihVozilaMeniDugme = new JMenuItem("Sva vozila");
        zaradaMeni.add(zaradaSvihVozilaMeniDugme);
        zaradaSvihVozilaMeniDugme.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO
            }
        });

        JButton zaradaSvihVozilaDugme = new JButton("Zarada od svih vozila");
        zaradaSvihVozilaDugme.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO
            }
        });

        JMenuItem zaradaKatVozilaMeniDugme = new JMenuItem("Vozila odredjene kategorije");
        zaradaMeni.add(zaradaKatVozilaMeniDugme);
        zaradaKatVozilaMeniDugme.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO
            }
        });

        JButton zaradaKatVozilaDugme = new JButton("Zarada od vozila odredjene vrste");
        zaradaKatVozilaDugme.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO
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

        add(novaRSDugme, "split 5");
        add(novaDeonicaDugme);
        add(noviKorisnikDugme);
        add(izmeniDeonicuDugme, "wrap");
        add(brSvihVozilaDugme, "split 5");
        add(brKatVozilaDugme, "wrap");
        add(zaradaSvihVozilaDugme, "split 5");
        add(zaradaKatVozilaDugme, "wrap");
    }
}

