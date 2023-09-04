import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame {

    JPanel redPanel;
    JPanel greenPanel;
    JPanel bluePanel;
    JLabel label;
    ImageIcon icon;
    
    MyFrame() {
        this.redPanel = new JPanel();
        this.greenPanel = new JPanel();
        this.bluePanel = new JPanel();

        this.label = new JLabel();
        this.icon = new ImageIcon(new ImageIcon("lib/icon.png").getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT));
        

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(750, 750);
        this.setLayout(null);

        this.redPanel.setBackground(Color.green);
        this.redPanel.setBounds(0, 0, 250, 250);
        this.redPanel.setLayout(new BorderLayout());

        this.greenPanel.setBackground(Color.blue);
        this.greenPanel.setBounds(250, 0, 250, 250);
        this.greenPanel.setLayout(new BorderLayout());

        this.bluePanel.setBackground(Color.red);
        this.bluePanel.setBounds(0, 250, 250, 250);
        this.bluePanel.setLayout(new BorderLayout());

        this.label.setText("This is magic mushrom!");
        this.label.setIcon(this.icon);
 
        this.label.setVerticalAlignment(JLabel.CENTER);
        this.label.setVerticalTextPosition(JLabel.TOP);
        this.label.setHorizontalTextPosition(JLabel.CENTER);
        this.label.setHorizontalAlignment(JLabel.CENTER);
        this.label.setForeground(Color.white);

       // this.label.setBounds(15, 15, 200 , 200);
       // If you define an exact position for a label using setBounce, just set the panle layout to null and delete the alignments.
       // otherwise, use setVerticalAlignment and setHorizontalAlignment for alignment in the panel.

        this.greenPanel.add(this.label);

        this.add(redPanel);
        this.add(greenPanel);
        this.add(bluePanel);

    }


}
