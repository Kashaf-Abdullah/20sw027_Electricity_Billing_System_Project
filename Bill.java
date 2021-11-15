package mypackage;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.FileWriter;
import java.util.Objects;

import mypackage.Intro;
import static java.lang.System.exit;

public class Bill extends JFrame implements ActionListener {
    //JMenu bar
    JMenuBar menubar;
    JMenu search;
    JMenu pay;
    JMenu bill_date;
    JMenu bill_info;
JMenu bill_reord;
    //   JMenu exit;
    JMenu bill_show;
    JMenu home;
    JMenuItem menu_Login;
    JMenuItem menu_info;
JMenuItem add_delete;
JMenuItem record_search;
    JMenuItem menu_check_bill_info;
    JMenuItem menu_HBL_bill_pay;
    JMenuItem menu_check_bill_date;
    JMenuItem menu_bill_print;
    JMenuItem exit;
    //Image:
    JLabel label_image_b;
    ImageIcon img_b;

    int total_bill2;
    int total_bill;
    Intro i;

    //LABELS
    JLabel label_fan_timing;
    JLabel label_light_timing;
    JLabel label_ac_timing;

    JLabel label_fan_qty;
    JLabel label_lights_qty;
    JLabel label_ac_qty;
    JLabel label_bill;
    //JTEXTFIELD
    JTextField textField_fan_qty;
    public JTextField textField_light_qty;
    JTextField textField_ac_qty;
    //COMBO BOX
    JComboBox combobox_fan_timing;
    JComboBox combobox_light_timing;
    JComboBox combobox_ac_timing;
    //JBUTTON
    JButton button_show_bill;
    JButton button_full_bill;
    JButton button_pay;
    //Button for due date
    JButton button_duedate;
    int t_b;

 public   Bill() {
        menubar = new JMenuBar();
         pay = new JMenu("Pay");
        home = new JMenu("Home");
        search=new JMenu("Search");
        bill_info = new JMenu("Bill Info");
        bill_show = new JMenu("Print Bill");
        bill_date = new JMenu(" Bill Date");
        bill_reord=new JMenu("Record");
        //  exit=new JMenu("Exit");
        menu_Login = new JMenuItem("Log In");
        menu_info = new JMenuItem("Info");
        exit = new JMenuItem("Exit");
        add_delete=new JMenuItem("Add and Dlete Record");
        menu_check_bill_info = new JMenuItem("Check Bill Info");
        menu_HBL_bill_pay = new JMenuItem("HBL Online App");
        menu_check_bill_date = new JMenuItem("Check Bill Due Date");
        menu_bill_print = new JMenuItem("Bill Print ");
        record_search=new JMenuItem("Record ");
        i = new Intro();
//Jbutton
        button_duedate = new JButton("due date");
        button_duedate.setBounds(380, 200, 120, 40);
        //image
        label_image_b = new JLabel();
        img_b = new ImageIcon("bbil.jpg");
        label_image_b.setBounds(0, 27, 550, 180);
        label_image_b.setIcon(img_b);

        //LABELS
        label_bill = new JLabel("SHOW BILL ");
        label_bill.setBounds(50, 490, 150, 100);
        label_bill.setForeground(Color.black);
        label_bill.setFont(new Font("Akaya Telivigala", Font.BOLD, 20));
        label_fan_qty = new JLabel("FAN QUANTITY");
        label_fan_qty.setBounds(50, 170, 150, 100);
        label_fan_qty.setForeground(Color.black);
        label_fan_qty.setFont(new Font("Akaya Telivigala", Font.BOLD, 20));
        label_lights_qty = new JLabel("LIGHT QUANTITY");
        label_lights_qty.setBounds(50, 220, 150, 100);
        label_lights_qty.setForeground(Color.black);
        label_lights_qty.setFont(new Font("Akaya Telivigala", Font.BOLD, 20));
        label_ac_qty = new JLabel("AC QUANTITY");
        label_ac_qty.setBounds(50, 270, 150, 100);
        label_ac_qty.setForeground(Color.black);
        label_ac_qty.setFont(new Font("Akaya Telivigala", Font.BOLD, 20));
        label_fan_timing = new JLabel("FAN TIMING");
        label_fan_timing.setBounds(50, 320, 150, 100);
        label_fan_timing.setForeground(Color.black);
        label_fan_timing.setFont(new Font("Akaya Telivigala", Font.BOLD, 20));
        label_light_timing = new JLabel("LIGHT TIMING");
        label_light_timing.setBounds(50, 370, 150, 100);
        label_light_timing.setForeground(Color.black);
        label_light_timing.setFont(new Font("Akaya Telivigala", Font.BOLD, 20));
        label_ac_timing = new JLabel("AC TIMING");
        label_ac_timing.setBounds(50, 420, 150, 100);
        label_ac_timing.setForeground(Color.black);
        label_ac_timing.setFont(new Font("Akaya Telivigala", Font.BOLD, 20));
        // TextField
        textField_fan_qty = new JTextField();
        textField_fan_qty.setBounds(250, 200, 50, 40);

        textField_light_qty = new JTextField();
        textField_light_qty.setBounds(250, 250, 50, 40);

        textField_ac_qty = new JTextField();
        textField_ac_qty.setBounds(250, 300, 50, 40);
        //COMBO BOX
        Integer hours[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24};
        combobox_fan_timing = new JComboBox(hours);
        combobox_fan_timing.setBounds(250, 345, 50, 40);
        combobox_light_timing = new JComboBox(hours);
        combobox_light_timing.setBounds(250, 395, 50, 40);
        combobox_ac_timing = new JComboBox(hours);
        combobox_ac_timing.setBounds(250, 445, 50, 40);
//BUTTON
        button_show_bill = new JButton("Bill amount");
        button_show_bill.setBounds(200, 527, 100, 25);
        button_full_bill = new JButton("BILL");
        button_full_bill.setBounds(267, 515, 70, 50);
        button_pay = new JButton("pay");
        button_pay.setBounds(360, 490, 100, 100);
//this.add(button_duedate);
        this.add(label_image_b);
        this.add(label_fan_qty);
        this.add(textField_fan_qty);
        this.add(label_lights_qty);
        this.add(textField_light_qty);
        this.add(label_ac_qty);
        this.add(textField_ac_qty);
        this.add(label_fan_timing);
        this.add(combobox_fan_timing);

        this.add(label_light_timing);
        this.add(combobox_light_timing);
        this.add(label_ac_timing);
        this.add(combobox_ac_timing);
        this.add(label_bill);
        this.add(button_show_bill);
//this.add(button_full_bill);
//this.add(button_pay);


        menubar.add(home);
        menubar.add(pay);
        menubar.add(bill_info);
        menubar.add(bill_show);
        menubar.add(bill_date);
        menubar.add(exit);
        menubar.add(bill_reord);
  menubar.add(search);
        home.add(menu_Login);
        home.add(menu_info);
        home.add(exit);
        search.add(record_search);
bill_show.add(menu_bill_print);
        bill_info.add(menu_check_bill_info);
        bill_date.add(menu_check_bill_date);
        pay.add(menu_HBL_bill_pay);
        bill_reord.add(add_delete);
        //   bill_date.addActionListener(this);
        // bill_info.addActionListener(this);
        // bill_show.addActionListener(this);
        // home.addActionListener(this);
        // pay.addActionListener(this);
        // exit.addActionListener(this);

        menu_info.addActionListener(this);
        menu_Login.addActionListener(this);
        menu_HBL_bill_pay.addActionListener(this);
        menu_check_bill_date.addActionListener(this);
        menu_check_bill_info.addActionListener(this);
        exit.addActionListener(this);
        menu_bill_print.addActionListener(this);
add_delete.addActionListener(this);
record_search.addActionListener(this);
        this.getContentPane().setBackground(Color.orange);
        button_duedate.addActionListener(this);
        button_show_bill.addActionListener(this);
        button_full_bill.addActionListener(this);
        button_pay.addActionListener(this);
        this.setJMenuBar(menubar);
        this.setLayout(null);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 650);
        this.setLocationRelativeTo(null);
        this.setVisible(true);


    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button_show_bill) {
            String t=textField_ac_qty.getText();
            String t1=textField_fan_qty.getText();
            String t2=textField_light_qty.getText();
            String s=null;
                try{

                 t.equals(s);
                 t1.equals(s);
                 t2.equals(s);


                }
                catch(Exception ex){
                    JOptionPane.showMessageDialog(null,"Fill the requirement");

            }
            String light_qty = textField_light_qty.getText();
            String fan_qty = textField_fan_qty.getText();
            String ac_qty = textField_ac_qty.getText();
            int l_qty = Integer.parseInt(light_qty);
            int f_qty = Integer.parseInt(fan_qty);
            int a_qty = Integer.parseInt(ac_qty);

            int light_timing = (int) combobox_light_timing.getSelectedItem();
            int fan_timing = (int) combobox_fan_timing.getSelectedItem();
            int ac_timing = (int) combobox_ac_timing.getSelectedItem();
            double e_e_watt_hour = ((l_qty * 10 * light_timing) + (f_qty * 60 * fan_timing)+(a_qty * 70 * ac_timing));
            int e_e_kwh = (int) (e_e_watt_hour) / 1000;
            double e_e_kwh_days = e_e_kwh * 31;
            total_bill2 = (int) ((int) e_e_kwh_days * 15.200);
            t_b = total_bill2;
            JOptionPane.showMessageDialog(this, "Total bill :" + total_bill2);

        }

        if (e.getSource() == menu_check_bill_info) {
            String light_qty = textField_light_qty.getText();
            String fan_qty = textField_fan_qty.getText();
            String ac_qty = textField_ac_qty.getText();
            int l_qty = Integer.parseInt(light_qty);
            int f_qty = Integer.parseInt(fan_qty);
            int a_qty = Integer.parseInt(ac_qty);

            int light_timing = (int) combobox_light_timing.getSelectedItem();
            int fan_timing = (int) combobox_fan_timing.getSelectedItem();
            int ac_timing = (int) combobox_ac_timing.getSelectedItem();

            double e_e_watt_hour = ((l_qty * 10 * light_timing) + (f_qty * 60 * fan_timing)+(a_qty * 70 * ac_timing));
            int e_e_kwh = (int) (e_e_watt_hour) / 1000;
            double e_e_kwh_days = e_e_kwh * 31;

            total_bill2 = (int) ((int) e_e_kwh_days * 15.200);
            JOptionPane.showMessageDialog(this, "\nFan quantity :" +
                    textField_fan_qty.getText() + "\n Light quantity :" + textField_light_qty.getText() + "\nAC quantity : " +
                    textField_light_qty.getText() + "\n Fan timing :" + combobox_fan_timing.getSelectedItem() + "\n Light timing :" +
                    combobox_light_timing.getSelectedItem() + "\n AC timing :" + combobox_ac_timing.getSelectedItem() + "\n Total bill :" + total_bill2);
   /* FileWriter fw=null;
    try{
        fw=new FileWriter("Bill4.txt",true);
        fw.write("\n\nAc Quantity :"+textField_ac_qty.getText()+"\n\nFan Quantity :"+textField_fan_qty.getText()+"\n\nLight Quantity :"
                +textField_light_qty.getText()+"\n\nTotal bill :"+total_bill2);
        fw.close();
    }

catch(Exception ex){
        ex.printStackTrace();
}*/

        }
if(e.getSource()==add_delete){
    this.dispose();

    Bill_data bd=new Bill_data();

}
if(e.getSource()==record_search){
    this.dispose();
    Search_Record sr=new Search_Record();
}

        if (e.getSource() == menu_HBL_bill_pay) {
            this.dispose();
            Bill_payment b = new Bill_payment();

        }
        if (e.getSource() == menu_check_bill_date) {
            this.dispose();
            Timing t = new Timing();
        }

        if (e.getSource() == menu_info) {
            this.dispose();

            Intro i = new Intro();
        }
        if (e.getSource() == menu_Login) {
            this.dispose();
            Log_In li = new Log_In();
        }
        if (e.getSource() == exit) {
            exit(0);
        }
        if (e.getSource() == menu_bill_print) {
            String light_qty = textField_light_qty.getText();
            String fan_qty = textField_fan_qty.getText();
            String ac_qty = textField_ac_qty.getText();
            int l_qty = Integer.parseInt(light_qty);
            int f_qty = Integer.parseInt(fan_qty);
            int a_qty = Integer.parseInt(ac_qty);

            int light_timing = (int) combobox_light_timing.getSelectedItem();
            int fan_timing = (int) combobox_fan_timing.getSelectedItem();
            int ac_timing = (int) combobox_ac_timing.getSelectedItem();

            double e_e_watt_hour = ((l_qty * 10 * light_timing) + (f_qty * 60 * fan_timing)+(a_qty * 70 * ac_timing));
            int e_e_kwh = (int) (e_e_watt_hour) / 1000;
            double e_e_kwh_days = e_e_kwh * 31;

            total_bill2 = (int) ((int) e_e_kwh_days * 15.200);
/*    JOptionPane.showMessageDialog(this, "\nFan quantity :" +
            textField_fan_qty.getText() + "\n Light quantity :" + textField_light_qty.getText() + "\nAC quantity : " +
            textField_light_qty.getText() + "\n Fan timing :" + combobox_fan_timing.getSelectedItem() + "\n Light timing :" +
            combobox_light_timing.getSelectedItem() + "\n AC timing :" + combobox_ac_timing.getSelectedItem() + "\n Total bill :" + total_bill2);*/
            JOptionPane.showMessageDialog(this, "Bill saved in file");
            FileWriter fw = null;
            try {
                Intro i=new Intro();
                fw = new FileWriter("Project_Electricity_Bill.txt", true);
                fw.write("\n\nAc Quantity :" + textField_ac_qty.getText() + "\n\nFan Quantity :" + textField_fan_qty.getText() + "\n\nLight Quantity :"
                        + textField_light_qty.getText() + "\n\nTotal bill :" + total_bill2);
                fw.close();

            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }


    }

}