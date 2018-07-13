package viewer;

import jdk.nashorn.internal.scripts.JO;
import model.*;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DodajNaplatnoMestoWindow extends JFrame {
    private RadnaStanica model;
    DodajNaplatnoMestoWindow(RadnaStanica model){
        this.model = model;
        setSize(800, 600);
        setLayout(new MigLayout("wrap 5"));
        JLabel enpLabel = new JLabel("ENP");
        JCheckBox enp = new JCheckBox();
        DodajNaplatnoMestoWindow temp = this;
        JButton dodajDugme = new JButton("Dodaj naplatno mesto");
        dodajDugme.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NaplatnoMesto n = new NaplatnoMesto(String.valueOf(model.getNaplatnaMesta().size() + 1));
                n.dodajUredjaj(new KontrolerRampe(String.valueOf(model.getBrUredjaja())));
                model.setBrUredjaja(model.getBrUredjaja() + 1);
                n.dodajUredjaj(new Semafor(String.valueOf(model.getBrUredjaja())));
                model.setBrUredjaja(model.getBrUredjaja() + 1);
                if (enp.isSelected()){
                    n.dodajUredjaj(new ENPSenzor(String.valueOf(model.getBrUredjaja())));
                    model.setBrUredjaja(model.getBrUredjaja() + 1);
                    n.dodajUredjaj(new SenzorPrilaska(String.valueOf(model.getBrUredjaja())));
                    model.setBrUredjaja(model.getBrUredjaja() + 1);
                }
                boolean uspeh = model.dodajNaplatnoMesto(n);
                if (uspeh){
                    JOptionPane.showMessageDialog(temp, "Naplatno mesto uspesno dodato");
                }else{
                    JOptionPane.showMessageDialog(temp, "Dodavanje naplatnog mesta neuspesno");
                }
                setVisible(false);
            }
        });

        add(enpLabel);
        add(enp, "wrap");
        add(dodajDugme, "wrap");
    }
}
