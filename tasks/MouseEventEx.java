package swingevents;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MouseEventEx {
	  public static void main(String args[]) {
	    Frame frame = new Frame("MouseListenerExample");
	    Button button1 = new Button("A");
	    Panel p = new Panel();
	    p.add(button1);
	    frame.add(button1, BorderLayout.NORTH);
	    frame.pack();
	    frame.setVisible(true);
	    button1.addMouseListener(new MouseAdapter() {
	      public void mousePressed(MouseEvent me) {
	        System.out.println("mousePressed " + me.getX());
	      }

	      public void mouseReleased(MouseEvent me) {
	        System.out.println("mouseReleased " + me.getX());
	      }
	    });
	    frame.addWindowListener(new WindowAdapter() {
	      public void windowClosing(WindowEvent e) {
	        System.exit(0);
	      }
	    });
	  }
	} 	

