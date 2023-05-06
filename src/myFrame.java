import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class myFrame extends JFrame implements ActionListener {//implements ActionListener {
    JButton button1 , addButton, subButton, multButton, diviButton, exitButton;

    JButton[] numButton;//w JButton[10];

    myFrame() {

        numButton = new JButton[10];

        for(int i=0;i < 10;i++ ) {
            numButton[i] = new JButton();
            numButton[i].addActionListener(this);
            numButton[i].setFocusable(false);
            numButton[i].setText(String.valueOf(i));
            numButton[i].setBounds(300,300+(i*50),50,50);
            this.add(numButton[i]);
        }



        button1= new JButton();
        button1.setBounds(100,100,100,50);
        button1.addActionListener(this);
        button1.setText("This is a button");
        button1.setFocusable(false);

        subButton= new JButton();
        subButton.setBounds(100,150,100,50);
        subButton.addActionListener(this);
        subButton.setText("-");
        subButton.setFocusable(false);

        addButton= new JButton();
        addButton.setBounds(100,200,100,50);
        addButton.addActionListener(this);
        addButton.setText("+");
        addButton.setFocusable(false);

        multButton = new JButton();
        multButton.setBounds(100, 250, 100, 50);
        multButton.addActionListener(this);
        multButton.setText("X");

        diviButton= new JButton();
        diviButton.setBounds(100,300,100,50);
        diviButton.addActionListener(this);
        diviButton.setText("/");
        diviButton.setFocusable(false);

        exitButton = new JButton();
        exitButton.setBounds(200, 100, 100, 50);
        exitButton.addActionListener((this));
        exitButton.setText("Exit");
        exitButton.setFocusable(false);




        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button1);
        this.add(addButton);
        this.add(diviButton);
        this.add(subButton);
        this.add(multButton);
        this.add(exitButton);

        //this.add(numButton[0]);
        //this.add()

    }
    @Override
    public void actionPerformed(ActionEvent e)  {
        if(e.getSource() == button1) {
            System.out.println("Hello World");
    }
        if(e.getSource() == addButton) {
            System.out.println("This Number will be adding");
        }
        if(e.getSource() == subButton) {
            System.out.println("This Number will be subtracting");
        }
        if(e.getSource() == diviButton) {
            System.out.println("This Number will be dividing");
        }
        if(e.getSource() == multButton) {
            System.out.println("This Number will be multiplying");
        }
        if(e.getSource() == exitButton) {
            System.exit(0);
        }
        if(e.getSource() == numButton[0]) {
            System.out.println(0);
        }
        if(e.getSource() == numButton[1]) {
            System.out.println(1);
        }
        if(e.getSource() == numButton[2]) {
            System.out.println(2);
        }
        if(e.getSource() == numButton[3]) {
            System.out.println(3);
        }
        if(e.getSource() == numButton[4]) {
            System.out.println(4);
        }
        if(e.getSource() == numButton[5]) {
            System.out.println(5);
        }
        if(e.getSource() == numButton[6]) {
            System.out.println(6);
        }
        if(e.getSource() == numButton[7]) {
            System.out.println(7);
        }
        if(e.getSource() == numButton[8]) {
            System.out.println(8);
        }
        if(e.getSource() == numButton[9]) {
            System.out.println(9);
        }

    }



}