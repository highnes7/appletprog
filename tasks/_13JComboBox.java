package swingControls;
import javax.swing.*;   
public class _13JComboBox { 
	  
	JFrame f;    
	_13JComboBox(){    
	    f=new JFrame("ComboBox Example");    
	    //String lan[]={"ASP","MVC","CSS","HTML5","Oracle"};        
	    JComboBox cb=new JComboBox(); 
	    
	    cb.setBounds(50, 50,90,20); 
	    cb.addItem("C");
	    cb.addItem("CSS");
	    cb.addItem("C#");
	    cb.addItem("C++");
	    f.add(cb);        
	    f.setLayout(null);    
	    f.setSize(400,500);    
	    f.setVisible(true);         
	}    
	public static void main(String[] args) {    
	    new _13JComboBox();         
	}    
	}   