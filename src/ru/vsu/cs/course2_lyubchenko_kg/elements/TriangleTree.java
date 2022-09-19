package ru.vsu.cs.course2_lyubchenko_kg.elements;

import ru.vsu.cs.course2_lyubchenko_kg.DrawingUtils;

import java.awt.*;

public class TriangleTree {
    private int x, y, l, h;
    private Color c;

    public TriangleTree(int x, int y, int l, int h, Color c) {
        this.x = x;
        this.y = y;
        this.l = l;
        this.h = h;
        this.c = c;
    }

    public void draw(Graphics2D g) {
        Color prevColor = g.getColor();
        g.setColor(c);

        DrawingUtils.drawTriangle(g, x, y, l, h);
        g.fillRect(x + l / 2 - l / 10, y + h, l / 5, l * 2);

        g.setColor(prevColor);
    }
}
