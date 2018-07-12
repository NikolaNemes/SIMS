package viewer;

import model.TipKorisnika;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DodajKorisnikaWindow extends JFrame {
    public DodajKorisnikaWindow() {
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


        JButton dodajDugme = new JButton("Dodaj korisnika");
        dodajDugme.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

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
}
