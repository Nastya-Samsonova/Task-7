package ru.vsu.samsonova.gui;

import ru.vsu.samsonova.logic.FindingTheIndexOfAnDesiredElement;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static ru.vsu.samsonova.console.Main.toIntArray;

public class ListenerButtonResult implements ActionListener {
    public JTextField inputArray;
    public JTextField result;

    public ListenerButtonResult(JTextField inputArray, JTextField result) {
        this.inputArray = inputArray;
        this.result = result;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int[] indexOfElement = toIntArray(inputArray.getText());
        result.setText(String.valueOf(FindingTheIndexOfAnDesiredElement.findDesiredArrayElement(indexOfElement)));
    }
}
