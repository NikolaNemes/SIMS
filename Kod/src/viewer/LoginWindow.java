package viewer;

import controller.LoginActions;
import model.Centrala;
import model.Korisnik;
import model.TipKorisnika;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginWindow extends JFrame{
    private Centrala model;
    private int brPokusaja = 0;
    public LoginWindow(Centrala model) {
        this.model = model;
        setSize(450, 200);
        setLayout(new MigLayout("wrap 5"));
        JLabel dobroDosliLabela = new JLabel("DOBRO DOSLI");
        JLabel korisnickoImeLabela = new JLabel("Korisnicko ime: ");
        JTextField korisnickoImePolje = new JTextField(15);
        JLabel lozinkaLabela = new JLabel("Lozinka: ");
        JPasswordField lozinkaPolje = new JPasswordField(15);
        JButton loginDugme = new JButton("Uloguj se");
        LoginWindow temp = this;
        loginDugme.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                Korisnik k = model.pronadjiKorisnika(korisnickoImePolje.getText());
                if (k != null){
                    if (!k.isAktivan()){
                        if (brPokusaja == 2) {
                            JOptionPane.showMessageDialog(temp, "Korisnik je obrisan. Pogresili ste 3 puta. Zatvaranje");
                            temp.setVisible(false);
                            System.exit(0);
                        }else{
                            JOptionPane.showMessageDialog(temp, "Korisnik je obrisan");
                            brPokusaja++;
                        }
                    }
                    if (k.getLozinka().equals(lozinkaPolje.getText())){
                        if (k.getTip().equals(TipKorisnika.RADNIK_U_CENTRALI)){
                            CentralWorkerWindow glavniProzor = new CentralWorkerWindow(model);
                            glavniProzor.setVisible(true);
                        }
                        else {
                            IzborRadneStanice izborRadneStanice = new IzborRadneStanice(model, k.getTip());
                            izborRadneStanice.setVisible(true);
                        }

                        temp.setVisible(false);
                    }else{
                        if (brPokusaja == 2) {
                            JOptionPane.showMessageDialog(temp, "Pogresna lozinka. Pogresili ste 3 puta. Zatvaranje");
                            temp.setVisible(false);
                            System.exit(0);
                        }else{
                            JOptionPane.showMessageDialog(temp, "Pogresna lozinka");
                            brPokusaja++;
                        }
                    }
                }else{
                    if (brPokusaja == 2){
                        JOptionPane.showMessageDialog(temp, "Pogresno korisnicko ime. Pogresili ste 3 puta. Zatvaranje");
                        temp.setVisible(false);
                        System.exit(0);
                    }else {
                        JOptionPane.showMessageDialog(temp, "Pogresno korisnicko ime");
                        brPokusaja++;
                    }
                }
                korisnickoImePolje.setText("");
                lozinkaPolje.setText("");
            }
        });

        add(dobroDosliLabela, "span 2, wrap");
        add(korisnickoImeLabela);
        add(korisnickoImePolje, "wrap");
        add(lozinkaLabela);
        add(lozinkaPolje, "wrap");
        add(loginDugme);
    }


}
