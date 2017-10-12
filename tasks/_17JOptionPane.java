package swingControls;
import javax.swing.*;  
public class _17JOptionPane {	
	JFrame f;  
	_17JOptionPane(){  
	    f=new JFrame();   
	    String name=JOptionPane.showInputDialog(f,"Enter Name");      
	}  
	public static void main(String[] args) {  
	    new _17JOptionPane();  
	}  
	}  