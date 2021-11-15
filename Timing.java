package mypackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.TimerTask;
import java.util.Timer;

public class Timing extends JFrame implements ActionListener {
    JLabel labelp1;
    JLabel labelp2;
    JLabel labelp3;
    ImageIcon image1;
    JLabel label_timing;
    JLabel label_time;
    JButton button_next;
    Timing(){
        button_next=new JButton("next");
        button_next.setBounds(0,390,550,30);
        button_next.setForeground(Color.BLACK);
        button_next.setBackground(Color.ORANGE);
        label_time=new JLabel("Check bill due date");
        label_time.setBounds(310,5,230,300);
        label_time.setFont(new Font("Algerian",Font.BOLD,20));

        label_time.setForeground(Color.YELLOW);
        label_timing=new JLabel();
        label_timing.setText("time is remining");
        label_timing.setForeground(Color.pink);
        label_timing.setBackground(Color.BLACK);
        label_timing.setFont(new Font("Algerian ",Font.BOLD,45));
        label_timing.setOpaque(true);
        label_timing.setBounds(100,200,350,250);

        Timer timer=new Timer();

        TimerTask task=new TimerTask() {
            @Override
            public void run() {

                System.out.println("tIME IS FINISHED");
                label_timing.setText("Time is finished");
                label_timing.setForeground(Color.PINK);
                label_timing.setBackground(Color.BLACK);
                label_timing.setFont(new Font("Algerian ",Font.BOLD,45));
                label_timing.setOpaque(true);
                label_timing.setBounds(100,200,350,150);
            }
        };
        Calendar date= Calendar.getInstance();
        date.set(Calendar.YEAR,2021);
        date.set(Calendar.MONTH,Calendar.NOVEMBER);
        date.set(Calendar.DAY_OF_MONTH,9);
        date.set(Calendar.HOUR_OF_DAY,16);
        date.set(Calendar.MINUTE,13);
        date.set(Calendar.SECOND,0);

        date.set(Calendar.MILLISECOND,0);

        timer.schedule(task,date.getTime());


        labelp1=new JLabel("");
        image1=new ImageIcon("e_bill6.jfif");

        labelp1.setBounds(0,0,300,300);
        labelp1.setIcon(image1);
        labelp3=new JLabel();
        this.getContentPane().setBackground(Color.BLACK);

        this.add(labelp1);
        this.add(label_time);
        this.add(label_timing);
        this.add(button_next);
        button_next.addActionListener(this);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setSize(550,500);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button_next){
            this.dispose();
            Bill b=new Bill();
        }
    }
}
