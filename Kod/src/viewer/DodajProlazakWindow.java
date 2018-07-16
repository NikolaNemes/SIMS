package viewer;

import model.Deonica;
import model.KategorijaVozila;
import model.ProlazakVozila;
import model.RadnaStanica;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class DodajProlazakWindow extends JFrame {
    private RadnaStanica model;
    DodajProlazakWindow(RadnaStanica model){
        this.model = model;
        setSize(800, 600);
        setLayout(new MigLayout("wrap 5"));
        String kolone[] = {"Id", "Polazno mesto"};
        int brAktivnihDeonica = 0;
        for (int i = 0; i < model.getDeonice().size(); i++){
            if (model.getDeonice().get(i).isAktivna()){
                brAktivnihDeonica++;
            }
        }
        String podaci[][] = new String[brAktivnihDeonica][2];
        int brDodatihDeonica = 0;
        for (int i = 0; i < model.getDeonice().size(); i++){
            Deonica d = model.getDeonice().get(i);
            if (d.isAktivna()){
                podaci[brDodatihDeonica][0] = d.getId();
                podaci[brDodatihDeonica][1] = d.getPolaznaStanica().getMesto();
                brDodatihDeonica++;
            }
        }
        JLabel deoniceLabela = new JLabel("Izbor deonice");
        JTable deoniceTabela = new JTable(podaci, kolone);
        deoniceTabela.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        JScrollPane pane = new JScrollPane(deoniceTabela);

        JLabel kategorijaVozilaLabela = new JLabel("Kategorija vozila");
        JComboBox<KategorijaVozila> kategorijaVozilaComboBox = new JComboBox<>();
        kategorijaVozilaComboBox.addItem(KategorijaVozila.A);
        kategorijaVozilaComboBox.addItem(KategorijaVozila.B);
        kategorijaVozilaComboBox.addItem(KategorijaVozila.C);
        kategorijaVozilaComboBox.addItem(KategorijaVozila.D);

        JLabel registracijaLabela = new JLabel("Registracija");
        JTextField registracijaPolje = new JTextField(10);
        DodajProlazakWindow temp = this;

        JButton dodajDugme = new JButton("Dodaj prolazak");
        dodajDugme.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int red = deoniceTabela.getSelectedRow();
                if (red == -1){
                    JOptionPane.showMessageDialog(temp, "Morate izabrati deonicu");
                }else {
                    KategorijaVozila kat = kategorijaVozilaComboBox.getItemAt(kategorijaVozilaComboBox.getSelectedIndex());
                    Deonica d = model.pronadjiDeonicu((String) deoniceTabela.getValueAt(deoniceTabela.getSelectedRow(), 0));
                    int cena = d.getTrenutneCene().getCene().get(kat);
                    ProlazakVozila p = new ProlazakVozila(d, kat, new Date(), registracijaPolje.getText(),
                            String.valueOf(150 + model.getProlasci().size()), cena);
                    model.dodajProlazakVozila(p);
                    JOptionPane.showMessageDialog(temp, "Prolazak uspesno dodat");
                    setVisible(false);
                }
            }
        });

        add(deoniceLabela, "wrap");
        add(pane, "wrap");
        add(kategorijaVozilaLabela, "split 2");
        add(kategorijaVozilaComboBox, "wrap");
        add(registracijaLabela, "split 2");
        add(registracijaPolje, "wrap");
        add(dodajDugme, "wrap");
    }
}
