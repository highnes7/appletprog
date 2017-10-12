package swingControls;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
public class _3JPanel {  
   public static void main(String[] args)   {  
     JFrame f = new JFrame("JFrame with a JPanel");
     Border etched =  BorderFactory.createDashedBorder(
    		 Color.green);
      JLabel L = new JLabel("Hello World !");   // Make a JLabel;
      JPanel P = new JPanel();                  // Make a JPanel;
    
      P.add(L);                   // Add L to JPanel P
     P.setBorder(etched);
    //  P.setBorder(BorderFactory.createLineBorder(Color.BLUE));
      f.add(P);  // Add P to JFrame f     
      f.setSize(400,400);
      f.setVisible(true);
   }
}

