package ua.artcode.week7.swing;

import ua.artcode.utils.io.BashCommands;
import ua.artcode.utils.io.IBashCommands;
import ua.artcode.utils.io.IOHelper;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

/**
 * Created by serhii on 31.10.15.
 */
public class TextEditorFrame extends JFrame {

    private IBashCommands bashCommands = new BashCommands();
    private JTextField filePathField;
    private JTextArea fileContentArea;
    private JButton loadButton;
    private JButton saveButton;

    public TextEditorFrame() {
        setSize(600, 600);
        init();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void init() {
        filePathField = new JTextField("/home/serhii");

        fileContentArea = new JTextArea();


        JPanel southButtonsPanel = new JPanel(new GridLayout(1, 2));
        //
        loadButton = new JButton();
        loadButton.addActionListener((arg) -> {
                    try {
                        fileContentArea.setText(
                                bashCommands.less(
                                        filePathField.getText()));
                    } catch (FileNotFoundException e) {
                        JOptionPane.showMessageDialog(TextEditorFrame.this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
        );

        // actionPerformed(ActionEvent e){}
        ActionListener saveButtonListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String path = filePathField.getText();
                String source = fileContentArea.getText();

                bashCommands.writeInto(path, source);
            }
        };

        saveButton = new JButton("SAVE");
        saveButton.addActionListener(saveButtonListener);


        // add action listener

        southButtonsPanel.add(loadButton);
        southButtonsPanel.add(saveButton);


        JScrollPane jScrollPane = new JScrollPane(fileContentArea);

        getContentPane().add(jScrollPane, BorderLayout.CENTER);
        getContentPane().add(southButtonsPanel, BorderLayout.SOUTH);
        getContentPane().add(filePathField, BorderLayout.NORTH);
    }

}
