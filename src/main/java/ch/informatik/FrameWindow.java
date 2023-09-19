package ch.informatik;

import javax.swing.*;
import java.awt.*;

public class FrameWindow extends JFrame {
    private MainPanel mainPanel;
    private JScrollPane scrollPane;

    public FrameWindow() {
        super("Passwort Tabelle");
        createFrameWindow();
    }

    private void createFrameWindow() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createMainPanel();
        this.setPreferredSize(new Dimension(1500, 500));
        this.pack();
        this.setVisible(true);
    }

    private void createMainPanel() {
        scrollPane = new JScrollPane();
        mainPanel = new MainPanel();
        this.add(scrollPane);
        scrollPane.setViewportView(mainPanel);
    }
}
