import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

public class MyFrame extends JFrame {

    JPanel panel1;
    JPanel panel2;
    JPanel panel3;
    JPanel panel4;
    JPanel panel5;

    public MyFrame() {
        this.panel1 = new JPanel();
        this.panel2 = new JPanel();
        this.panel3 = new JPanel();
        this.panel4 = new JPanel();
        this.panel5 = new JPanel();

        this.setSize(600, 600);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout(10, 10));

        this.panel1.setBackground(Color.BLUE);
        this.panel2.setBackground(Color.RED);
        this.panel3.setBackground(Color.YELLOW);
        this.panel4.setBackground(Color.GREEN);
        this.panel5.setBackground(Color.CYAN);

        this.panel1.setPreferredSize(new Dimension(100, 100));
        this.panel2.setPreferredSize(new Dimension(100, 100));
        this.panel3.setPreferredSize(new Dimension(100, 100));
        this.panel4.setPreferredSize(new Dimension(100, 100));
        this.panel5.setPreferredSize(new Dimension(100, 100));

        this.add(panel1, BorderLayout.EAST);
        this.add(panel2, BorderLayout.CENTER);
        this.add(panel3, BorderLayout.SOUTH);
        this.add(panel4, BorderLayout.WEST);
        this.add(panel5, BorderLayout.NORTH);

    }

}
