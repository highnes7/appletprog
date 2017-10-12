package swingControls;

import javax.swing.*; 
public class _12JList {
  
	_12JList(){  
	        JFrame f= new JFrame();  
	        DefaultListModel<String> l1 = new DefaultListModel<>();  
	          l1.addElement("C");  
	          l1.addElement("C++");  
	          l1.addElement("Java");  
	          l1.addElement("ASP");  
	          JList<String> list = new JList<>(l1);  
	          list.setBounds(100,100, 75,75);  
	          f.add(list);  
	          f.setSize(400,400);  
	          f.setLayout(null);  
	          f.setVisible(true);  
	     }  
	public static void main(String args[])  
	    {  
	   new _12JList();  
	    }}  
