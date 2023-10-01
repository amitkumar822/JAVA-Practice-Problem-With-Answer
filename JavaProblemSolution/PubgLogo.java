package ZZ_StartingTimePr;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PubgLogo extends JPanel {
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        // Set anti-aliasing for smoother lines
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Set the background color
        g2.setBackground(Color.BLACK);
        g2.clearRect(0, 0, getWidth(), getHeight());

        // Draw the letter "P"
        g2.setColor(Color.WHITE);
        g2.fillRect(50, 50, 20, 100);
        g2.fillRect(70, 50, 50, 20);
        g2.fillRect(70, 90, 50, 20);

        // Draw the letter "U"
        g2.fillRect(130, 50, 20, 100);
        g2.fillRect(150, 120, 50, 20);

        // Draw the letter "B"
        g2.fillRect(210, 50, 20, 100);
        g2.fillRect(210, 50, 50, 20);
        g2.fillRect(210, 70, 50, 20);
        g2.fillRect(260, 90, 50, 20);
        g2.fillRect(260, 110, 50, 20);
        g2.fillRect(210, 110, 50, 20);

        // Draw the letter "G"
        g2.fillRect(330, 50, 20, 100);
        g2.fillRect(350, 50, 50, 20);
        g2.fillRect(350, 90, 50, 20);
        g2.fillRect(350, 70, 50, 20);
        g2.fillRect(400, 70, 20, 20);
        g2.fillRect(400, 90, 20, 20);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("PUBG Logo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new PubgLogo());
        frame.setSize(450, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
