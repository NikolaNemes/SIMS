package viewer;

import model.Centrala;
import model.Korisnik;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IzbrisiKorisnikaWindow extends JFrame {
    private Centrala model;
    IzbrisiKorisnikaWindow(Centrala model){
        this.model = model;
        setSize(800, 600);
        setLayout(new MigLayout("wrap 5"));
        JLabel izaberiLabela = new JLabel("Izaberite korisnika za brisanje");
        String kolone[] = {"Korisnicko ime", "Ime", "Prezime"};
        int brAktivnihKorisnika = 0;
        for (int i = 0; i < model.getKorisnici().size(); i++){
            if (model.getKorisnici().get(i).isAktivan()){
                brAktivnihKorisnika++;
            }
        }
        String[][] podaci = new String[brAktivnihKorisnika][3];
        int brDodatihKorisnika = 0;
        for (int i = 0; i < model.getKorisnici().size(); i++){
            Korisnik trenutni = model.getKorisnici().get(i);
            if (trenutni.isAktivan()){
                podaci[brDodatihKorisnika][0] = trenutni.getKorisnickoIme();
                podaci[brDodatihKorisnika][1] = trenutni.getIme();
                podaci[brDodatihKorisnika][2] = trenutni.getPrezime();
                brDodatihKorisnika++;
            }
        }
        JTable korisniciTabela = new JTable(podaci, kolone);
        korisniciTabela.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        JScrollPane pane = new JScrollPane(korisniciTabela);

        IzbrisiKorisnikaWindow temp = this;

        JButton obrisiDugme = new JButton("Obrisi korisnika");
        obrisiDugme.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int red = korisniciTabela.getSelectedRow();
                if (red == -1){
                    JOptionPane.showMessageDialog(temp, "Morate izabrati korisnika");
                }else {
                    model.izbrisiKorisnika((String) korisniciTabela.getValueAt(korisniciTabela.getSelectedRow(), 0));
                    JOptionPane.showMessageDialog(temp, "Korisnik uspesno obrisan");
                }
                setVisible(false);
            }
        });

        add(izaberiLabela, "wrap");
        add(pane, "wrap");
        add(obrisiDugme, "wrap");

    }
}
