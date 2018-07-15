package viewer;

import model.RadnaStanica;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.text.SimpleDateFormat;

public class IzvestajKvarovi extends JFrame {
    private RadnaStanica model;
    IzvestajKvarovi(RadnaStanica model){
        setSize(800,600);
        setLayout(new MigLayout("wrap 5"));
        this.model = model;
        JLabel kvaroviLabela = new JLabel("Kvarovi");
        String kolone[] = {"Id", "Datum", "Opis"};
        String podaci[][] = new String[model.getKvarovi().size()][3];
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        for (int i = 0; i < model.getKvarovi().size(); i++){
            podaci[i][0] = model.getKvarovi().get(i).getId();
            podaci[i][1] = sdf.format(model.getKvarovi().get(i).getVreme());
            podaci[i][2] = model.getKvarovi().get(i).getOpis();
        }
        JTable kvaroviTabela = new JTable(podaci, kolone);
        kvaroviTabela.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        JScrollPane pane = new JScrollPane(kvaroviTabela);
        add(kvaroviLabela, "wrap");
        add(pane, "wrap");
    }
}
