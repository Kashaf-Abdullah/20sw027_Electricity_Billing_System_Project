package mypackage;

import javax.swing.*;
import java.awt.*;

import static java.lang.Thread.sleep;

public class Electricity_Bill extends JFrame {
    JLabel label_login_pic;
    ImageIcon i;
    JLabel label_backgroundpic;
    Electricity_Bill(){

        label_login_pic=new JLabel("Eletricity Billing System");
        label_login_pic.setBounds(5,0,500,150);
        label_login_pic.setFont(new Font("ALGERIAN",Font.BOLD,34));
        label_login_pic.setForeground(Color.orange);
        label_backgroundpic=new JLabel();
        i=new ImageIcon("e_bill6.jfif");
        label_backgroundpic.setBounds(110,60,250,250);
        this.add(label_login_pic);
        this.add(label_backgroundpic);
        label_backgroundpic.setIcon(i);

        this.getContentPane().setBackground(Color.BLACK);
        this.setTitle("Electricity Billing System");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(500,500);
try{
    sleep(5000);

    this.dispose();
    Log_In l=new Log_In();

}
catch(Exception e){
    System.out.println("Error");
}
    }
}
