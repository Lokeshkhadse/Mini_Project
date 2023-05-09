package Employee_management_system;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;



public class Splash extends JFrame implements ActionListener{    
                                       //jframe is a class it is in swing pakage  
	Splash(){     
		
		getContentPane().setBackground(Color.gray);  // color class is in awt package
		
		
		setLayout(null);// inbuild swing che layout nko swatacha create karicha ahe mhanun null takla
		
		
		JLabel 	heading=new JLabel("EMPLOYEE MANAGEMENT SYSTEM");  // je pn lihicha ahe te jlabel cha use karun lihicha.. and object create karne
		heading.setBounds(80,30,1200,60);                        // swatacha banivha ahe layout mhanun use setbounds(left,top,length,width)
		heading.setFont(new Font("serif",Font.BOLD,58));         // 60 is font size
		heading.setForeground(Color.RED);                       // FONT COLOUR 
		add(heading);                                             // and te add karicha aahe tr add function madhe jya object madhe store kela ahe te pass karne
		 
		
		
	    ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("./photos/front.jpg"));
	    Image i2=i1.getImage().getScaledInstance(1100,700, Image.SCALE_DEFAULT);
	    ImageIcon i3=new ImageIcon(i2);
	    JLabel image = new JLabel(i3);
		image.setBounds(50, 100, 1050, 500);
		add(image);
     
		
		JButton click=new JButton("CLICK HERE TO CONTINUE");  // for button use jbutton class
		click.setBounds(400,400,300,70);
		click.setBackground(Color.GREEN);
		click.addActionListener(this);              // for button click event sathi
		add(click);
		 
		 
		
		                          // frame sathi
		setSize(1170,650);      // length,width 
		setLocation(200,50);    // distance of left, distance of top
		setVisible(true);
		
		
		while(true) {                      // while loop for infite loop
			heading.setVisible(false);         // heading dipper karnya sathi use kela
			try {
				Thread.sleep(500);            // foe 500 milisecond
			}catch(Exception e) {
				
			}
			
			heading.setVisible(true);
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				
			}
		}
	}
	
	
	//swing la sangila ki aaplyala button chya click vr he action perform karichi ahe tyacha code ithe lihicha override method madhe
	public void actionPerformed(ActionEvent ae) {    // implements ActionListener chi method overrride keli aapan error janaysathi
		     setVisible(false); // current frame close                                           
	          new Login();   // tyanantr login cha frame open karicha ahe tr constructor call honar
	}                                                    
	                 
	
	
	
	
	
	public static void main(String[] args) {
		System.out.println(Splash.class.getResource("."));
		new Splash(); //annymous object
		
	}

}