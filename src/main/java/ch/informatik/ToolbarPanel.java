package ch.informatik;

import javax.swing.*;
import javax.tools.Tool;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToolbarPanel extends JPanel {
    private MainPanel mainPanel;
    private JButton matrixButton;
    private JLabel rowCountLabel;
    private JTextField rowCountText;

    public ToolbarPanel(MainPanel mainPanel) {
        super(new FlowLayout(FlowLayout.CENTER));
        this.mainPanel = mainPanel;
        createButton();
        createLabel();
        createTextField();

        this.setBackground(Color.BLUE);
    }

    private void createButton() {
        matrixButton = new JButton("Generieren");
        this.add(matrixButton);

        matrixButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loadMatrix();
            }
        });
    }

    private void createLabel() {
        rowCountLabel = new JLabel("Anzahl Zeilen: ");
        this.add(rowCountLabel);
    }

    private void createTextField() {
        rowCountText = new JTextField(4);
        this.add(rowCountText);
    }

    public void loadMatrix() {
        mainPanel.createMatrixPanel(Integer.parseInt(rowCountText.getText()));
    }

}
