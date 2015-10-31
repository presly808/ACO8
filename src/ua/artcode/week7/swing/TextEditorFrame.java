package ua.artcode.week7.swing;

import javax.swing.*;
import java.awt.*;

/**
 * Created by serhii on 31.10.15.
 */
public class TextEditorFrame extends JFrame {

    public TextEditorFrame (){
        setSize(600,600);
        init();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void init(){
        JTextField filePathField = new JTextField("/home/serhii");

        JTextArea fileContentArea = new JTextArea();

        JPanel southButtonsPanel = new JPanel(new GridLayout(1,2));

        getContentPane().add(fileContentArea, BorderLayout.CENTER);
        getContentPane().add(southButtonsPanel, BorderLayout.SOUTH);
        getContentPane().add(filePathField, BorderLayout.NORTH);
    }

}
