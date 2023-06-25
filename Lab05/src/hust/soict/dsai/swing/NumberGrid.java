package hust.soict.dsai.swing;

import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class NumberGrid extends JFrame {
    private JButton[] button_numbers = new JButton[10];
    private JButton delete_button, btnReset;
    private JTextArea tfDisplay;

    public NumberGrid() {
        tfDisplay = new JTextArea(1, 3);
        tfDisplay.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

        JPanel panel_button = new JPanel(new GridLayout(4, 3));
        addButtons(panel_button);

        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());
        cp.add(tfDisplay, BorderLayout.NORTH);
        cp.add(panel_button, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Number Grid");
        setSize(350, 400);
        setVisible(true);
    }

    void addButtons(JPanel panel_button) {
        ButtonListener button_listener = new ButtonListener();
        for (int i = 1; i <= 9; i++) {
            button_numbers[i] = new JButton("" + i);
            panel_button.add(button_numbers[i]);
            button_numbers[i].addActionListener(button_listener);
        }

        delete_button = new JButton("DEL");
        panel_button.add(delete_button);
        delete_button.addActionListener(button_listener);

        button_numbers[0] = new JButton("0");
        panel_button.add(button_numbers[0]);
        button_numbers[0].addActionListener(button_listener);

        btnReset = new JButton("C");
        panel_button.add(btnReset);
        btnReset.addActionListener(button_listener);
    }

    private class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String button = e.getActionCommand();
            if (button.charAt(0) >= '0' && button.charAt(0) <= '9') {
                tfDisplay.setText(tfDisplay.getText() + button);
            } else if (button.equals("DEL")) {
                String currentText = tfDisplay.getText();
                String newText = currentText.substring(0, currentText.length() - 1);
                tfDisplay.setText(newText);
            } else {
                tfDisplay.setText("");
            }
        }
    }

    public static void main(String[] args) {
        new NumberGrid();
    }
}
