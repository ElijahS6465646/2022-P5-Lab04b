// Lab04bvst.java
// The AWT Graphics Program
// This is the student, starting version of Lab04b.


import java.awt.*;
import java.applet.*;


public class Lab04bvst extends Applet
{

    public void paint(Graphics g)
    {
        // DRAW CUBE
        g.drawLine(50,50,200,50);
        g.drawLine(50,50,125,125);
        g.drawLine(200,50,275,125);
        g.drawLine(125,125,275,125);
        g.drawLine(200,50,200,200);
        g.drawLine(50,50,50,200);
        g.drawLine(50,200,200,200);
        g.drawLine(50,200,125,275);
        g.drawLine(125,275,275,275);
        g.drawLine(275,125,275,275);
        g.drawLine(125,125,125,275);
        g.drawLine(200,200,275,275);



        // DRAW SPHERE
        g.drawOval(75,75,175,175);
        g.drawOval(125,75,75,175);
        g.drawOval(150,75,25,175);
        g.drawOval(100,75,125,175);
        g.drawOval(75,125,175,75);
        g.drawOval(75,150,175,25);
        g.drawOval(75,100,175,125);

        // DRAW INSCRIBED/CIRCUMSCRIBED TRIANGLE



        // DRAW APCS
        /// DRAW A
        g.fillRect(50,500,25,125);
        g.fillRect(75,500,75,25);
        g.fillRect(125,500,25,125);
        g.fillRect(75,550,75,25);

        //// DRAW P
        g.fillRect(175,500,25,125);
        g.fillRect(175,500,75,25);
        g.fillRect(225,500,25,75);
        g.fillRect(175,550,75,25);

        //// DRAW C
        g.fillRect(275,500,75,25);
        g.fillRect(275,500,25,125);
        g.fillRect(275,600,75,25);

        //// DRAW S
        g.fillRect(375,500,75,25);
        g.fillRect(375,500,25,75);
        g.fillRect(375,550,75,25);
        g.fillRect(425,550,25,75);
        g.fillRect(375,600,75,25);

        // DRAW PACMEN FLOWER
        g.fillArc(450,200,100,100,225,270);
        g.fillArc(580,200,100,100,50,270);
        g.fillArc(515,130,100,100,135,270);
        g.fillArc(515,265,100,100,315,270);

    }

}


