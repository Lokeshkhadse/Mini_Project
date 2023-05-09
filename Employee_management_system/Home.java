package Employee_management_system;

import javax.swing.*;
import java.awt.*;      //img is in
import java.awt.event.*;  
import java.sql.*;  



public class Home extends JFrame implements ActionListener{
	
	JButton add,view,update,remove;
	
	
	Home(){
		getContentPane().setBackground(Color.gray); 
		
		setLayout(null);
		
		 ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("./photos/home.jpg"));
		 Image i2=i1.getImage().getScaledInstance(1120,630, Image.SCALE_DEFAULT);             // img size la scale karat ahe ithe
		 ImageIcon i3=new ImageIcon(i2);
		 JLabel image = new JLabel(i3);
	     image.setBounds(0, 0 , 1120, 630);             // frame cha orgin pasun img start karichi mhanun 0,0 ghrtla
	     add(image);
	     
		
		JLabel 	heading=new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
		heading.setBounds(650,20 ,400 ,40 );
		heading.setFont(new Font("serif",Font.BOLD,20)); 
		heading.setForeground(Color.BLACK); 
		 image.add(heading);                      // image.add because img chya vr add karicha ahe mhanun
		
		 add= new JButton("ADD");
		add.setBounds(650,80,150,40);
		add.addActionListener(this);
		 image.add(add);
			 
		
		 view= new JButton("VIEW");
		view.setBounds(850,80,150,40);
		view.addActionListener(this);
		image.add(view);
		
		 update= new JButton("UPDATE");
		update.setBounds(650,150,150,40);
		update.addActionListener(this);
		 image. add(update);
		
		
		 remove= new JButton("REMOVE");
		remove.setBounds(850,150,150,40);
		remove.addActionListener(this);
		 image. add(remove);
		
		
		
		setSize(1120,630);
		setLocation(250,100);
		setVisible(true);
		
	}	
		
		
		
		public void actionPerformed(ActionEvent ae) {
			if(ae.getSource()==add) {                                    // jr ae.cha getsource add la call karel tr perform add button
				setVisible(false);
				new Addemployee();
			}else if(ae.getSource()==view) {
				setVisible(false);
				new Viewemployee();
			}else if(ae.getSource()==update) {
				setVisible(false);
				new Viewemployee();
			}else {
				setVisible(false);
				new Removeemployee();
			}
			
		}
		
		
		
	
	
		
	public static void main(String[] args) {
		new Home();

	}

}
