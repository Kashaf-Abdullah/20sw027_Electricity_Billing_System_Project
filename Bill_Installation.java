package mypackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import static java.lang.Thread.sleep;

public class Bill_Installation extends JFrame implements Runnable,ActionListener
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

    Bill_Installation() {
        l_t = new JLabel("DATE");
        l_t.setBounds(350, 50, 200, 200);

        label_icon_p = new JLabel();
        image_p = new ImageIcon("e_bill5.png");
        label_icon_p.setBounds(100, 10, 400, 200);
        label_icon_p.setIcon(image_p);
        button_p = new JButton("Next");

        button_p.setBounds(180, 350, 70, 30);

        label = new JLabel("IN PROCESS...");
        label.setBounds(130, 180, 250, 300);
        label.setFont(new Font("ALGERIAN", Font.BOLD, 30));
        label.setForeground(Color.black);
        p = new JProgressBar();
        p.setBounds(50, 240, 350, 50);
        p.setValue(0);
        p.setStringPainted(true);
        this.setLayout(null);
        this.getContentPane().setBackground(Color.PINK);
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
    void uo() {


        while (true) {
            d = new Date();
            SimpleDateFormat format = new SimpleDateFormat("E,MM-DD-YY,hh:mm:ss");
            s = format.format(d);
            try {
                sleep(1000);
                l_t.setText(s);
            } catch (Exception e) {
            }
        }
    }
    @Override
    public void run() {
        try{
            //      sleep(1000);
            update();
            //    sleep(1000);
            uo();

        }
        catch(Exception e){

        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button_p){
            this.dispose();
            Extra ex=new Extra();
        }
    }
}

