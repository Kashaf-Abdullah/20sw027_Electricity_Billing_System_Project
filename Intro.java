package mypackage;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;


public class Intro extends JFrame implements ActionListener {
    String name;
    //image
    JLabel label_pic;
    ImageIcon image_bill;
    //LABELS
JLabel label_meter;
    JLabel label_name;
JLabel label_cnic;
JLabel label_month;
JLabel label_date;
JLabel label_window;
//JButton
    JButton button_window;
//TEXTFIELD
    JTextField textField_meter;
    JTextField textfield_name;
    JTextField textfield_cnic;
    ///JCHECKBOX
    JCheckBox checkbox_date;
//JCOMBOBOX
    JComboBox combo_box_month;

    Intro(){
        this.getContentPane().setBackground(Color.cyan);
this.pack();
        //image
        label_pic=new JLabel();
        image_bill=new ImageIcon("e_bill2.png");
 label_pic.setBounds(77,0,650,150);
 label_pic.setIcon(image_bill);
        //label
        label_name=new JLabel("Name  :");
        label_name.setForeground(Color.RED);
        label_name.setFont(new Font("Akaya Telivigala",Font.BOLD,20));
        label_name.setBounds(50,150,100,100);
label_cnic=new JLabel("CNIC :");
label_cnic.setBounds(50,200,200,100);
        label_cnic.setForeground(Color.RED);
        label_cnic.setFont(new Font("Akaya Telivigala",Font.BOLD,20));
label_date=new JLabel("Date :");
label_date.setBounds(50,250,250,100);
        label_date.setForeground(Color.RED);
        label_date.setFont(new Font("Akaya Telivigala",Font.BOLD,20));
label_month=new JLabel("Month :");
label_month.setBounds(50,300,300,100);
        label_month.setForeground(Color.RED);
        label_month.setFont(new Font("Akaya Telivigala",Font.BOLD,20));

        label_meter=new JLabel("Meter no :");
        label_meter.setBounds(50,350,300,100);
        label_meter.setForeground(Color.RED);
        label_meter.setFont(new Font("Akaya Telivigala",Font.BOLD,20));

        label_window=new JLabel("NEXT");
label_window.setBounds(150,400,150,150);
        label_window.setForeground(Color.RED);
        label_window.setFont(new Font("Akaya Telivigala",Font.BOLD,20));
//JTEXTFIELD
        textfield_name=new JTextField();
        textfield_name.setBounds(220,180,240,40);
        textfield_name.setForeground(Color.RED);

        textfield_name.setFont(new Font("Akaya Telivigala",Font.BOLD,20));
textfield_cnic=new JTextField();
textfield_cnic.setBounds(220,240,240,40);
        textfield_cnic.setForeground(Color.RED);

        textfield_cnic.setFont(new Font("Akaya Telivigala",Font.BOLD,20));
 //JCHECKBOX
        checkbox_date=new JCheckBox();

        checkbox_date.setText("Bill before due date:");
        checkbox_date.setBounds(220,280,150,50);
checkbox_date.setBackground(Color.cyan);
       //JCOMBOBOX
        String month[]={"January","Febraury","March","April","May","June","July","August","September","October","November","December"};

        combo_box_month=new JComboBox(month);
combo_box_month.setBounds(220,330,240,40);
   textField_meter=new JTextField();
   textField_meter.setBounds(220,380,240,50);
        textField_meter.setForeground(Color.RED);

        textField_meter.setFont(new Font("Akaya Telivigala",Font.BOLD,20));
      //JBUTOON
        button_window=new JButton("Click here");
        button_window.setBounds(210,467,110,20);
this.add(label_pic);
        this.add(label_name);
this.add(textfield_name);
 this.add(label_cnic);
 this.add(textfield_cnic);
 this.add(label_date);
 this.add(checkbox_date);
 this.add(label_month);
this.add(combo_box_month);
this.add(label_meter);
this.add(textField_meter);
this.add(label_window);
this.add(button_window);
//action listener
        button_window.addActionListener(this);
 this.setLayout(null);
    this.setSize(500,600);
        this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true);
     name=textfield_name.getText();
     System.out.println(name);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button_window) {

            JOptionPane.showMessageDialog(this, "Name : \t" + textfield_name.getText() + "\nCNIC : \t" + textfield_cnic.getText() + "\nMonth :\t" + combo_box_month.getSelectedItem());
            this.dispose();
            Bill b = new Bill();
            FileWriter fw = null;
            try {
                fw = new FileWriter("Project_Electricity_Bill.txt", true);
                fw.write("\n\nName :" + textfield_name.getText() + "\n\nCNIC :" + textfield_cnic.getText() + "\n\nMonth :" + combo_box_month.getSelectedItem() + "\n\nMeter No :" + textField_meter.getText());
                fw.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }
    }
}
