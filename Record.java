package mypackage;
import java.awt.*;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
public class Record extends JFrame implements ActionListener {
    JTable t;
    JButton btn_database_ok;
    JButton btn_database_delete;
    public String data[][]=new String[20][4];
    Record(){
        this.getContentPane().setBackground(Color.BLACK);
        btn_database_delete =new JButton("Delete");
        btn_database_delete.setBounds(130,350,80,50);
        btn_database_ok =new JButton("ok");
        btn_database_ok.setBounds(260,350,70,50);

        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String column[]={"id","fname","amount","meter_no"};
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("ok");
            Connection connet=DriverManager.getConnection("jdbc:mysql://localhost:3306/Electricity_Bill_Project","root","");
            if(connet!=null)
                System.out.println("connected");

            Statement s=connet.createStatement();
            ResultSet rs=s.executeQuery("Select * from bill_project");
            int i=0;
            while(rs.next()){
                data[i][0]=rs.getString(1);
                data[i][1]=rs.getString(2);
                data[i][2]=rs.getString(3);
                data[i][3]=rs.getString(4);
                i++;

            }
            t=new JTable(data,column);
            this.add(t);
            this.add(btn_database_ok);
            this.add(btn_database_delete);
            btn_database_delete.addActionListener(this);
btn_database_ok.addActionListener(this);
            JScrollPane sp=new JScrollPane(t);
            this.add(sp);
            this.getContentPane().setBackground(Color.BLACK);
            this.setVisible(true);

        }
        catch(Exception e){

        }
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==btn_database_ok){
            this.dispose();
Close c=new Close();
        }
        else if(e.getSource()==btn_database_delete){
            this.dispose();

            Bill_data bd=new Bill_data();
        }
    }


}
