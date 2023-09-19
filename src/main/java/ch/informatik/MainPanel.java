package ch.informatik;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {
    private ToolbarPanel toolbarPanel;
    private MatrixPanel matrixPanel;

    public MainPanel() {
        super(new BorderLayout());
        createToolbarPanel();
    }


    private void createToolbarPanel() {
        toolbarPanel = new ToolbarPanel(this);
        this.add(toolbarPanel, BorderLayout.NORTH);
    }

    public void createMatrixPanel(int rows) {
        if (matrixPanel != null) {
            this.remove(matrixPanel);
        }
        matrixPanel = new MatrixPanel(rows);
        this.add(matrixPanel, BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
    }

    public void test() {

    }

}
