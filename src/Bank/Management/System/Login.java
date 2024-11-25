package Bank.Management.System;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {

    Login(){

        setTitle("ATM Bank.Management.System.Login");

        ImageIcon I1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image I2 = I1.getImage().getScaledInstance(100,100, java.awt.Image.SCALE_SMOOTH);
        ImageIcon I3 = new ImageIcon(I2);

        JLabel label = new JLabel(I3);
        add(label);

        setSize(800, 480);
        setLocation(380,180);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Login();
    }
}
