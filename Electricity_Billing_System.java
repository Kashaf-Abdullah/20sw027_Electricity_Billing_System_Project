package mypackage;

import javax.swing.*;
import java.awt.*;

import static java.lang.Thread.sleep;

public class Electricity_Billing_System extends JFrame {
    JLabel label_login_pic;
    ImageIcon i;
    JLabel label_backgroundpic;
    ImageIcon i2;
    JLabel label_backgroundpic2;
    ImageIcon i3;
    JLabel label_backgroundpic3;
   ImageIcon i4;
   JLabel label_backgroundpic4;
    Electricity_Billing_System(){

        label_login_pic=new JLabel("Eletricity Billing System");
        label_login_pic.setBounds(95,0,1500,150);
        label_login_pic.setFont(new Font("ALGERIAN",Font.BOLD,88));
        label_login_pic.setForeground(Color.getHSBColor(100,183,100));
        label_backgroundpic=new JLabel();
        i=new ImageIcon("electricity.jfif");
        label_backgroundpic.setBounds(740,165,550,550);
        this.add(label_login_pic);
       // this.add(label_backgroundpic);
        //label_backgroundpic.setIcon(i);
//
//        label_backgroundpic2=new JLabel();
//        i2=new ImageIcon("e_bill6.jfif");
//        label_backgroundpic2.setBounds(390,165,550,550);
//        this.add(label_login_pic);
//        this.add(label_backgroundpic);
//        label_backgroundpic.setIcon(i);
//        this.add(label_backgroundpic2);
//        label_backgroundpic2.setIcon(i2);
//
//        label_backgroundpic3=new JLabel();
//        i3=new ImageIcon("e_bill1.jfif");
//        label_backgroundpic3.setBounds(1090,165,550,550);
//        this.add(label_backgroundpic3);
//        label_backgroundpic3.setIcon(i3);


        label_backgroundpic4=new JLabel();
        i4=new ImageIcon("e_bill3.png");
        label_backgroundpic4.setBounds(110,0,1000,1000);
        this.add(label_backgroundpic4);
        label_backgroundpic4.setIcon(i4);

        this.setLayout(null);
        this.getContentPane().setBackground(Color.BLACK);
        this.setTitle("Electricity Billing System");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(2500,1500);
        try{
            sleep(5000);
            Log_In lg=new Log_In() ;
        }
        catch(Exception ex){

        }
    }
}
