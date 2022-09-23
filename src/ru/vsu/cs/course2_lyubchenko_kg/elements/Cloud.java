package ru.vsu.cs.course2_lyubchenko_kg.elements;

import java.awt.*;

public class Cloud {
    private int x, y, r;
    private Color c;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getR(){
        return r;
    }

    public Cloud(int x, int y, int r, Color c) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.c = c;
    }

    public void draw(Graphics2D g) {
        Color prevColor = g.getColor();
        g.setColor(c);

        g.fillOval(x + r, y, r, r);
        g.fillOval(x + r / 2, y + r / 2, r, r);
        g.fillOval(x + r / 2 * 3, y + r / 2, r, r);
        g.fillOval(x, y + r, r, r);
        g.fillOval(x + r * 2, y + r, r, r);
        g.fillRect(x + r / 2, y + r, r * 2, r);

        g.setColor(prevColor);
    }
}