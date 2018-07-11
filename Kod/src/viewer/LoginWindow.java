package viewer;

import controller.LoginActions;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginWindow extends JFrame{
    LoginActions controller;

    public void setController(LoginActions controller) {
        this.controller = controller;
    }

    public LoginWindow() {
        setSize(450, 200);
        setLayout(new MigLayout("wrap 5"));
        JLabel welcomeLabel = new JLabel("WELCOME");
        JLabel usernameLabel = new JLabel("Username: ");
        JTextField usernameField = new JTextField(15);
        JLabel passwordLabel = new JLabel("Password: ");
        JPasswordField passwordField = new JPasswordField(15);
        JButton loginButton = new JButton("Login");
        JLabel loginFailed = new JLabel("Wrong username or password");
        loginFailed.setVisible(false);
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                controller.checkUser(usernameField.getText(), passwordField.getText());
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
