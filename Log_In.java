package mypackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;

import static java.lang.System.exit;
import static java.lang.Thread.sleep;

public class Log_In extends JFrame implements ActionListener {
    JLabel label_pic;
    JLabel label_name;
    JTextField txtfield_name;
    JLabel label_password;
    JPasswordField passwordField_password;
    JButton button_login;
    JButton button_cancel;
Log_In() {

        this.setLocationRelativeTo(null);

        button_cancel = new JButton("Cancel");
button_cancel.setForeground(Color.white);
        button_cancel.setBounds(170, 390, 80, 40);
        button_cancel.setBackground(Color.BLACK);
        button_login = new JButton("Log In");
        button_login.setBounds(280, 390, 80, 40);
    button_login.setForeground(Color.white);
        button_login.setBackground(Color.black);
        label_name = new JLabel("  ID :");
        label_name.setBounds(30, 190, 60, 130);
        label_name.setFont(new Font("Arial", Font.BOLD, 18));
        label_name.setForeground(Color.black);
        txtfield_name = new JTextField();
        txtfield_name.setBounds(150, 230, 240, 40);
        label_password = new JLabel("  Password :");
        label_password.setBounds(30, 220, 160, 180);
        label_password.setFont(new Font("Arial", Font.BOLD, 18));
        label_password.setForeground(Color.black);
        passwordField_password = new JPasswordField();
        passwordField_password.setBounds(150, 290, 240, 40);
        label_pic = new JLabel();
        label_pic.setBounds(120, 0, 280, 240);
        ImageIcon i = new ImageIcon("lllll.jfif");
        label_pic.setIcon(i);
        this.add(label_pic);

        this.add(label_name);
        this.add(txtfield_name);
        this.add(label_password);
        this.add(passwordField_password);
        this.add(button_cancel);
        this.add(button_login);
        button_login.addActionListener(this);
        button_cancel.addActionListener(this);
        this.setLayout(null);
        this.setTitle("Log In");
        this.getContentPane().setBackground(Color.orange);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(550, 500);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button_login) {
           String id=txtfield_name.getText();
            String password=String.valueOf(passwordField_password.getPassword());
            if(id.equals("1")&&password.equals("1"))
            {

            this.dispose();
         Intro in=new Intro();

                FileWriter fw=null;
                try{
                    fw=new FileWriter("Project_Electricity_Bill.txt",true);
                    fw.write("\t\tElectricity Bill\n\n"+"USER ID :"+txtfield_name.getText());
                    fw.close();

                }
                catch (Exception ex){
                    ex.printStackTrace();
                }
            }
            else
                System.out.println("login unsuccessfully");
//                }
        }
        if(e.getSource()==button_cancel){
            this.dispose();
            Close c=new Close();

        }
    }

}
