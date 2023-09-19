package ch.informatik;

import javax.swing.*;
import java.awt.*;

public class Field extends JLabel {
    public Field(String text, boolean isYellow) {
        super(text);
        if (isYellow) {
            this.setOpaque(true);
            this.setBackground(Color.YELLOW);
        }
        this.setPreferredSize(new Dimension(50,20));
        this.setHorizontalAlignment(JLabel.CENTER);
        this.setVerticalAlignment(JLabel.CENTER);
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }


}
