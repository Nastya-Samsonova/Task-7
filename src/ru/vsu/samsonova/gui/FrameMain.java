package ru.vsu.samsonova.gui;

import javax.swing.*;
import java.awt.*;

public class FrameMain extends JFrame {
    private JPanel mainPanel;
    private JTextField inputArray;
    private JButton findIndexButton;
    private JTextField result;

    public FrameMain() {
        super();
        setContentPane(mainPanel);
        setSize(Toolkit.getDefaultToolkit().getScreenSize());
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        findIndexButton.addActionListener(new ListenerButtonResult(inputArray, result));
    }
}

