package ru.vsu.cs.course2_lyubchenko_kg.elements;

import java.awt.*;

public class OvalTree {
    private int x, y, r;
    private Color c;

    public OvalTree(int x, int y, int r, Color c) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.c = c;
    }

    public void draw(Graphics2D g) {
        Color prevColor = g.getColor();
        g.setColor(c);

        g.fillOval(x, y, r, r * 2);
        g.fillRect(x - r / 10 + r / 2, y + r, r / 5, r * 2);

        g.setColor(prevColor);
    }
}
