package swingevents;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ActionEventDemo extends JFrame 
{
    JButton click;
    JPanel panel;
    JLabel message;

public ActionEventDemo() 
{
super("Action Event Demo");
click = new JButton("Login");
panel = new JPanel();
message = new JLabel("Helo");

add(panel);
panel.add(click);
panel.add(message);
click.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== click)
			message.setText("Welcome to Event Handling in Java");
		    	
	}
});
setSize(300, 300);
setVisible(true);

        

    }



public static void main(String[] args) 
    {
ActionEventDemo obj = new ActionEventDemo();
    }
}

