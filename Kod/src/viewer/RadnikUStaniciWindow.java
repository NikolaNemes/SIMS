package viewer;

import UI.FajlMenadzer;
import model.Centrala;
import model.NaplatnoMesto;
import model.RadnaStanica;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadnikUStaniciWindow extends JFrame {
    private Centrala centrala;
    private RadnaStanica model;
    private NaplatnoMesto naplatnoMesto;
    RadnikUStaniciWindow(Centrala centrala, RadnaStanica model, NaplatnoMesto naplatnoMesto){
        this.model = model;
        this.naplatnoMesto = naplatnoMesto;
        this.centrala = centrala;
        setSize(800, 600);
        setLayout(new MigLayout("wrap 5"));
        JMenuBar meniTraka = new JMenuBar();
        JMenu fajlMeni = new JMenu("Fajl");
        JMenu novoMeni = new JMenu("Novo");
        meniTraka.add(fajlMeni);
        meniTraka.add(novoMeni);

        JMenuItem noviProlazakMeniDugme = new JMenuItem("Prolazak");
        novoMeni.add(noviProlazakMeniDugme);
        noviProlazakMeniDugme.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DodajProlazakWindow dialog = new DodajProlazakWindow(model);
                dialog.setVisible(true);
            }
        });

        JButton noviProlazakDugme = new JButton("Novi prolazak");
        noviProlazakDugme.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DodajProlazakWindow dialog = new DodajProlazakWindow(model);
                dialog.setVisible(true);
            }
        });

        JMenuItem noviKvarMeniDugme = new JMenuItem("Kvar");
        novoMeni.add(noviKvarMeniDugme);
        noviKvarMeniDugme.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DodajKvarWindow dialog = new DodajKvarWindow(model, naplatnoMesto);
                dialog.setVisible(true);
            }
        });

        JButton noviKvarDugme = new JButton("Novi kvar");
        noviKvarDugme.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DodajKvarWindow dialog = new DodajKvarWindow(model, naplatnoMesto);
                dialog.setVisible(true);
            }
        });

        JMenuItem snimiMeniDugme = new JMenuItem("Snimi");
        fajlMeni.add(snimiMeniDugme);
        snimiMeniDugme.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FajlMenadzer.snimiKorisnike("korisnici.txt", centrala);
            }
        });

        add(meniTraka, "wrap");
        add(noviProlazakDugme, "split 2");
        add(noviKvarDugme, "wrap");
    }
}
