package swingControls;


import javax.swing.JTabbedPane;


import javax.swing.JLabel;

import javax.swing.JPanel;

import javax.swing.JFrame;


import java.awt.*;

import java.awt.event.*;


public class _4JTabbedPaneDemo extends JPanel 
{
    public _4JTabbedPaneDemo() {
    
  //  ImageIcon icon = new ImageIcon("F:\\R\\SAMPLES2\\NewPros7\\src\\swingControls\\1.jpg");
       
 JTabbedPane jtbExample = new JTabbedPane();

       
 JPanel jplInnerPanel1 = createInnerPanel("Tab 1 Contains Tooltip and Icon");
        
jtbExample.addTab("One", jplInnerPanel1);       

        
JPanel jplInnerPanel2 = createInnerPanel("Tab 2 Contains Icon only");
      
  jtbExample.addTab("Two", jplInnerPanel2);    
        
        
JPanel jplInnerPanel3 = createInnerPanel("Third Panel Creation");
        jtbExample.addTab("Three", jplInnerPanel3);
        
        setLayout(new GridLayout(1, 1)); 
        
add(jtbExample);
    
}

   
 protected JPanel createInnerPanel(String text) {
        JPanel jplPanel = new JPanel();
        JLabel jlbDisplay = new JLabel(text);
        jlbDisplay.setHorizontalAlignment(JLabel.CENTER);
        jplPanel.setLayout(new GridLayout(1, 1));
        jplPanel.add(jlbDisplay);
        return jplPanel;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("TabbedPane Source Demo");
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
            	System.exit(0);}
        });

        frame.add(new _4JTabbedPaneDemo(),  BorderLayout.CENTER);
        frame.setSize(400, 125);
        frame.setVisible(true);
    }
}
