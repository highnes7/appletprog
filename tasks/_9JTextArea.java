package swingControls;
import javax.swing.*;  
public class _9JTextArea {
	
	 
	_9JTextArea(){  
	        JFrame f= new JFrame();  
	        JTextArea area=new JTextArea("Welcome to Swing");  
	        area.setBounds(30,40,300,100);  
	        f.add(area);  
	        f.setSize(300,300);  
	        f.setLayout(null);  
	        f.setVisible(true);  
	     }  
	public static void main(String args[])  
	    {  
	   new _9JTextArea();  
	    }}  