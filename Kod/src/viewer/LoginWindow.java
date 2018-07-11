package viewer;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginWindow extends JFrame{

    public LoginWindow() throws HeadlessException {
        setSize(450, 200);
        setLayout(new MigLayout("wrap 5"));
        JLabel welcomeLabel = new JLabel("WELCOME");
        JLabel usernameLabel = new JLabel("Username: ");
        JTextField usernameField = new JTextField(15);
        JLabel passwordLabel = new JLabel("Password: ");
        JPasswordField passwordField = new JPasswordField(15);
        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                
            }
        });

        add(welcomeLabel, "span 2, wrap");
        add(usernameLabel);
        add(usernameField, "wrap");
        add(passwordLabel);
        add(passwordField, "wrap");
        add(loginButton);
        setVisible(true);
    }
}
