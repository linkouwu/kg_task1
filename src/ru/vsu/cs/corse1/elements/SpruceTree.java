package ru.vsu.cs.corse1.elements;

import ru.vsu.cs.corse1.DrawingUtils;

import java.awt.*;

public class SpruceTree {
    private int x, y, l, h;
    private Color c;

    public SpruceTree(int x, int y, int l, int h, Color c) {
        this.x = x;
        this.y = y;
        this.l = l;
        this.h = h;
        this.c = c;
    }

    public void draw (Graphics2D g){
        Color prevColor = g.getColor();
        g.setColor(c);

        DrawingUtils.drawTriangle(g, x, y, l, h);
        DrawingUtils.drawTriangle(g, x, y - h/2, l, h);
        DrawingUtils.drawTriangle(g, x, y - h, l, h);
        g.fillRect(x + l/2 - l/10, y + h, l / 5, l*2);

        g.setColor(prevColor);
    }
}
