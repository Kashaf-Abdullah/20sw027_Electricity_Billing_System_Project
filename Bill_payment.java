package mypackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 class InsuffiecientBalance extends Exception{
    @Override
    public String getMessage(){
        JOptionPane.showMessageDialog(null, "insufficinet balance enter another amount " );
 return "insufficient balance";
    }
}
public class Bill_payment extends JFrame implements ActionListener  {
    //balance amiount
    int total_balance=00;

    JButton button_account_login;
    JLabel label_login;
    JLabel label_password;
    JTextField textField_login;
    JPasswordField textField_password;

    JLabel label_hbl;
    ImageIcon image;
    ImageIcon image_login;
    JLabel label_color;
    JButton button_Show_balance;
    JButton button_withdraw;
    JButton button_deposit;
    JButton button_login;
    JButton button_exit;
    MenuBar menubar;
    JMenu home;
    JMenu personal;
    JMenu cards;

    JMenuItem detail;
    JMenuItem customer_assistance;
    JMenuItem exit;
    JMenuItem debit_card;
    JMenuItem credit_card;

    Bill_payment() {


        //label of hbl

        label_hbl=new JLabel("");
        image=new ImageIcon("hbl.png");

        label_hbl.setBounds(100,0,700,100);
        label_hbl.setBackground(Color.DARK_GRAY);
        label_hbl.setForeground(Color.GREEN);
        label_hbl.setIcon(image);
        label_hbl.setHorizontalTextPosition(JLabel.RIGHT);
        //   this.setBackground(Color.green);
        //button part
        label_color=new JLabel();
        image_login=new ImageIcon("login1.jfif");
        label_color.setBounds(300,130,250,250);
        label_color.setIcon(image_login);
        label_color.setBackground(Color.BLACK);
        label_color.setOpaque(true);
        //   button_login=new JButton("LOG IN");
        //  button_login.setBounds(0,30,400,100);
//   button_login.setBackground(Color.BLACK);

        button_deposit=new JButton("DEPOSIT");
        button_deposit.setBounds(0,160,200,100);
        button_deposit.setBackground(Color.lightGray);
        button_deposit.setForeground(Color.getColor("DEPOSIT",Color.BLACK));
        button_deposit.setFont(new Font("Arial",Font.BOLD,20));
        button_Show_balance=new JButton("SHOW BALANCE");
        button_Show_balance.setBounds(0,290,200,100);
        button_Show_balance.setBackground(Color.LIGHT_GRAY);
        button_Show_balance.setForeground(Color.getColor("SHOW BALANCE",Color.BLACK));
        button_Show_balance.setFont(new Font("Arial",Font.BOLD,20));
        button_withdraw=new JButton("WITHDRAW");
        button_withdraw.setBounds(0,420,200,100);
        button_withdraw.setBackground(Color.LIGHT_GRAY);
        button_withdraw.setForeground(Color.getColor("WITHDRAW",Color.BLACK));
        button_withdraw.setFont(new Font("Arial",Font.BOLD,20));
        button_exit=new JButton("EXIT");
        button_exit.setBounds(0,550,200,100);
        button_exit.setBackground(Color.LIGHT_GRAY);
        button_exit.setForeground(Color.getColor("EXIT",Color.BLACK));
        button_exit.setFont(new Font("Arial",Font.BOLD,20));
        button_deposit.setOpaque(true);
//login textfield,

        label_login=new JLabel("LOGIN ID");
        label_login.setForeground(Color.white);
        label_login.setFont(new Font("Arial",Font.PLAIN,15));
        label_login.setBounds(300,390,70,50);
        textField_login=new JTextField();

        textField_login.setBounds(300,440,250,50);
        textField_login.setBackground(Color.LIGHT_GRAY);
        textField_login.setForeground(Color.getColor("Enter id",Color.BLACK));
        label_password=new JLabel("PASSWORD");
        label_password.setBounds(300,480,99,50);
        label_password.setForeground(Color.white);
        label_password.setFont(new Font("Arial",Font.PLAIN,15));
        textField_password=new JPasswordField();
        textField_password.setBounds(300,520,250,50);
        textField_password.setBackground(Color.LIGHT_GRAY);
        textField_password.setForeground(Color.getColor("Enter password",Color.BLACK));
        button_account_login=new JButton("LOG IN");
        button_account_login.setBounds(370,580,97,44);
        button_account_login.setBackground(Color.LIGHT_GRAY);
//button_account_login.setForeground(Color.getColor("LOG IN",Color.BLACK));
        button_account_login.setForeground(Color.getColor("LOG IN",Color.black));
        this.setLayout(null);
        //FIRST

        JMenuBar menubar = new JMenuBar();
        home = new JMenu("Home");
        personal = new JMenu("Personal");
        cards = new JMenu("Cards");
//SECOND
        detail = new JMenuItem("New Account");
        customer_assistance = new JMenuItem("Exist Account");
        exit = new JMenuItem("Exit");
        debit_card = new JMenuItem("Debit Card");
        credit_card = new JMenuItem("Credit Card");
        //FIRST
        menubar.add(home);
        menubar.add(personal);
        menubar.add(cards);
//SECOND
        home.add(detail);
        home.add(customer_assistance);
        home.add(exit);
        cards.add(debit_card);
        cards.add(credit_card);


        credit_card.addActionListener(this);
        this.add(label_hbl);
        this.add(label_color);
//this.add(button_login);

        this.add(button_Show_balance);
        this.add(button_deposit);
        this.add(button_withdraw);
        this.add(button_exit);
        this.add(label_login);
        this.add(textField_login);
        this.add(label_password);
        this.add(textField_password);
        this.add(button_account_login);
        button_account_login.addActionListener(this);


        button_Show_balance.addActionListener(this);
        button_withdraw.addActionListener(this);
        button_deposit.addActionListener(this);
        button_exit.addActionListener(this);
        this.getContentPane().setBackground( Color.BLACK);
        this.pack();
        this.setJMenuBar(menubar);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(700, 700);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button_account_login) {
            String name = textField_login.getText();
            // boolean check=false;
            String n = "kashaf";
            String password = String.valueOf(textField_password.getPassword());
            String p = "kashaf01";
            if (name.equals(n) && password.equals(p)) {
                JOptionPane.showMessageDialog(this, "valid");

            }

            else {
                JOptionPane.showMessageDialog(this, "Invalid");

            }


        }
        if (e.getSource() == button_Show_balance) {

            JOptionPane.showMessageDialog(this, "you have " + total_balance);

        } else if (e.getSource() == button_withdraw) {
            String withdraw = JOptionPane.showInputDialog(this, "Enter Withraw Amount");
            int wd = Integer.parseInt(withdraw);
            if(wd>total_balance){
                try {
                    throw new InsuffiecientBalance();
                } catch (InsuffiecientBalance ex) {
                    ex.printStackTrace();
                }
            }
            else
            total_balance = total_balance - wd;
        } else if (e.getSource() == button_deposit) {
            String deposit = JOptionPane.showInputDialog(this, "Enter deposit Amount");
            int dp = Integer.parseInt(deposit);
            total_balance = total_balance + dp;
        }
        if(e.getSource()==button_exit){
            this.dispose();
            Bill b=new Bill();
        }
    }

}
