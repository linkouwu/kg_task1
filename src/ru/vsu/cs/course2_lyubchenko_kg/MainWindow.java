package ru.vsu.cs.course2_lyubchenko_kg;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    private final DrawPanel dp;

    public MainWindow() throws HeadlessException {
        dp = new DrawPanel();
        this.add(dp);
    }
}
