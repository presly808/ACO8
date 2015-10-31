package ua.artcode.week7.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * Created by serhii on 31.10.15.
 */
public class _01SimpleFrame {

    // run frame
    public static void main(String[] args) {
        new MySimpleFrame();
    }

}

// config frame(size, components, name, logic)
class MySimpleFrame extends JFrame {

    private String name;
    private JTextField inputField;

    public MySimpleFrame() {
        setTitle("SIMPLE FRAME NAME");
        setSize(600, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        init();
        setVisible(true);
    }

    private void init() {

        JButton okButton = new JButton("OK");

        MyActionListener buttonListener = new MyActionListener();
        okButton.addActionListener(buttonListener);

        inputField = new JTextField("");

        setLayout(new GridLayout(2,1));

        // default BorderLayout
        getContentPane().add(okButton);
        getContentPane().add(inputField);

    }

    private class MyActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            inputField.setText(new Date().toString());
            System.out.println("Button is pressed!!!");
        }
    }

}


