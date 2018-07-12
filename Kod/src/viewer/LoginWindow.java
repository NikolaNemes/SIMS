package viewer;

import controller.LoginActions;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginWindow extends JFrame{
    private LoginActions controller;

    public void setController(LoginActions controller) {
        this.controller = controller;
    }

    public LoginWindow() {
        setSize(450, 200);
        setLayout(new MigLayout("wrap 5"));
        JLabel welcomeLabel = new JLabel("DOBRO DOSLI");
        JLabel usernameLabel = new JLabel("Korisnicko ime: ");
        JTextField usernameField = new JTextField(15);
        JLabel passwordLabel = new JLabel("Lozinka: ");
        JPasswordField passwordField = new JPasswordField(15);
        JButton loginButton = new JButton("Uloguj se");
        JLabel loginFailed = new JLabel("Pogresno korisnicko ime ili lozinka");
        loginFailed.setVisible(false);
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                //controller.checkUser(usernameField.getText(), passwordField.getText());
                usernameField.setText("");
                passwordField.setText("");
                loginFailed.setVisible(true);
            }
        });

        add(welcomeLabel, "span 2, wrap");
        add(usernameLabel);
        add(usernameField, "wrap");
        add(passwordLabel);
        add(passwordField, "wrap");
        add(loginButton);
        add(loginFailed);
    }
}
