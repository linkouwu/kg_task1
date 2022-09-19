package ru.vsu.cs.course2_lyubchenko_kg;

import ru.vsu.cs.course2_lyubchenko_kg.elements.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DrawPanel extends JPanel {
    private static Block b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15;
    private static OvalTree ot1, ot2, ot3, ot4;
    private static TriangleTree tt1, tt2, tt3, tt4, tt5, tt6, tt7;
    private static SpruceTree st1, st2, st3, st4;
    private static Cloud cl1, cl2;
    private Color c1, c2, c3, c4, c5, c6;

    public DrawPanel() {
        c1 = new Color(182, 239, 224);
        c2 = new Color(128, 216, 200);
        c3 = new Color(69, 169, 171);
        c4 = new Color(45, 61, 120);
        c5 = new Color(31, 31, 93);
        c6 = new Color(212, 248, 238);

        cl1 = new Cloud(470, 30, 45, c6);
        cl2 = new Cloud(100, 20, 55, c6);
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cl1.setX(cl1.getX() + 1);
                cl2.setX(cl2.getX() + 1);
                repaint();
            }
        });

        //слой 1
        b1 = new Block(-100, 70, 250, 50, c1);
        b2 = new Block(25, 100, 270, 20, c1);
        b3 = new Block(400, 100, 300, 20, c1);
        b4 = new Block(550, 60, 200, 60, c1);

        //слой 2
        b5 = new Block(10, 140, 150, 80, c2);
        b6 = new Block(300, 190, 400, 30, c2);
        b7 = new Block(650, 180, 120, 50, c2);
        ot1 = new OvalTree(520, 110, 35, c2);
        tt1 = new TriangleTree(180, 150, 30, 45, c2);
        tt2 = new TriangleTree(590, 140, 20, 40, c2);
        st1 = new SpruceTree(80, 90, 25, 30, c2);

        //слой 3
        b8 = new Block(-20, 250, 250, 50, c3);
        b9 = new Block(350, 270, 180, 30, c3);
        b10 = new Block(600, 255, 150, 45, c3);
        tt3 = new TriangleTree(120, 160, 35, 70, c3);
        tt4 = new TriangleTree(660, 170, 25, 55, c3);
        st2 = new SpruceTree(420, 200, 35, 60, c3);
        ot4 = new OvalTree(250, 190, 40, c3);

        //слой 4
        b11 = new Block(-50, 380, 400, 20, c4);
        b12 = new Block(500, 360, 200, 40, c4);
        ot2 = new OvalTree(450, 315, 35, c4);
        tt5 = new TriangleTree(90, 300, 30, 55, c4);
        tt6 = new TriangleTree(350, 300, 40, 70, c4);
        st3 = new SpruceTree(600, 270, 40, 70, c4);

        //слой 5
        b13 = new Block(-100, 440, 200, 60, c5);
        b14 = new Block(340, 455, 250, 45, c5);
        b15 = new Block(650, 480, 100, 20, c5);
        ot3 = new OvalTree(150, 350, 55, c5);
        st4 = new SpruceTree(520, 360, 50, 80, c5);
        tt7 = new TriangleTree(700, 410, 40, 50,c5);
    }

    @Override
    public void paint(Graphics gr) {
        super.paint(gr);
        Graphics2D g = (Graphics2D) gr;
        Color prevColor = g.getColor();

        g.setColor(new Color(255, 255, 255));
        g.fillRect(0, 0, 800, 600);
        g.setColor(new Color(254, 203, 184));
        g.fillOval(300, 40, 40, 40);
        cl1.draw(g);
        cl2.draw(g);

        g.setColor(c1);
        g.fillRect(0, 120, 800, 450);
        b1.draw(g);
        b2.draw(g);
        b3.draw(g);
        b4.draw(g);

        g.setColor(c2);
        g.fillRect(0, 220, 800, 300);
        b5.draw(g);
        b6.draw(g);
        b7.draw(g);
        ot1.draw(g);
        tt1.draw(g);
        tt2.draw(g);
        st1.draw(g);

        g.setColor(c3);
        g.fillRect(0, 300, 800, 300);
        b8.draw(g);
        b9.draw(g);
        b10.draw(g);
        tt3.draw(g);
        tt4.draw(g);
        st2.draw(g);
        ot4.draw(g);

        g.setColor(c4);
        g.fillRect(0, 400, 800, 200);
        b11.draw(g);
        b12.draw(g);
        ot2.draw(g);
        tt5.draw(g);
        tt6.draw(g);
        st3.draw(g);

        g.setColor(c5);
        g.fillRect(0, 500, 800, 100);
        b13.draw(g);
        b14.draw(g);
        b15.draw(g);
        ot3.draw(g);
        st4.draw(g);
        tt7.draw(g);

        g.setColor(prevColor);
    }
}
