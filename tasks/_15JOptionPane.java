package swingControls;
import javax.swing.*; 
public class SwJOptionPane {
	
	JFrame f;  
	SwJOptionPane(){  
	    f=new JFrame();  
	    JOptionPane.showMessageDialog(f,"Hello, Welcome to Swing!!!");  
	}  
	public static void main(String[] args) {  
	    new SwJOptionPane();  
	}  
	} 