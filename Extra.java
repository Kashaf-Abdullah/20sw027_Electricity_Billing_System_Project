package mypackage;

import javax.swing.*;

import static java.lang.Thread.sleep;

public class Extra extends JFrame {
    Extra(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(500,500);


    try{
        sleep(5000);
        this.dispose();

    }
    catch(Exception e) {

    }
    }
}
