package viewer;

import javafx.util.Pair;
import model.Centrala;
import model.KategorijaVozila;
import model.ProlazakVozila;
import model.TipIzvestaja;
import net.miginfocom.swing.MigLayout;
import org.jdesktop.swingx.JXDatePicker;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class IzvestajSvaVozilaWindow extends JFrame {
    private Centrala model;
    private TipIzvestaja tipIzvestaja;
    IzvestajSvaVozilaWindow(Centrala model, TipIzvestaja tipIzvestaja){
        setSize(800,600);
        setLayout(new MigLayout("wrap 5"));
        this.model = model;
        this.tipIzvestaja = tipIzvestaja;
        JLabel unosLabela = new JLabel("Unos podataka za izvestaj");
        JLabel pocetniDatumLabela = new JLabel("Pocetni datum");
        JXDatePicker pocetniDatumIzbor = new JXDatePicker();
        pocetniDatumIzbor.setFormats("dd.MM.yyyy");

        JLabel krajnjiDatumLabela = new JLabel("Krajnji datum");
        JXDatePicker krajnjiDatumIzbor = new JXDatePicker();
        krajnjiDatumIzbor.setFormats("dd.MM.yyyy");

        JLabel prolasciLabela = new JLabel("Svi prolasci");
        JLabel sumaLabela;
        if (tipIzvestaja.equals(TipIzvestaja.BROJ_VOZILA)){
            sumaLabela = new JLabel("Broj vozila: ");
        }else{
            sumaLabela = new JLabel("Zarada: ");
        }

        JButton napraviIzvestajDugme = new JButton("Napravi izvestaj");
        napraviIzvestajDugme.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Pair<ArrayList<ProlazakVozila>, Integer> izvestaj = null;
                if (tipIzvestaja.equals(TipIzvestaja.BROJ_VOZILA)) {
                    izvestaj = model.izvestajBrojVozila(pocetniDatumIzbor.getDate(), krajnjiDatumIzbor.getDate());
                }else{
                    izvestaj = model.izvestajIznosNovca(pocetniDatumIzbor.getDate(), krajnjiDatumIzbor.getDate());
                }

                String kolone[] = {"Id", "Pocetna stanica", "Krajnja stanica", "Registracija", "Datum", "Kategorija", "Cena"};
                String podaci[][] = new String[izvestaj.getKey().size()][7];
                SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
                for (int i = 0; i < izvestaj.getKey().size(); i++){
                    podaci[i][0] = izvestaj.getKey().get(i).getId();
                    podaci[i][1] = izvestaj.getKey().get(i).getPredjenaDeonica().getPolaznaStanica().toString();
                    podaci[i][2] = izvestaj.getKey().get(i).getPredjenaDeonica().getDolaznaStanica().toString();
                    podaci[i][3] = izvestaj.getKey().get(i).getRegistracija();
                    podaci[i][4] = sdf.format(izvestaj.getKey().get(i).getVreme());
                    podaci[i][5] = izvestaj.getKey().get(i).getKategorija().toString();
                    podaci[i][6] = String.valueOf(izvestaj.getKey().get(i).getCena());
                }

                JTable prolasciTabela = new JTable(podaci, kolone);
                JScrollPane pane = new JScrollPane(prolasciTabela);
                sumaLabela.setText(sumaLabela.getText() + String.valueOf(izvestaj.getValue()));
                add(prolasciLabela, "wrap");
                add(pane, "wrap");
                add(sumaLabela, "wrap");
                napraviIzvestajDugme.setVisible(false);
            }
        });


        add(unosLabela, "wrap");
        add(pocetniDatumLabela, "split 2");
        add(pocetniDatumIzbor, "wrap");
        add(krajnjiDatumLabela, "split 2");
        add(krajnjiDatumIzbor, "wrap");
        add(napraviIzvestajDugme, "wrap");

    }
}