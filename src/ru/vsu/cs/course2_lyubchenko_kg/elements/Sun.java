package ru.vsu.cs.course2_lyubchenko_kg.elements;

import java.awt.*;

public class Sun {

    private final int x;
    private final int y;
    private final int w;
    private final int h;

    public Sun(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    public int getX() {
        return x;
    }

    public int getW() {
        return w;
    }

    public void draw(Graphics2D g){
        g.fillOval(x, y, w, h);
    }
}