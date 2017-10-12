package swingControls;
import javax.swing.*;
public class ReturnEx {
	public static void main(String args[])
	{
		JFrame f=new JFrame("Notepad Creation");
		JLabel l=new JLabel("UserName");
		l.setBounds(50, 100, 200, 50);
		f.add(l);
		
		f.setVisible(true);
	}
}
