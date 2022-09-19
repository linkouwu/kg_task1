package ru.vsu.cs.course2_lyubchenko_kg;

import java.awt.*;

public class DrawingUtils {
    public static void drawTriangle(Graphics2D g, int x0, int y0, int l, int h) {
        int[] x = {x0, x0 + l, x0 + l / 2};
        int[] y = {y0 + h, y0 + h, y0};
        int n = 3;

        g.fillPolygon(x, y, n);
    }
}
