package viewer;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;

public class DodajRadnuStanicuWindow extends JFrame {
    public DodajRadnuStanicuWindow() {
        setSize(400, 300);
        setLayout(new MigLayout("wrap 5"));
        JLabel unosLabela = new JLabel("Unos podataka za novu radnu stanicu");
        JLabel idLabela = new JLabel("Identifikator:");
        JTextField id = new JTextField(10);
        JLabel mestoLabela = new JLabel("Mesto:");
        JTextField mesto = new JTextField(10);
        JButton dodajDugme = new JButton("Dodaj radnu stanicu");


        add(unosLabela, "wrap");
        add(idLabela);
        add(id, "wrap");
        add(mestoLabela);
        add(mesto, "wrap");
        add(dodajDugme, "span 2");
    }
}
