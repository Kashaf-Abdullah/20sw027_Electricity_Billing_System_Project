package mypackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import static java.lang.Thread.sleep;

public class Installation extends JFrame  implements  ActionListener
{
    ImageIcon image_p;
    JLabel label_icon_p;
    JProgressBar p;
    JLabel label;
    JButton button_p;
    //time
    JLabel l_t;
    Date d;
    SimpleDateFormat smf;
    String s;

    Installation() {
        l_t = new JLabel("");
        l_t.setBounds(350, 50, 200, 200);

        label_icon_p = new JLabel();
        image_p = new ImageIcon("e_bill5.png");
        label_icon_p.setBounds(100, 10, 450, 200);
        label_icon_p.setIcon(image_p);
        button_p = new JButton("20SW027 PROJECT");
        button_p.setBounds(55, 350, 350, 70);
 button_p.setForeground(Color.BLACK);
 button_p.setBackground(Color.getHSBColor(100,183,100));
 button_p.setFont(new Font("ALGERIAN", Font.BOLD, 30));
        label = new JLabel("IN PROCESS...");
        label.setBounds(130, 180, 250, 300);
        label.setFont(new Font("ALGERIAN", Font.BOLD, 30));
        label.setForeground(Color.black);
        p = new JProgressBar();
        p.setBounds(50, 240, 350, 50);
        p.setValue(0);
        p.setStringPainted(true);
        this.setLayout(null);
        this.getContentPane().setBackground(Color.getHSBColor(100,380,100));
        this.add(l_t);
        this.add(label_icon_p);
        this.add(p);
        this.add(label);
        this.add(button_p);
button_p.addActionListener(this);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setSize(500, 500);

    }
    public void update() {
        int i = 0;
        while (i <= 100) {
            p.setValue(i);
            i++;
            try {
                sleep(100);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button_p){
            System.out.println("heello");
            button_p.addActionListener(this);
        this.dispose();
       // Electricity_Bill el=new Electricity_Bill();

        Extra ex=new Extra();}
    }


}

