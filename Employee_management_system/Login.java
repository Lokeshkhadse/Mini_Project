package Employee_management_system;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;  
import java.sql.*;              //ResultSet is in sql pakage
 

public class Login extends JFrame implements ActionListener{	
	JTextField tfusername,tfpassword;    // declare globally for ovveride method
	Login(){
		getContentPane().setBackground(Color.CYAN); // awt pakage
		setLayout(null);
		
		JLabel lblusername=new JLabel("USERNAME");
		lblusername.setBounds(40, 20, 100, 30);
		add(lblusername);
		
		 tfusername= new JTextField();      // username chya samorchya BOX sathi
		tfusername.setBounds(150,20,150,30);
		add(tfusername);
		
		JLabel lblpassword=new JLabel("PASSWORD");            
		lblpassword.setBounds(40, 70, 100, 30); 
		add(lblpassword);
		
	   tfpassword= new JTextField();                 // BOX password cha pudhahca
		tfpassword.setBounds(150,70,150,30);
		add(tfpassword);
		
		
		
		JButton login=new JButton("LOGIN");  // for button use jbutton class
		login.setBounds(150,120,150,30);
		login.setBackground(Color.GREEN);
		login.addActionListener(this);     // button vr click event lavnya sathi
		add(login);
		
		
		 ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("./photos/second.jpg"));
	     Image i2=i1.getImage().getScaledInstance(200,200, Image.SCALE_DEFAULT);
		 ImageIcon i3=new ImageIcon(i2);
	      JLabel image = new JLabel(i3);
		 image.setBounds(350, 0, 200, 200);
		 add(image);
		 
		
		
		
		setSize(600,300);      // length,width   // frame banavali
		setLocation(450,200);    // distance of left, distance of top
		setVisible(true);
	}
	 
	public void actionPerformed(ActionEvent e) {
		try {
			String username=tfusername.getText();                      //text field madhe ky value ahe te dete
			String password=tfpassword.getText();                      ////password field madhe ky value ahe te dete
		  
			Conn c=new Conn();
			
			String query ="select * from login where username='"+username+"' and password = '"+password+"'";      //DDL COMMAND AHE
			
			ResultSet rs=c.s.executeQuery(query);     // for execute query te satement function madhun yet ahe connection class madhe mhanun tyacha object create kela ve ya sobat statement ne access kela hya query function la
			 
			if(rs.next()) {                        // jr hya madhe value ahe tr next class open hoil
				setVisible(false);
				new Home();           // OPEN HOME
			}else {                                 // jr nhi value tr pop-up yeil tr invalide user nd password
				JOptionPane.showMessageDialog(null,"invalid username and password" );
				setVisible(false);                // close karila
			}
		
		}catch(Exception c) {   //  IMP e chya jagi c lavla karan duplicate yet hota mhanun
			c.printStackTrace();
		}
	}
	
	
	
	
	public static void main(String[] args) {
		new Login();
		  

	}

}
