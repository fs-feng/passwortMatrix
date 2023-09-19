package ch.informatik;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class MatrixPanel extends JPanel {
    private Field[][] fields;
    private String tableHeader = " ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private String characters = "qwertzuiopasdfghjklyxcvbnmQWERTZUIOPASDFGHJKLYXCVBNM12345678901234567890123456789012345678901234567890*ç%&/()='?^`¦@#°§¬|¢è!éà£,;.:-_][{}¨?^`¦@#°§¬|¢è!éà£";
    private ArrayList<ArrayList<Character>> shuffled = new ArrayList<>();

    public MatrixPanel(int rows) {
        super(new GridLayout(rows + 1,27));
        createMatrixPanel(rows);
    }

    private void createMatrixPanel(int rows) {
        printTableHeader();
        shuffleChars(rows);
        createTable(rows);
        printTable(rows);
    }

    public void printTableHeader() {
        for (char ch: tableHeader.toCharArray()) {
            this.add(new Field(Character.toString(ch), true));
        }
    }

    public void createTable(int rows) {
        fields = new Field[rows][26];
        for (int i = 0; i < fields.length; i++) {
            for (int j = 0; j < fields[i].length; j++) {
                fields[i][j] = new Field(Character.toString(shuffled.get(i).get(j)), false);
            }
        }
    }

    public void shuffleChars(int rows) {
        for (int i = 0; i < rows; i++) {
            ArrayList<Character> row = new ArrayList<>();
            for (int j = 0; j < 26; j++) {
                row.add(selectAChar());
            }
            shuffled.add(row);
        }

    }

    public char selectAChar(){
        Random random = new Random();
        int index = random.nextInt(characters.length());
        return characters.charAt(index);

    }

    public void printTable(int rows) {
        for (int i = 0; i < fields.length; i++) {
            this.add(new Field(Integer.toString(i+1), true));
            for (int j = 0; j < fields[i].length; j++) {
                this.add(fields[i][j]);
            }
        }
    }
}
