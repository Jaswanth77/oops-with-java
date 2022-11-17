package exp10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Snowman
{
    public int a=0,b=0;
    public static void main(String[] args)
    {
        final int MID = 700;
        final int TOP = 200;

        SnowmanFrame frame = new SnowmanFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

/**
 A frame that contains a message panel
 */
class SnowmanFrame extends JFrame
{
    public SnowmanFrame()
    {
        setTitle("Snowman");
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);


        SnowmanPanel panel = new SnowmanPanel();

        Button b=new Button("left");
        Button c=new Button("right");
        Button d=new Button("top");
        Button e=new Button("bottom");
        b.setBounds(10,30,60,30);
        c.setBounds(60,30,60,30);
        d.setBounds(120,30,60,30);
        e.setBounds(180,30,60,30);

        JLabel label1 = new JLabel();
        label1.setText("simple text");
        label1.setBounds(0, 0, 200, 50);

        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

               int a=-10;
            }
        });
        c.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

               int a=+10;
            }
        });
        d.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                int b=-10;
            }
        });
        e.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                int b=+10;
            }
        });
        panel.add(b);
        panel.add(c);
        panel.add(d);
        panel.add(e);
        add(label1);
        panel.setSize(400,400);
        panel.setLayout(null);
        panel.setVisible(true);

        getContentPane().add(panel);
    }
    public static final int DEFAULT_WIDTH = 400;
    public static final int DEFAULT_HEIGHT = 400;


}

class SnowmanPanel extends JPanel
{
    //-----------------------------------------------------------------
    //  Draws a snowman.
    //-----------------------------------------------------------------
    public void paintComponent (Graphics page)
    {
        super.paintComponent(page);
        final int MID = 700;
        final int TOP = 200;

        setBackground (Color.cyan);

        page.setColor (Color.blue);
        //page.fillRect (0, 175, 300, 50);  // ground

       // page.setColor (Color.yellow);
        //age.fillOval (-40, -40, 80, 80);  // sun
        int a=10,b=10;
        page.setColor(Color.white);
        page.fillOval(MID - 20, TOP, 40, 40);      // head
        page.fillOval(MID - 35, TOP + 35, 70, 50);   // upper torso
        page.fillOval(MID - 50, TOP + 80, 100, 60);  // lower torso

        page.setColor(Color.black);
        page.fillOval(MID - 10, TOP + 10, 5, 5);   // left eye
        page.fillOval(MID + 5, TOP + 10, 5, 5);    // right eye

        page.drawArc(MID - 10, TOP + 20, 20, 10, 190, 160);   // smile

        page.drawLine(MID - 25, TOP + 60, MID - 50, TOP + 40);  // left arm
        page.drawLine(MID + 25, TOP + 60, MID + 55, TOP + 60);  // right arm

        //page.drawLine (MID-20, TOP+5, MID+20, TOP+5);  // brim of hat
        //page.fillRect (MID-15, TOP-20, 30, 25);        // top of hat



    }

}