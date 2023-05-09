package Employee_management_system;

import java.awt.*;

import javax.swing.*;

import com.toedter.calendar.JDateChooser;
import java.util.*;
import java.awt.event.*;
import java.util.*;
import java.awt.event.*;                       // actionlistener is in



public class Addemployee extends JFrame implements ActionListener{
	
	JButton add,back;
	JTextField  tfname,tffname,tfsalary,tfaddress,tfphone, tfdesignation,tfaadhar,tfemail;
	JDateChooser dcdob;
	JComboBox  cbeducation;
	JLabel lblempid;
	
	
	
	Random ran =new Random();                // random no. cha objec tcreate kela
	int number=ran.nextInt(999999);          // random no ha int pahije tya sathi nextInt(6 digit)sathi 999999 6's

	Addemployee(){
		
		getContentPane().setBackground(Color.orange);
		setLayout(null);
		
		JLabel heading=new JLabel("Add Empolyee Detail");
		heading.setBounds(320, 30, 500, 50);
	    heading.setFont(new Font("SAN_SERIF",Font.BOLD,25));
	    add(heading);
	    
	    
	    JLabel labelname=new JLabel("NAME");                // name
	    labelname.setBounds(50, 150, 150, 30);
	    labelname.setFont(new Font("serif",Font.PLAIN,20));
	    add(labelname);
	    
	    
	   tfname=new JTextField();                 //name box
	    tfname.setBounds(200,150,150,30);
	    add(tfname);
	    
	     
	    JLabel labelfname=new JLabel(" FATHER'S NAME");     //father name
	    labelfname.setBounds(400, 150, 200, 30);
	    labelfname.setFont(new Font("serif",Font.PLAIN,20));
	    add(labelfname);
	    
	    
	    tffname=new JTextField();                 // father name block
	    tffname.setBounds(600,150,200,30);
	    add(tffname);
	    
	    
	    
	    JLabel labeldob=new JLabel(" DOB");                    //DOB
	    labeldob.setBounds(50, 200, 150, 30);
	    labeldob.setFont(new Font("serif",Font.PLAIN,20));
	    add(labeldob);
	    
	    dcdob= new JDateChooser();
	    dcdob.setBounds(200,200,150,30);
	    add(dcdob);
	    
	    
	    
	    JLabel labelsalary=new JLabel(" SALARY");     //salary
	    labelsalary.setBounds(400, 200, 150, 30);
	    labelsalary.setFont(new Font("serif",Font.PLAIN,20));
	    add(labelsalary);
	    
	    
	     tfsalary=new JTextField();                 // salary block
	    tfsalary.setBounds(600,200,200,30);
	    add(tfsalary);
	    
	    
	    JLabel labeladdress=new JLabel(" ADDRESS");     // address
	    labeladdress.setBounds(50, 250, 150, 30);
	    labeladdress.setFont(new Font("serif",Font.PLAIN,20));
	    add(labeladdress);
	    
	    
	     tfaddress=new JTextField();                 //address block
	    tfaddress.setBounds(200,250,150,30);
	    add(tfaddress);
	    
	    
	    JLabel labelphone=new JLabel(" PHONE");     //phone
	    labelphone.setBounds(400, 250, 150, 30);
	    labelphone.setFont(new Font("serif",Font.PLAIN,20));
	    add(labelphone);
	    
	    
	     tfphone=new JTextField();                 //phone block
	    tfphone.setBounds(600,250,200,30);
	    add(tfphone);
	    
	    
	    
	    JLabel labelemail=new JLabel("EMAIL");     // Email
	    labelemail.setBounds(50, 300, 150, 30);
	    labelemail.setFont(new Font("serif",Font.PLAIN,20));
	    add(labelemail);
	    
	    
	     tfemail=new JTextField();                 //Email block
	    tfemail.setBounds(200,300,150,30);
	    add(tfemail);
	    
	    
	    JLabel labeleducation=new JLabel(" HIGH. EDUCATION");     //HIGHEST EDUCATION
	    labeleducation.setBounds(400, 300, 200, 30);
	    labeleducation.setFont(new Font("serif",Font.PLAIN,20));
	    add( labeleducation);
	    
	     String Courses[]= {"BBA","BCA","MTECH","BTECH","PHD"} ;       //jcombobox array of string gheto                                                                                 
	                                                            // //CREATE DROPDOWN   
	     cbeducation=new JComboBox(Courses);                 //HIGHEST EDUCATION block
	    cbeducation.setBounds(600,300,200,30);
	    add(cbeducation);
	     
	    
	    
	    JLabel labeldesignation=new JLabel("DESIGNATION ");     //  designation
	    labeldesignation.setBounds(50, 350, 150, 30);
	    labeldesignation.setFont(new Font("serif",Font.PLAIN,20));
	    add(labeldesignation);
	    
	    
	     tfdesignation=new JTextField();                 //designation block
	    tfdesignation.setBounds(200,350,150,30);
	    add(tfdesignation);
	    
	    
	    JLabel labelaadhar=new JLabel(" AADHAR NO.");              //aadhar no.
	    labelaadhar.setBounds(400, 350, 150, 30);
	    labelaadhar.setFont(new Font("serif",Font.PLAIN,20));
	    add(labelaadhar);
	    
	    
	     tfaadhar=new JTextField();                 //aadhar no, block
	    tfaadhar.setBounds(600,350,200,30);
	    add( tfaadhar);
	    
	    
	    
	    JLabel labelempid=new JLabel("EMPLOYEE ID ");     //  employee id
	    labelempid.setBounds(50, 400, 150, 30);
	    labelempid.setFont(new Font("serif",Font.PLAIN,20));
	    add(labelempid);
	    

	     lblempid=new JLabel(""+number);                            //JLabel because tya madhe value change hot nhi ekdachi fix tr fix
	    lblempid.setBounds(200, 400, 150, 30);
	    lblempid.setFont(new Font("serif",Font.PLAIN,20));
	    add(lblempid);
	    
	    
	    add= new JButton("Add Details");
		add.setBounds(250,550,150,40);
		add.addActionListener(this);
		 add.setBackground(Color.BLACK);
		 add.setForeground(Color.WHITE);
		add(add);
		
		
		    back= new JButton("Back  ");
			back.setBounds(450,550,150,40);
			back.addActionListener(this);
			 back.setBackground(Color.BLACK);
			 back.setForeground(Color.WHITE);
			 add(back);
	     
	    
	   
	    setSize(900,700);
		setLocation(300,50);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==add) {
		     String name = tfname.getText();
	            String fname = tffname.getText();
	            String dob = ((JTextField) dcdob.getDateEditor().getUiComponent()).getText();
	            String salary = tfsalary.getText();
	            String address = tfaddress.getText();
	            String phone = tfphone.getText();
	            String email = tfemail.getText();
	            String education = (String) cbeducation.getSelectedItem();   // it return object so that's why typecaste kiya string mai
	            String designation = tfdesignation.getText();
	            String aadhar = tfaadhar.getText();
	            String empId = lblempid.getText();
	            
	            try {
	                Conn conn = new Conn();              // connection class tya through sql connect                 
/*DML COMMAND*/      String query = "insert into employee6 values('"+name+"', '"+fname+"', '"+dob+"' ,'"+salary+"', '"+address+"', '"+phone+"', '"+email+"', '"+education+"', '"+designation+"', '"+aadhar+"', '"+empId+"')";
	                conn.s.executeUpdate(query);               // varchar mule'' lavla and concate karila "++" lavla 
	                JOptionPane.showMessageDialog(null, "Details added successfully");
	                setVisible(false);
	                new Home();
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
		}else {
			setVisible(false);
			new Home();
		}
	}
	
	
	

	
	public static void main(String[] args) {
	 new Addemployee();

	}

}
