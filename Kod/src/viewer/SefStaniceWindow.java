package viewer;

import UI.FajlMenadzer;
import model.Centrala;
import model.RadnaStanica;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SefStaniceWindow extends JFrame {
    private Centrala modelCentrala;
    private RadnaStanica model;
    SefStaniceWindow(Centrala c, RadnaStanica model){
        this.model = model;
        this.modelCentrala = c;
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


    }
}
