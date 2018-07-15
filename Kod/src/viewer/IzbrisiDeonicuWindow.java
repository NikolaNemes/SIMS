package viewer;

import model.Centrala;
import model.Deonica;
import model.KategorijaVozila;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IzbrisiDeonicuWindow extends JFrame {
    private Centrala model;
    public IzbrisiDeonicuWindow(Centrala model){
        this.model = model;
        setSize(800, 600);
        setLayout(new MigLayout("wrap 5"));
        JLabel izaberiLabela = new JLabel("Izaberite deonicu za brisanje");
        this.model = model;
        String kolone[] = {"Id", "Radna stanica 1", "Radna stanica 2", "Cena 1", "Cena 2", "Cena 3", "Cena 4"};
        int brAktivnihDeonica = 0;
        for (int i = 0; i < model.getDeonice().size(); i++){
            if (model.getDeonice().get(i).isAktivna()){
                brAktivnihDeonica++;
            }
        }
        String deonice[][] = new String[brAktivnihDeonica][7];
        int brDodatihDeonica = 0;
        for (int i = 0; i < model.getDeonice().size(); i++) {
            Deonica d = model.getDeonice().get(i);
            if (d.isAktivna()) {
                deonice[brDodatihDeonica][0] = d.getId();
                deonice[brDodatihDeonica][1] = d.getPolaznaStanica().toString();
                deonice[brDodatihDeonica][2] = d.getDolaznaStanica().toString();
                deonice[brDodatihDeonica][3] = String.valueOf(d.getTrenutneCene().getCene().get(KategorijaVozila.A));
                deonice[brDodatihDeonica][4] = String.valueOf(d.getTrenutneCene().getCene().get(KategorijaVozila.B));
                deonice[brDodatihDeonica][5] = String.valueOf(d.getTrenutneCene().getCene().get(KategorijaVozila.C));
                deonice[brDodatihDeonica][6] = String.valueOf(d.getTrenutneCene().getCene().get(KategorijaVozila.D));
                brDodatihDeonica++;
            }
        }
        JTable deoniceTabela = new JTable(deonice, kolone);
        deoniceTabela.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        JScrollPane pane = new JScrollPane(deoniceTabela);

        IzbrisiDeonicuWindow temp = this;

        JButton obrisiDugme = new JButton("Obrisi deonicu");
        obrisiDugme.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int red = deoniceTabela.getSelectedRow();
                if (red == -1){
                    JOptionPane.showMessageDialog(temp, "Morate izabrati deonicu");
                }else {
                    model.izbrisiDeonicu((String)deoniceTabela.getValueAt(deoniceTabela.getSelectedRow(), 0));
                    JOptionPane.showMessageDialog(temp, "Deonica uspesno obrisana");
                }
                setVisible(false);
            }
        });

        add(izaberiLabela, "wrap");
        add(pane, "wrap");
        add(obrisiDugme, "wrap");
    }
}
