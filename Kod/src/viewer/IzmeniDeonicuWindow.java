package viewer;

import model.Centrala;
import model.Deonica;
import model.KategorijaVozila;
import model.NaplatneCene;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.HashMap;

public class IzmeniDeonicuWindow extends JFrame {
    private Centrala model;
    public IzmeniDeonicuWindow(Centrala model){
        setSize(800, 600);
        setLayout(new MigLayout("wrap 5"));
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
        JLabel unosLabela = new JLabel("Unos novih cena");
        JLabel cenaKatALabela = new JLabel("Kategorija A:");
        JTextField cenaKatA = new JTextField(5);
        JLabel cenaKatBLabela = new JLabel("Kategorija B:");
        JTextField cenaKatB = new JTextField(5);
        JLabel cenaKatCLabela = new JLabel("Kategorija C:");
        JTextField cenaKatC = new JTextField(5);
        JLabel cenaKatDLabela = new JLabel("Kategorija D:");
        JTextField cenaKatD = new JTextField(5);
        IzmeniDeonicuWindow temp = this;

        JButton izmeniCeneDugme = new JButton("Izmeni cene");
        izmeniCeneDugme.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int red = deoniceTabela.getSelectedRow();
                if (red == -1){
                    JOptionPane.showMessageDialog(temp, "Morate izabrati deonicu");
                }else {
                    izmeniCene((String) deoniceTabela.getValueAt(deoniceTabela.getSelectedRow(), 0),
                            cenaKatA.getText(), cenaKatB.getText(), cenaKatC.getText(), cenaKatD.getText());
                    JOptionPane.showMessageDialog(temp, "Cene uspesno promenjene");
                    setVisible(false);
                }
            }
        });

        add(pane, "wrap");
        add(unosLabela, "wrap");
        add(cenaKatALabela, "split 2");
        add(cenaKatA, "wrap");
        add(cenaKatBLabela, "split 2");
        add(cenaKatB, "wrap");
        add(cenaKatCLabela, "split 2");
        add(cenaKatC, "wrap");
        add(cenaKatDLabela, "split 2");
        add(cenaKatD, "wrap");
        add(izmeniCeneDugme);
    }

    public void izmeniCene(String id, String c1, String c2, String c3, String c4){
        Deonica d = model.pronadjiDeonicu(id);
        NaplatneCene noveCene = new NaplatneCene(new Date(), null, new HashMap<KategorijaVozila, Integer>(),
                String.valueOf(d.getNaplatneCene().size() + 1));
        d.getTrenutneCene().setDatumKraja(new Date());
        noveCene.getCene().put(KategorijaVozila.A, Integer.valueOf(c1));
        noveCene.getCene().put(KategorijaVozila.B, Integer.valueOf(c2));
        noveCene.getCene().put(KategorijaVozila.C, Integer.valueOf(c3));
        noveCene.getCene().put(KategorijaVozila.D, Integer.valueOf(c4));
        d.setTrenutneCene(noveCene);
        d.getNaplatneCene().add(noveCene);
    }

}
