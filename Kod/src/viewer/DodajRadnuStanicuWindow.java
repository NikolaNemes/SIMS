package viewer;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;

public class DodajRadnuStanicuWindow extends JFrame {
    public DodajRadnuStanicuWindow() {
        setSize(800, 600);
        setLayout(new MigLayout("wrap 5"));
        JLabel labelaUnos = new JLabel("Unos podataka za novu radnu stanicu");
        add(labelaUnos);
    }
}
