package viewer;


import controller.CentralWorkerActions;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CentralWorkerWindow extends JFrame{
    private CentralWorkerActions controller;

    public void setController(CentralWorkerActions controller) {
        this.controller = controller;
    }

    public CentralWorkerWindow() {
        setSize(800, 600);
        setLayout(new MigLayout("wrap 5"));
        JMenuBar menuBar = new JMenuBar();
        JMenu newMenu = new JMenu("Novo");
        JMenu reportMenu = new JMenu("Izvestaj");
        menuBar.add(newMenu);
        menuBar.add(reportMenu);

        JMenuItem newRS = new JMenuItem("Radna stanica");
        newMenu.add(newRS);
        newRS.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                controller.dodajRadnuStanicu();
            }
        });

        JMenuItem newD = new JMenuItem("Deonica");
        newMenu.add(newD);

        JMenuItem newK = new JMenuItem("Korisnik");
        newMenu.add(newK);

        add(menuBar, "wrap");
    }
}

