package ru.vsu.cs.course2_lyubchenko_kg.elements;

import java.awt.*;

public class Sky {

    private final int x;
    private final int y;
    private final int w;
    private final int h;

    public Sky(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    public void draw(Graphics2D g){
        g.fillRect(x, y, w, h);
    }
}