import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TrafficLight extends JPanel implements MouseListener{

    private int counter = 0;

    public TrafficLight() {
        JFrame myFrame = new JFrame("Traffic Light");
        myFrame.setSize(200, 600); 
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.add(this);
        myFrame.setVisible(true);

        addMouseListener(this);
    }

    public void mouseClicked(MouseEvent e) {
        this.counter++;
        repaint();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (this.counter % 3 == 0) {
            g.drawOval(50, 50, 100, 100);
            g.drawOval(50, 250, 100, 100);
            g.setColor(Color.GREEN);
            g.fillOval(50, 450, 100, 100);
        } else if (this.counter % 3 == 1) {
            g.drawOval(50, 50, 100, 100);
            g.setColor(Color.YELLOW);
            g.fillOval(50, 250, 100, 100);
            g.setColor(Color.BLACK);
            g.drawOval(50, 450, 100, 100);
        } else {
            g.setColor(Color.RED);
            g.fillOval(50, 50, 100, 100);
            g.setColor(Color.BLACK);
            g.drawOval(50, 250, 100, 100);
            g.drawOval(50, 450, 100, 100);
        }

    }

    public void mouseReleased(MouseEvent event) {}

    public void mousePressed(MouseEvent event) {}

    public void mouseEntered(MouseEvent event) {}

    public void mouseExited(MouseEvent event) {}

 
}
