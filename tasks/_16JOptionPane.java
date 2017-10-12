package swingControls;
import javax.swing.*;  
public class _16JOptionPane {

	 
	JFrame f;  
	_16JOptionPane(){  
	    f=new JFrame();  
	    JOptionPane.showMessageDialog(f,"Successfully Updated.","Alert",JOptionPane.WARNING_MESSAGE);     
	}  
	public static void main(String[] args) {  
	    new _16JOptionPane();  
	}  
	} 