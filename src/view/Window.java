package view;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    public Window(int width, int height) {
        this.setSize(width, height);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new Color(28,28,28));
    }
}
