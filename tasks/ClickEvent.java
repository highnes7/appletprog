package swingevents;

import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ClickEvent {
	JFrame f;
	Panel p1=new Panel();
	JButton btnlogin;
	JLabel lbl;
	public ClickEvent()	{
		f=new JFrame("Action Performing");
		p1=new Panel();
		btnlogin =new JButton("Login");		
		
		btnlogin.addActionListener(new ActionListener() {
						@Override
			public void actionPerformed(ActionEvent ae) {
				if(ae.getSource() == btnlogin)
				{
					btnlogin.setText("RESOURCE CLicKED");
				}
				
			}
		}		
		);
		lbl=new JLabel("Helo");
		p1.add(btnlogin);
		p1.add(lbl);
		f.add(p1);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new ClickEvent();
	}

	
}

