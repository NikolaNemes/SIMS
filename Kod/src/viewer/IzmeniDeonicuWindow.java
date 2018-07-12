package viewer;

import model.Centrala;
import model.KategorijaVozila;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IzmeniDeonicuWindow extends JFrame {
    private Centrala model;
    public IzmeniDeonicuWindow(Centrala model){
        setSize(400, 300);
        setLayout(new MigLayout("wrap 5"));
        this.model = model;
        String kolone[] = {"Id", "Radna stanica 1", "Radna stanica 2", "Cena 1", "Cena 2", "Cena 3", "Cena 4"};
        String deonice[][] = new String[model.getDeonice().size()][7];
        for (int i = 0; i < model.getDeonice().size(); i++){
            deonice[i][0] = model.getDeonice().get(i).getId();
            deonice[i][1] = model.getDeonice().get(i).getPolaznaStanica().toString();
            deonice[i][2] = model.getDeonice().get(i).getDolaznaStanica().toString();
            deonice[i][3] = String.valueOf(model.getDeonice().get(i).getTrenutneCene().getCene().get(KategorijaVozila.A));
            deonice[i][4] = String.valueOf(model.getDeonice().get(i).getTrenutneCene().getCene().get(KategorijaVozila.B));
            deonice[i][5] = String.valueOf(model.getDeonice().get(i).getTrenutneCene().getCene().get(KategorijaVozila.C));
            deonice[i][6] = String.valueOf(model.getDeonice().get(i).getTrenutneCene().getCene().get(KategorijaVozila.D));
        }
        JTable deoniceTabela = new JTable(deonice, kolone);
        JScrollPane pane = new JScrollPane(deoniceTabela);
        JButton izmeniCeneDugme = new JButton("Izmeni cene");
        izmeniCeneDugme.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println(deoniceTabela.getValueAt(deoniceTabela.getSelectedRow(), 0));
            }
        });

        add(pane, "wrap");
        add(izmeniCeneDugme);
    }

}
