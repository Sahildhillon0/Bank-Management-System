package Bank.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {

    JButton Login, clear , Signup ;
    JTextField cardNoField  ;
    JPasswordField pinField ;

    Login(){

        setTitle("ATM Bank.Management.System.Login");
        setLayout(null);
        getContentPane().setBackground(Color.white);

        ImageIcon I1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image I2 = I1.getImage().getScaledInstance(100,100, java.awt.Image.SCALE_SMOOTH);
        ImageIcon I3 = new ImageIcon(I2);

        JLabel label = new JLabel(I3);
        label.setBounds(70, 10, 100, 100);
        add(label);

        JLabel text = new JLabel("Welcome to ATM");
        text.setBounds(200, 14, 600,100);
        text.setFont(new Font("Osward", Font.BOLD, 38));
        add(text);

        JLabel Cardno = new JLabel("Card Number : ");
        Cardno.setBounds(100, 120, 200,100);
        Cardno.setFont(new Font("Railway", Font.BOLD, 28));
        add(Cardno);

        cardNoField = new JTextField();
        cardNoField.setBounds(320, 157, 250, 30);
        add(cardNoField);

        JLabel Password = new JLabel("PIN : ");
        Password.setBounds(100, 170, 200,100);
        Password.setFont(new Font("Railway", Font.BOLD, 28));
        add(Password);

        pinField = new JPasswordField();
        pinField.setBounds(320, 207, 250, 30);
        add(pinField);

        Login = new JButton("LOGIN");
        Login.setBounds(320, 270, 110, 30);
        Login.setBackground(Color.BLACK);
        Login.setForeground(Color.WHITE);
        Login.addActionListener(this);
//        Login.setFont(new Font("Railway", Font.BOLD, 28));
        add(Login);

        clear = new JButton("Clear");
        clear.setBounds(460, 270, 110, 30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
//        clear.setFont(new Font("Railway", Font.BOLD, 28));
        add(clear);

        Signup = new JButton("SIGNUP");
        Signup.setBounds(320, 315, 250, 30);
        Signup.setBackground(Color.BLACK);
        Signup.setForeground(Color.WHITE);
        Signup.addActionListener(this);
//        clear.setFont(new Font("Railway", Font.BOLD, 28));
        add(Signup);

        setSize(800, 480);
        setLocation(380,180);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == Login){
            System.out.println("Login");
        }
        else if(ae.getSource() == clear){
            System.out.println("clear");
            cardNoField.setText("");
            pinField.setText("");
        }
        else if(ae.getSource() == Signup){
            System.out.println("Signup");
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
