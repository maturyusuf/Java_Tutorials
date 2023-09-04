import java.awt.Color;
import java.awt.Image;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JLabel label;
    ImageIcon icon;
    JPanel panel;
    boolean panelVisibility;

    MyFrame() {
        button = new JButton();
        label = new JLabel();
        icon = new ImageIcon(new ImageIcon("lib/icon.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        panel = new JPanel();
        this.panelVisibility = false;
        
         
        this.button.setText("Show me the sign!");
        this.button.setIcon(this.icon);
        this.button.setBounds(150, 150, 300, 100);
        this.button.setFocusable(false);
        this.button.setHorizontalTextPosition(JButton.CENTER);
        this.button.setVerticalTextPosition(JButton.BOTTOM);
        this.button.setIconTextGap(20);
        this.button.setForeground(Color.cyan);
        this.button.setBackground(Color.yellow);
        this.button.setBorder(BorderFactory.createLineBorder(Color.green, 3));
        this.button.addActionListener(this);
        this.button.setEnabled(true);


        this.panel.setSize(150, 150);
        this.panel.setBackground(Color.green);
        this.panel.setVisible(panelVisibility);
        this.panel.setLayout(null);


        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        
        this.add(this.button);
        this.add(this.panel);
        this.setLayout(null);
    
        
        
    }


    @Override
    public void actionPerformed(ActionEvent e) {
         if(e.getSource() == button) {
            this.panelVisibility = !this.panelVisibility;
            this.panel.setVisible(this.panelVisibility);
            System.out.println(this.panelVisibility);
            
        }
            
    }
    
    
}
