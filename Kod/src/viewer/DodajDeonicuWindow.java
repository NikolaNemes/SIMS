package viewer;

import model.*;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class DodajDeonicuWindow extends JFrame {
    private Centrala model;

    public DodajDeonicuWindow(Centrala model){
        this.model = model;
        setSize(400, 300);
        setLayout(new MigLayout("wrap 5"));
        JLabel unosLabela = new JLabel("Unos podataka za novu deonicu");
        RadnaStanica[] stanice = new RadnaStanica[model.getRadneStanice().size()];
        stanice  = model.getRadneStanice().toArray(stanice);
        JLabel rs1labela = new JLabel("Radna stanica 1:");
        JComboBox staniceIzbor1 = new JComboBox(stanice);
        JLabel rs2labela = new JLabel("Radna stanica 2:");
        JComboBox staniceIzbor2 = new JComboBox(stanice);
        JLabel cenaKatALabela = new JLabel("Cena kategorija A:");
        JTextField cenaKatA = new JTextField(5);
        JLabel cenaKatBLabela = new JLabel("Cena kategorija B:");
        JTextField cenaKatB = new JTextField(5);
        JLabel cenaKatCLabela = new JLabel("Cena kategorija C:");
        JTextField cenaKatC = new JTextField(5);
        JLabel cenaKatDLabela = new JLabel("Cena kategorija D:");
        JTextField cenaKatD = new JTextField(5);

        DodajDeonicuWindow temp = this;
        JButton dodajDugme = new JButton("Dodaj deonicu");
        dodajDugme.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean uspeh = dodajDeonicu((RadnaStanica) staniceIzbor1.getItemAt(staniceIzbor1.getSelectedIndex()),
                        (RadnaStanica) staniceIzbor2.getItemAt(staniceIzbor2.getSelectedIndex()),
                        cenaKatA.getText(), cenaKatB.getText(), cenaKatC.getText(), cenaKatD.getText());
                if (uspeh){
                    JOptionPane.showMessageDialog(temp, "Deonica uspesno dodata");
                }else{
                    JOptionPane.showMessageDialog(temp, "Dodavanje deonice neuspesno");
                }
                setVisible(false);
            }
        });

        add(unosLabela, "wrap");
        add(rs1labela);
        add(staniceIzbor1, "wrap");
        add(rs2labela);
        add(staniceIzbor2, "wrap");
        add(cenaKatALabela);
        add(cenaKatA, "wrap");
        add(cenaKatBLabela);
        add(cenaKatB, "wrap");
        add(cenaKatCLabela);
        add(cenaKatC, "wrap");
        add(cenaKatDLabela);
        add(cenaKatD, "wrap");
        add(dodajDugme);
    }

    public boolean dodajDeonicu(RadnaStanica rs1, RadnaStanica rs2, String c1, String c2, String c3, String c4){
        Deonica d = new Deonica(rs1, rs2, String.valueOf(model.getDeonice().size() + 1));
        boolean uspeh = model.dodajDeonicu(d);
        if (uspeh){
            //FajlMenadzer.snimiDeonice("deonice.txt", model);
            Map<KategorijaVozila, Integer> ceneKat = new HashMap<KategorijaVozila, Integer>();
            ceneKat.put(KategorijaVozila.A, Integer.valueOf(c1));
            ceneKat.put(KategorijaVozila.B, Integer.valueOf(c2));
            ceneKat.put(KategorijaVozila.C, Integer.valueOf(c3));
            ceneKat.put(KategorijaVozila.D, Integer.valueOf(c4));
            NaplatneCene cene = new NaplatneCene(new Date(), null, ceneKat, "1");
            d.setTrenutneCene(cene);
            d.getNaplatneCene().add(cene);
            rs2.dodajDeonicu(d);
        }
        return uspeh;
    }
}
