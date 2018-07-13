package viewer;

import model.Centrala;
import model.KategorijaVozila;
import model.TipIzvestaja;
import net.miginfocom.swing.MigLayout;
import org.jdesktop.swingx.JXDatePicker;

import javax.swing.*;

public class IzvestajKatVozilaWindow extends JFrame {
    private Centrala model;
    private TipIzvestaja tipIzvestaja;
    IzvestajKatVozilaWindow(Centrala model, TipIzvestaja tipIzvestaja){
        setSize(800,600);
        setLayout(new MigLayout("wrap 5"));
        this.model = model;
        this.tipIzvestaja = tipIzvestaja;
        JLabel unosLabela = new JLabel("Unos podataka za izvestaj");
        JLabel pocetniDatumLabela = new JLabel("Pocetni datum");
        JXDatePicker pocetniDatumIzbor = new JXDatePicker();

        JLabel krajnjiDatumLabela = new JLabel("Krajnji datum");
        JXDatePicker krajnjiDatumIzbor = new JXDatePicker();

        JLabel kategorijaVozilaLabela = new JLabel("Kategorija vozila");
        JComboBox<KategorijaVozila> kategorijaVozilaComboBox = new JComboBox<>();
        kategorijaVozilaComboBox.addItem(KategorijaVozila.A);
        kategorijaVozilaComboBox.addItem(KategorijaVozila.B);
        kategorijaVozilaComboBox.addItem(KategorijaVozila.C);
        kategorijaVozilaComboBox.addItem(KategorijaVozila.D);

        JButton napraviIzvestajDugme = new JButton("Napravi izvestaj");

        add(unosLabela, "wrap");
        add(pocetniDatumLabela);
        add(pocetniDatumIzbor, "wrap");
        add(krajnjiDatumLabela);
        add(krajnjiDatumIzbor, "wrap");
        add(kategorijaVozilaLabela);
        add(kategorijaVozilaComboBox, "wrap");
        add(napraviIzvestajDugme);
    }
}

