package com.example.calculator;

// Importing required libraries
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Calculator implements ActionListener  {

    // Declaring required arrays and variables
    JFrame frame;
    JTextField textfield;
    JButton[] numberButtons = new JButton[10];
    JButton[] functionButtons = new JButton[8];
    JButton addButton, subButton, mulButton, divButton;
    JButton decButton, equButton, delButton, clrButton;
    JPanel panel;

    Font myFont = new Font("Courier", Font.BOLD, 30);

    double num1=0, num2=0, result=0;
    char operator;

    // Calculator class constructor for defining the layout, size, and name of the window upon instantiation
    Calculator(){

        //Defining the base frame of the calculator and close function
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(420, 550);
        frame.setLayout(null);

        // Instantiating an object of JTextField to add textfield on the frame and set the size of the textfield
        textfield = new JTextField();
        // Setting size of the
        textfield.setBounds(50, 25, 300, 40);
        textfield.setFont(myFont);
        // Make textfield not editable by pressing keys on the keyboard - it will only be editable if we press keys available
        // on the Calculator
        textfield.setEditable(false);

        // Instantiating objects of different JButtons defined above
        addButton = new JButton("+");
        subButton = new JButton("-");
        divButton = new JButton("/");
        mulButton = new JButton("*");
        clrButton = new JButton("Clear");
        delButton = new JButton("Delete");
        decButton = new JButton(".");
        equButton = new JButton("=");

        // Adding all the above buttons to functionButtons array
        functionButtons[0] = addButton;
        functionButtons[1] = subButton;
        functionButtons[2] = mulButton;
        functionButtons[3] = divButton;
        functionButtons[4] = decButton;
        functionButtons[5] = equButton;
        functionButtons[6] = delButton;
        functionButtons[7] = clrButton;

        // Setting font for all the buttons and adding actions for buttons
        for(int i=0; i<8; i++){
            functionButtons[i].addActionListener(this);
            functionButtons[i].setFont(myFont);
            functionButtons[i].setFocusable(false);
        }

        // Instantiating numberButtons add adding settings for each one of them
        for(int i=0; i<10; i++){
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(myFont);
            numberButtons[i].setFocusable(false);
        }

        // Setting rectangular size for the delete and clear buttons
        delButton.setBounds(50, 430, 145, 50);
        clrButton.setBounds(205, 430, 145, 50);

        // Instantiating an object of JPanel
        panel = new JPanel();
        panel.setBounds(50, 100, 300, 300); // Setting bounds for the panel
        panel.setLayout(new GridLayout(4,4,10,10)); // Makings it square

        // Adding buttons to the panel
        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addButton);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subButton);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(mulButton);
        panel.add(decButton);
        panel.add(numberButtons[0]);
        panel.add(equButton);
        panel.add(divButton);





        frame.add(panel); // Adding panel of numbers to the frame
        frame.add(delButton);  // Adding delete button to the frame
        frame.add(clrButton); // Adding clear button to the frame
        frame.add(textfield); // Adding textfield on the frame
        frame.setVisible(true);


    }

    public static void main (String[] args){
        Calculator calc = new Calculator();

    }

    // Adding functions for all the buttons
    @Override
    public void actionPerformed(ActionEvent e) {

        //for loop to iterate over all the number buttons and set textfield to the number that is clicked
        for(int i=0; i<10; i++){
            if(e.getSource() == numberButtons[i]){
                textfield.setText(textfield.getText().concat(String.valueOf(i)));
            }
        }

        if(e.getSource() == decButton){
            textfield.setText(textfield.getText().concat("."));
        }

        if(e.getSource() == addButton){
            num1 = Double.parseDouble(textfield.getText());
            operator = '+';
            textfield.setText("");
        }

        if(e.getSource() == subButton){
            num1 = Double.parseDouble(textfield.getText());
            operator = '-';
            textfield.setText("");
        }

        if(e.getSource() == mulButton){
            num1 = Double.parseDouble(textfield.getText());
            operator = '*';
            textfield.setText("");
        }

        if(e.getSource() == divButton){
            num1 = Double.parseDouble(textfield.getText());
            operator = '/';
            textfield.setText("");
        }

        if(e.getSource() == equButton){
            num2 = Double.parseDouble(textfield.getText());

            switch(operator){
                case'+':
                    result = num1+num2;
                    break;
                case'-':
                    result = num1-num2;
                    break;
                case'*':
                    result = num1*num2;
                    break;
                case'/':
                    result = num1/num2;
                    break;
            }
            textfield.setText(String.valueOf(result));
            num1 = result;
        }

        if(e.getSource() == clrButton){
            textfield.setText("");
        }

        if(e.getSource() == delButton){
            String string = textfield.getText();
            textfield.setText("");
            for(int i=0; i<string.length()-1; i++){
                textfield.setText(textfield.getText()+string.charAt(i));
            }

        }
    }
}