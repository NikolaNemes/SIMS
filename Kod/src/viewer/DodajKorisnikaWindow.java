package viewer;

import UI.FajlMenadzer;
import model.Centrala;
import model.Korisnik;
import model.TipKorisnika;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DodajKorisnikaWindow extends JFrame {
    private Centrala model;

    public DodajKorisnikaWindow(Centrala model) {
        this.model = model;
        setSize(400, 300);
        setLayout(new MigLayout("wrap 5"));
        JLabel unosLabela = new JLabel("Unos podataka za novog korisnika");
        JLabel korisnickoImeLabela = new JLabel("Korisnicko ime:");
        JTextField korisnickoIme = new JTextField(10);
        JLabel lozinkaLabela = new JLabel("Lozinka:");
        JPasswordField lozinka = new JPasswordField(10);
        JLabel imeLabela = new JLabel("Ime:");
        JTextField ime = new JTextField(10);
        JLabel prezimeLabela = new JLabel("Prezime:");
        JTextField prezime = new JTextField(10);
        JLabel tipKorisnikaLabela = new JLabel("Tip korisnika:");
        TipKorisnika t1 = TipKorisnika.RADNIK_U_CENTRALI;
        TipKorisnika t2 = TipKorisnika.RADNIK_U_STANICI;
        TipKorisnika t3 = TipKorisnika.SEF_STANICE;
        TipKorisnika tipovi[] = {t1, t2, t3};
        JComboBox tipKorisnika = new JComboBox(tipovi);
        DodajKorisnikaWindow temp = this;

        JButton dodajDugme = new JButton("Dodaj korisnika");
        dodajDugme.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                boolean uspeh = dodajKorisnika(korisnickoIme.getText(), lozinka.getText(), ime.getText(), prezime.getText(),
                        (TipKorisnika) tipKorisnika.getItemAt(tipKorisnika.getSelectedIndex()));
                if (uspeh){
                    JOptionPane.showMessageDialog(temp, "Korisnik uspesno dodat");
                }else{
                    JOptionPane.showMessageDialog(temp, "Korisnik sa tim korisnickim imenom vec postoji");
                }
                setVisible(false);
            }
        });

        add(unosLabela, "wrap");
        add(korisnickoImeLabela);
        add(korisnickoIme, "wrap");
        add(lozinkaLabela);
        add(lozinka, "wrap");
        add(imeLabela);
        add(ime, "wrap");
        add(prezimeLabela);
        add(prezime, "wrap");
        add(tipKorisnikaLabela);
        add(tipKorisnika, "wrap");
        add(dodajDugme, "span 2");
    }

    public boolean dodajKorisnika(String korisnickoIme, String lozinka, String ime, String prezime, TipKorisnika tipKorisnika){
        Korisnik k = new Korisnik(tipKorisnika, korisnickoIme, lozinka, ime, prezime, korisnickoIme);
        boolean uspeh = model.dodajKorisnika(k);
        if (uspeh) {
            FajlMenadzer.snimiKorisnike("korisnici.txt", model);
        }
        return uspeh;
    }
}
