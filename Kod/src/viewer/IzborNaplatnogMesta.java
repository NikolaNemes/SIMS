package viewer;

import model.Centrala;
import model.NaplatnoMesto;
import model.RadnaStanica;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IzborNaplatnogMesta extends JFrame {
    private Centrala centrala;
    private RadnaStanica radnaStanica;
    private NaplatnoMesto izabranoMesto;
    IzborNaplatnogMesta(Centrala centrala, RadnaStanica radnaStanica){
        this.radnaStanica = radnaStanica;
        this.centrala = centrala;
        setSize(800,600);
        setLayout(new MigLayout("wrap 5"));
        JLabel izaberiLabela = new JLabel("Izaberite naplatno mesto na kom radite");
        String kolone[] = {"Redni broj"};
        String podaci[][] = new String[radnaStanica.getNaplatnaMesta().size()][1];
        for (int i = 0; i < radnaStanica.getNaplatnaMesta().size(); i++){
            podaci[i][0] = radnaStanica.getNaplatnaMesta().get(i).getId();
        }
        JTable naplatnaMestaTabela = new JTable(podaci, kolone);
        naplatnaMestaTabela.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        JScrollPane pane = new JScrollPane(naplatnaMestaTabela);

        IzborNaplatnogMesta temp = this;
        JButton izaberiDugme = new JButton("Izaberi");
        izaberiDugme.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int red = naplatnaMestaTabela.getSelectedRow();
                if (red == -1){
                    JOptionPane.showMessageDialog(temp, "Morate izabrati radnu stanicu");
                }else {
                    izabranoMesto = radnaStanica.pronadjiNaplatnoMesto((String)naplatnaMestaTabela.getValueAt(naplatnaMestaTabela.getSelectedRow(), 0));
                    RadnikUStaniciWindow glavniProzor = new RadnikUStaniciWindow(centrala, radnaStanica, izabranoMesto);
                    glavniProzor.setVisible(true);
                    setVisible(false);
                }
            }
        });

        add(izaberiLabela, "wrap");
        add(pane, "wrap");
        add(izaberiDugme, "wrap");
    }
}
