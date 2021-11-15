package mypackage;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.Scanner;

public class Bill_data extends  JFrame {
    JLabel lbl_heading;
    JLabel lbl_id;
    JLabel lbl_f_name;
    JLabel lbl_bill_amount;
    JLabel lbl_meter_no;
    JTextField txtfield_id;
    JTextField txtfield_f_name;
    JTextField txtfield_bill_amount;
    JTextField txtfield_meter_no;
    JButton btn_insert;
    JButton btn_update;
    JButton btn_delete;

    Bill_data() {
        lbl_heading=new JLabel("ADDING AND DLETE YOUR RECORD");
        lbl_heading.setBounds(70,0,500,200);
        lbl_heading.setFont(new Font("Akaya Telivigala",Font.BOLD,30));
        lbl_heading.setForeground(Color.BLACK);
        lbl_id=new JLabel("Id");
        lbl_id.setFont(new Font("Akaya Telivigala",Font.BOLD,20));
        lbl_id.setForeground(Color.BLACK);
        lbl_id.setBounds(40,140,100,50);
        lbl_f_name=new JLabel("FName");
        lbl_f_name.setFont(new Font("Akaya Telivigala",Font.BOLD,20));
        lbl_f_name.setForeground(Color.BLACK);
        lbl_f_name.setBounds(40,220,100,50);
        lbl_bill_amount=new JLabel("Bill Amount");
        lbl_bill_amount.setFont(new Font("Akaya Telivigala",Font.BOLD,20));
        lbl_bill_amount.setForeground(Color.BLACK);
        lbl_bill_amount.setBounds(40,300,100,50);
        lbl_meter_no=new JLabel("Meter No");
        lbl_meter_no.setFont(new Font("Akaya Telivigala",Font.BOLD,20));
        lbl_meter_no.setForeground(Color.BLACK);
        lbl_meter_no.setBounds(40,380,100,50);
        txtfield_id=new JTextField();
        txtfield_id.setBounds(150,140,240,50);
        txtfield_f_name=new JTextField();
        txtfield_f_name.setBounds(150,220,240,50);
        txtfield_bill_amount=new JTextField();
        txtfield_bill_amount.setBounds(150,300,240,50);
        txtfield_meter_no=new JTextField();
        txtfield_meter_no.setBounds(150,380,240,50);
        btn_insert=new JButton("Insert");
        btn_insert.setBounds(450,320,80,50);
        btn_update=new JButton("Update");
        btn_update.setBounds(450,300,80,50);
        btn_delete=new JButton("Delete");
        btn_delete.setBounds(450,380,80,50);
        this.add(lbl_heading);
        this.add(lbl_id);
        this.add(txtfield_id);
        this.add(lbl_f_name);
        this.add(txtfield_f_name);
        this.add(btn_insert);
        this.add(lbl_bill_amount);

        this.add(txtfield_bill_amount);
        // this.add(btn_update);
        this.add(lbl_meter_no);
        this.add(txtfield_meter_no);
        this.add(btn_delete);
        btn_insert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    theQuery("insert into bill_project (fname,amount,meter_no) values('"+txtfield_f_name.getText()+" ',' "+txtfield_bill_amount.getText()+"',"+txtfield_meter_no.getText()+")");
                }
                catch(Exception ex){

                }
            }
        });
//        btn_update.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                try{
//                  theQuery("update i_d_v set fame = '"+txtfield_f_name.getText()+"',lname = '"+ txtfield_L_name.getText()+" ' , age ="+txtfield_age.getText()+"where id ="+txtfield_id.getText());
//                }
//                catch(Exception ex){
//
//                }
//            }
//        });
        btn_delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    theQuery("delete from bill_project where id = "+txtfield_id.getText());
                }
                catch(Exception ex){

                }
            }
        });
        this.getContentPane().setBackground(Color.ORANGE);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,500);
        this.setVisible(true);
    }
    public void theQuery(String query){
        Connection con=null;
        Statement st=null;
        try{
            con= DriverManager.getConnection("jdbc:mysql://localhost/Electricity_Bill_Project","root","");
            st=con.createStatement();
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"Query Excecuted");
            this.dispose();
            Record r=new Record();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }

    }
}