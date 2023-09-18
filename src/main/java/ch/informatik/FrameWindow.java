package ch.informatik;

import javax.swing.*;

public class FrameWindow extends JFrame {
    private MainPanel mainPanel;

    public FrameWindow() {
        createFrameWindow();
    }

    private void createFrameWindow() {
        this.setName("PasswortMatrix");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createMainPanel();

        this.pack();
        this.setVisible(true);
    }

    private void createMainPanel() {
        mainPanel = new MainPanel();
        this.add(mainPanel);
    }
}
