package swingControls;

import java.awt.event.KeyEvent;

import javax.swing.*;  
public class _6JMenu { 
          JMenu menu, submenu;  
          JMenuItem i1, i2, i3, i4, i5;  
          _6JMenu(){  
          JFrame f= new JFrame("Menu and MenuItem Example");  
          JMenuBar mb=new JMenuBar();  
          menu=new JMenu("MENU");  
          menu.setMnemonic(KeyEvent.VK_M);
          submenu=new JMenu("Sub Menu");  
          i1=new JMenuItem("Item 1");  
          i2=new JMenuItem("Item 2");  
          i3=new JMenuItem("Item 3");  
          i4=new JMenuItem("Item 4");  
          i5=new JMenuItem("Item 5");  
          menu.add(i1); menu.add(i2); menu.add(i3);  
          submenu.add(i4); submenu.add(i5);  
          menu.add(submenu);  
          mb.add(menu);  
          f.setJMenuBar(mb);  
          f.setSize(400,400);  
          //f.setLayout(null);  
          f.setVisible(true);  
}  
public static void main(String args[])  
{  
new _6JMenu();  
}}  