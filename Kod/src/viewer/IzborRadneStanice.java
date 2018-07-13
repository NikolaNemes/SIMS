package viewer;

import model.Centrala;
import model.RadnaStanica;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IzborRadneStanice extends JFrame {
    private Centrala model;
    private RadnaStanica izabranaStanica;
    IzborRadneStanice(Centrala model){
        this.model = model;
        setSize(800,600);
        setLayout(new MigLayout("wrap 5"));
        JLabel izaberiLabela = new JLabel("Izaberite radnu stanicu u kojoj radite");
        String kolone[] = {"Mesto"};
        int brAktivnihStanica = 0;
            for (int i = 0; i < model.getRadneStanice().size(); i++){
            if (model.getRadneStanice().get(i).isAktivna()){
                brAktivnihStanica++;
            }
        }
        String podaci[][] = new String[brAktivnihStanica][1];
        int brUnetihStanica = 0;
            for (int i = 0; i < model.getRadneStanice().size(); i++) {
            RadnaStanica trenutna = model.getRadneStanice().get(i);
            if (trenutna.isAktivna()) {
                podaci[brUnetihStanica][0] = trenutna.getMesto();
                brUnetihStanica++;
            }
        }
        JTable radneStaniceTabela = new JTable(podaci, kolone);
            radneStaniceTabela.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        JScrollPane pane = new JScrollPane(radneStaniceTabela);

        IzborRadneStanice temp = this;
        JButton izaberiDugme = new JButton("Izaberi");
        izaberiDugme.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int red = radneStaniceTabela.getSelectedRow();
                if (red == -1){
                    JOptionPane.showMessageDialog(temp, "Morate izabrati radnu stanicu");
                }else {
                    izabranaStanica = model.pronadjiRadnuStanicu((String)radneStaniceTabela.getValueAt(radneStaniceTabela.getSelectedRow(), 0));
                    JOptionPane.showMessageDialog(temp, "Stanica uspesno obrisana");
                    setVisible(false);
                }
            }
        });

        add(izaberiLabela, "wrap");
        add(pane, "wrap");
        add(izaberiDugme, "wrap");
    }
}
