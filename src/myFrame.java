import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class myFrame extends JFrame implements ActionListener {//implements ActionListener {

    //declare buttons
    JButton equalButton , addButton, subButton, multButton, diviButton, exitButton, clearButton, deciButton;
    JButton[] numButton; //this declares a list for the number button
    JTextField textField; //this declares a text field which is where the input is located at
    double input1, input2; //this delcares input1 and input2
    char op; //delcares characters for operators

    myFrame() { //this is for the frame

        numButton = new JButton[10]; //set up the the size of number Button list
        textField = new JTextField(); // set up a new text file
        textField.setBounds(100,0,100,50);

        //this for loop exist to set up each of the number buttons giving location, and set up the action listener,
        // then also adds in the frame
        for(int i=0;i < 10;i++ ) {
            numButton[i] = new JButton();
            numButton[i].addActionListener(this);
            numButton[i].setFocusable(false);
            numButton[i].setText(String.valueOf(i));
            numButton[i].setBounds(300,100+(i*50),50,50);
            
            this.add(numButton[i]);
        }

        // all these set up buttons for the functions


        equalButton= new JButton();
        equalButton.setBounds(100,100,100,50);
        equalButton.addActionListener(this);
        equalButton.setText("=");
        equalButton.setFocusable(false);

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

        clearButton = new JButton();
        clearButton.setBounds(200, 150, 100, 50);
        clearButton.addActionListener((this));
        clearButton.setText("Clear");
        clearButton.setFocusable(false);

        deciButton = new JButton();
        deciButton.setBounds(200, 200, 100, 50);
        deciButton.setText(".");
        deciButton.addActionListener(this);
        deciButton.setFocusable(false);


        //this also sets the settings for the frame

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);

        //this adds the buttons into the frame
        this.add(equalButton);
        this.add(addButton);
        this.add(diviButton);
        this.add(subButton);
        this.add(multButton);
        this.add(exitButton);
        this.add(textField);
        this.add(clearButton);
        this.add(deciButton);
        //this.add(numButton[0]);
        //this.add()

    }


   // actionPerformed basically allows the buttons to be pressed with a response
    @Override
    public void actionPerformed(ActionEvent e)  {
        int i =0;
        double sum=0;



        //this sets up the operators buttons
        if (e.getSource() == addButton) {
            op = '+';
            input1=Double.parseDouble(textField.getText());
            textField.setText("");
            System.out.println("This number will be adding");
        }

        if(e.getSource() == deciButton) {
            System.out.println(".");
            textField.setText(textField.getText()+".");
        }
        if(e.getSource() == subButton) {
            op='-';
            input1 = Double.parseDouble(textField.getText());
            textField.setText("");
            System.out.println("This Number will be subtracting");
        }
        if(e.getSource() == diviButton) {
            op='/';
            input1 = Double.parseDouble(textField.getText());
            textField.setText("");

            System.out.println("This Number will be dividing");
        }
        if(e.getSource() == multButton) {
            op='*';
            input1 = Double.parseDouble(textField.getText());
            textField.setText("");
            System.out.println("This Number will be multiplying");
        }
        if(e.getSource() == exitButton) {
            System.exit(0);
        }




        //this sets up the reactions of the number buttons
        if(e.getSource() == numButton[0]) {

            if(textField.getText() != "") {
                System.out.println(0);
                textField.setText(textField.getText() + "0");
            }
        }
        if(e.getSource() == numButton[1]) {
            System.out.println(1);
            textField.setText(textField.getText()+"1");
        }
        if(e.getSource() == numButton[2]) {
            System.out.println(2);
            textField.setText(textField.getText()+"2");
        }
        if(e.getSource() == numButton[3]) {
            System.out.println(3);
            textField.setText(textField.getText()+"3");
        }
        if(e.getSource() == numButton[4]) {
            System.out.println(4);
            textField.setText(textField.getText().concat(String.valueOf(4)));
        }
        if(e.getSource() == numButton[5]) {
            System.out.println(5);
            textField.setText(textField.getText()+"5");
        }
        if(e.getSource() == numButton[6]) {
            System.out.println(6);
            textField.setText(textField.getText()+"6");
        }
        if(e.getSource() == numButton[7]) {
            System.out.println(7);
            textField.setText(textField.getText()+"7");
        }
        if(e.getSource() == numButton[8]) {
            System.out.println(8);
            textField.setText(textField.getText()+"8");
        }
        if(e.getSource() == numButton[9]) {
            System.out.println(9);
            textField.setText(textField.getText()+"9");
        }
        //

        //sets up the clear button
        if(e.getSource() == clearButton) {
            input1=0;
            input2=0;
            textField.setText("");
            System.out.println("All Clear!");
        }

        //sets up the equal button

        if(e.getSource() == equalButton) {
            input2 = Double.parseDouble(textField.getText());

            if(op =='+') {
                sum = input1 + input2;

            }
            if(op== '-') {
                sum = input1-input2;
            }
            if(op == '*') {
                sum = input1*input2;
            }
            if(op == '/') {
                sum = input1/input2;
            }
            input1= sum;
            input2=0;
            textField.setText(String.valueOf(sum));
        }



    }



}