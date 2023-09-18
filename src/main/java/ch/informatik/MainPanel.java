package ch.informatik;

import javax.swing.*;

public class MainPanel extends JPanel {
    private ToolbarPanel toolbarPanel;
    private MatrixPanel matrixPanel;

    public MainPanel() {

    }


    private void createToolbarPanel() {
        toolbarPanel = new ToolbarPanel();
        this.add(toolbarPanel);
    }

}
