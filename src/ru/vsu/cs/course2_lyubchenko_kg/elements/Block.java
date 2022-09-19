package ru.vsu.cs.course2_lyubchenko_kg.elements;

import java.awt.*;

public class Block {
    private int x, y, l, h;
    private Color c;

    public Block(int x, int y, int l, int h, Color c) {
        this.x = x;
        this.y = y;
        this.l = l;
        this.h = h;
        this.c = c;
    }

    public void draw(Graphics2D g) {
        Color prevColor = g.getColor();
        g.setColor(c);

        int[] x0 = {x, x + l, x + l * 3 / 4, x + l / 4};
        int[] y0 = {y + h, y + h, y, y};
        int n = 4;

        g.fillPolygon(x0, y0, n);
        g.setColor(prevColor);
    }
}
