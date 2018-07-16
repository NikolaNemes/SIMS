package viewer;

import model.*;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class DodajKvarWindow extends JFrame{
    private RadnaStanica radnaStanica;
    private NaplatnoMesto naplatnoMesto;
    DodajKvarWindow(RadnaStanica radnaStanica, NaplatnoMesto naplatnoMesto){
        this.radnaStanica = radnaStanica;
        this.naplatnoMesto = naplatnoMesto;
        setSize(800, 600);
        setLayout(new MigLayout("wrap 5"));
        JLabel tipUredjajaLabela = new JLabel("Tip uredjaja");
        JComboBox<TipUredjaja> tipUredjajaJComboBox = new JComboBox<TipUredjaja>();
        for (Uredjaj u : naplatnoMesto.getUredjaji()) {
            tipUredjajaJComboBox.addItem(u.getTipUredjaja());
        }
        JLabel opisLabela = new JLabel("Opis kvara");
        JTextField opisPolje = new JTextField(50);

        JButton dodajDugme = new JButton("Dodaj kvar");
        DodajKvarWindow temp = this;
        dodajDugme.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TipUredjaja tipUredjaja = tipUredjajaJComboBox.getItemAt(tipUredjajaJComboBox.getSelectedIndex());
                Uredjaj uredjaj;
                if (tipUredjaja.equals(TipUredjaja.KONTOLER_RAMPE)){
                    uredjaj = new KontrolerRampe("1");
                }else if (tipUredjaja.equals(TipUredjaja.KONTROLER_SEMAFORA)){
                    uredjaj = new Semafor("1");
                }else if (tipUredjaja.equals(TipUredjaja.KONTROLER_SENZORA_ENP)){
                    uredjaj = new ENPSenzor("1");
                }else{
                    uredjaj = new SenzorPrilaska("1");
                }
                Kvar k = new Kvar(new Date(), opisPolje.getText(), uredjaj,String.valueOf(radnaStanica.getKvarovi().size()+120));
                radnaStanica.dodajKvar(k);
                JOptionPane.showMessageDialog(temp, "Kvar uspesno dodat");
                temp.setVisible(false);
            }
        });


        add(tipUredjajaLabela, "split 2");
        add(tipUredjajaJComboBox, "wrap");
        add (opisLabela, "split 2");
        add(opisPolje, "wrap");
        add(dodajDugme, "wrap");
    }
}
