package swingevents;
import java.awt.*;
import java.awt.event.*;
public class KeyEventEx {
	Label label;
	  public KeyEventEx(){
	    Frame frame = new Frame();
	    TextField textField = new TextField();
	    frame.add(textField, BorderLayout.NORTH);
	    label = new Label();
	    frame.add(label, BorderLayout.CENTER);
	    frame.setSize(450, 400);
	    frame.setVisible(true);
	    frame.addWindowListener(new WindowAdapter() {
		      public void windowClosing(WindowEvent we) {
		        System.exit(0);
		      }
		    });
	    textField.addKeyListener(new KeyAdapter() {	     
	      public void keyTyped(KeyEvent ke) {
	        char keyChar = ke.getKeyChar();
	        if (keyChar == 'a') {
	          System.out.println("You typed 'a'");
	        }
	      }
	      public void keyReleased(KeyEvent ke) {
	        int keyCode = ke.getKeyCode();
	        if (keyCode == 67) {
	          System.out.println("You Typed c");
	        }
	      }
	    });
	  }

	  public static void main(String[] args) {
	    new KeyEventEx();
	  }
	}
