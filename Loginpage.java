package Swing;



import java.awt.event.*; 
 import javax.swing.*;  
import java.awt.*; 
public class Loginpage  extends JFrame implements ActionListener 
{ 
 JTextField jtf,jdf;  
 JButton jb,jc; 
 JLabel bl,bl1,b;
 public Loginpage() 
 { 
setLayout(new FlowLayout());
 bl=new JLabel("Username");
 add(bl);
 jtf = new JTextField(15); 
 add (jtf); 
 bl1=new JLabel("Password");
 add(bl1);
 jdf = new JTextField(15); 
 add (jdf); 
 jb = new JButton    ("Login"); 
 jb.addActionListener (this); 
 add(jb); 
 jc = new JButton    ("Reset"); 
 jc.addActionListener (this); 
 add(jc); 
 setSize(250,250); 
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
 setVisible(true); 
} 
 public void actionPerformed(ActionEvent ae) 
 { 
jtf.setText (ae.getActionCommand()); 
 } 
 public static void main(String[] args) 
 { 
  new  Loginpage(); 
 } 
} 