import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class MyFrame extends JFrame {

    MyFrame() {

        ImageIcon icon = new ImageIcon("icon.png");
        JLabel label = new JLabel();
        Border border = BorderFactory.createLineBorder(Color.red, 3);
        label.setText("Your dick size!");
        
        label.setIcon(icon);
        
        label.setOpaque(true);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.red);
        label.setFont(new Font("Noto Sans",Font.PLAIN,25));
        label.setBackground(Color.green);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(125, 125, 250, 250);

        this.setTitle("Label Tutorial");
        this.setSize(500, 500);
        this.add(label);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        
    }

}
