package swingControls;

import javax.swing.*;
import java.awt.*;
class _2JDialogExample extends JFrame
{
JDialog d1;
    public _2JDialogExample()    {
        createAndShowGUI();
        }    
    private void createAndShowGUI()    {   
        JDialog.setDefaultLookAndFeelDecorated(true);    
        d1=new JDialog(this,"Dialog", true);      
        d1.setSize(200,200);
        FlowLayout o=new FlowLayout();
        d1.setLayout(o);
        d1.add(new JLabel("Password"));     
        d1.add(new JTextField(20));
        JButton ob=new JButton("Login");
        d1.add(ob);    
        d1.setVisible(true);
    }
    
    public static void main(String args[])
    {
        new _2JDialogExample();
    }
    
    
    
    
    
    
    
    
}