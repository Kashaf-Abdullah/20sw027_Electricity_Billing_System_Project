package mypackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Search_Record extends JFrame implements ActionListener {
    JLabel lbl_heading;
    JLabel lbl_id;
    JLabel lbl_name;
    JLabel lblamount;
    JLabel lbl_meter_no;
    JTextField txtfield_id;
    JTextField txtfield_name;
    JTextField txtfield_amount;
    JTextField txtfield_meterno;
    JButton btn_Search;
   Search_Record(){
        this.setTitle("Record Search");
        btn_Search=new JButton("search");
        btn_Search.setBounds(390,400,90,50);

        txtfield_id=new JTextField();
        txtfield_id.setBounds(120,100,230,40);
        txtfield_id.setForeground(Color.BLACK);
        txtfield_id.setFont(new Font("Calibiri",Font.BOLD,22));
        txtfield_name=new JTextField();
        txtfield_name.setBounds(120,200,230,40);
        txtfield_name.setForeground(Color.BLACK);
        txtfield_name.setFont(new Font("Calibiri",Font.BOLD,22));
        txtfield_amount=new JTextField();
        txtfield_amount.setBounds(120,300,230,40);
        txtfield_amount.setForeground(Color.BLACK);
        txtfield_amount.setFont(new Font("Calibiri",Font.BOLD,22));
        txtfield_meterno=new JTextField();
        txtfield_meterno.setBounds(120,400,230,40);
        txtfield_meterno.setForeground(Color.BLACK);
        txtfield_meterno.setFont(new Font("Calibiri",Font.BOLD,22));
        lbl_heading=new JLabel("Search Your Record");
        lbl_heading.setBounds(50,20,330,70);
        lbl_heading.setForeground(Color.PINK);
        lbl_heading.setFont(new Font("Algerian",Font.BOLD,28));
        lbl_id=new JLabel("Id");
        lbl_id.setBounds(30,100,100,50);
        lbl_id.setForeground(Color.PINK);
        lbl_id.setFont(new Font("Calibiri",Font.BOLD,17));
        lbl_name=new JLabel("Name");
        lbl_name.setBounds(30,200,100,50);
        lbl_name.setForeground(Color.PINK);
        lbl_name.setFont(new Font("Calibiri",Font.BOLD,17));

        lblamount=new JLabel("Amount");
        lblamount.setBounds(30,300,300,70);
        lblamount.setForeground(Color.PINK);
        lblamount.setFont(new Font("Calibiri",Font.BOLD,17));

        lbl_meter_no=new JLabel("Meter No");
        lbl_meter_no.setBounds(30,400,300,70);
        lbl_meter_no.setForeground(Color.PINK);
        lbl_meter_no.setFont(new Font("Calibiri",Font.BOLD,17));

        this.add(lbl_heading);

        this.add(lbl_id);
        this.add(txtfield_id);
        this.add(lbl_name);
        this.add(txtfield_name);
        this.add(lblamount);
        this.add(txtfield_amount);
        this.add(lbl_meter_no);
        this.add(txtfield_meterno);
        this.add(btn_Search);
        btn_Search.addActionListener(this);
        this.setLayout(null);
        this.getContentPane().setBackground(Color.BLACK);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==btn_Search){
            Function f=new Function();
            ResultSet rs=null;
            String name="fname";
            String amount="amount";
            String meterno="meter_no";
            rs=f.find(txtfield_id.getText());
            try{
                if(rs.next()){
                    txtfield_name.setText(rs.getString("fname"));
                    txtfield_amount.setText(rs.getString("amount"));
                    txtfield_meterno.setText(rs.getString("meter_no"));
                }
                else
                    JOptionPane.showMessageDialog(null,"no data for this id");
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(null,ex.getMessage());
            }
        }
    }
    public class Function{
        Connection con=null;
        ResultSet rset=null;
        PreparedStatement ps=null;
        public ResultSet find(String s){
            try{
                con= DriverManager.getConnection("jdbc:mysql://localhost/Electricity_Bill_Project","root","");
                ps=con.prepareStatement("Select * from bill_project where Id =?");
                ps.setString(1,s);
                rset=ps.executeQuery();
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(null,ex.getMessage());
            }
            return rset;
        }

    }
}
