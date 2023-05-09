package Employee_management_system;
import javax.swing.*;
import java.awt.*;
import java.sql.*;                            //result set is in
import net.proteanit.sql.DbUtils;
import java.awt.event.*;                      // actionlistener

public class Viewemployee extends JFrame implements ActionListener{

    JTable table;
    Choice cemployeeId;                       //drop down with the help of choice (combobox ne pn aapan karu shakto )
    JButton search, print, update, back;
    
    Viewemployee() {
        
        getContentPane().setBackground(Color.orange);
        setLayout(null);
        
        JLabel searchlbl = new JLabel("Search by Employee Id");         // search karila
        searchlbl.setBounds(20, 20, 150, 20);
        add(searchlbl); 
        
        cemployeeId = new Choice();
        cemployeeId.setBounds(180, 20, 150, 20);
        add(cemployeeId);
        
        try {
              Conn c = new Conn();
              ResultSet rs = c.s.executeQuery("select * from employee6");
              while(rs.next()) {                                            // rs la loop kela aapan (row) tya madhun empid ghetoy aapan  
              cemployeeId.add(rs.getString("empId"));                          // empid through search kartoy
               }                                                               // it is insert in dynamically
        } catch (Exception e) {
           e.printStackTrace();
           }
        
        table = new JTable();
        
        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from employee6");   // employee5 madhla deta uchalanar nd table madhe insert karnar
        table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        JScrollPane jsp = new JScrollPane(table);   // scroll bar add kela  table scroll bar lavla
        jsp.setBounds(0, 100, 900, 600);
        add(jsp);
        
        search = new JButton("Search");
        search.setBounds(20, 70, 80, 20);
        search.addActionListener(this);
        add(search);
        
        print = new JButton("Print");
        print.setBounds(120, 70, 80, 20);
        print.addActionListener(this);
        add(print);
        
        update = new JButton("Update");
        update.setBounds(220, 70, 80, 20);
        update.addActionListener(this);
        add(update);
        
        back = new JButton("Back");
        back.setBounds(320, 70, 80, 20);
        back.addActionListener(this);
        add(back);
        
        setSize(900, 700);
        setLocation(300, 100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == search) {
            String query = "select * from employee6 where empId = '"+cemployeeId.getSelectedItem()+"'";          // emp id deta through search
            try {                                                                    // mysql cha kam ahe tr pahila try catch banavane
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(query);                              // query la excute kela
                table.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == print) {
            try {
                table.print();                                    // print karnya sathi table la print karicha ahe	
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == update) {
           setVisible(false);
             new Updateemployee(cemployeeId.getSelectedItem());
        } else {
            setVisible(false);
            new Home();
        } 
    }

    public static void main(String[] args) {
        new Viewemployee();
    }
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

