package viewer;

import model.Centrala;
import model.RadnaStanica;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DodajRadnuStanicuWindow extends JFrame {
    private Centrala model;
    public DodajRadnuStanicuWindow(Centrala model) {
        this.model = model;
        setSize(400, 300);
        setLayout(new MigLayout("wrap 5"));
        JLabel unosLabela = new JLabel("Unos podataka za novu radnu stanicu");
        JLabel mestoLabela = new JLabel("Mesto:");
        JTextField mesto = new JTextField(10);
        DodajRadnuStanicuWindow temp = this;

        JButton dodajDugme = new JButton("Dodaj radnu stanicu");
        dodajDugme.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean uspeh = dodajRadnuStanicu(mesto.getText());
                if (uspeh){
                    JOptionPane.showMessageDialog(temp, "Radna stanica uspesno dodata");
                }
                else{
                    JOptionPane.showMessageDialog(temp, "Ta radna stanica vec postoji");
                }
                setVisible(false);
            }
        });

        add(unosLabela, "wrap");
        add(mestoLabela);
        add(mesto, "wrap");
        add(dodajDugme, "span 2");
    }

    public boolean dodajRadnuStanicu(String mesto){
        RadnaStanica rs = new RadnaStanica(mesto, mesto);
        boolean uspeh = model.dodajRadnuStanicu(rs);
        return uspeh;
    }
}
