package View;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Address_Book.Address_Book;

public  class Add extends JDialog implements ActionListener{
	
	JPanel jpanel;
	JLabel  logo;
	
	JLabel name;
	JLabel f_name;
	JLabel l_name;
	JLabel midle_name;
	
	JLabel address;
	JLabel name_of_city;
	JLabel district_city;
	JLabel st_Name;
	JLabel st_Number;
	
	JLabel Phone_Number;
	JLabel home_number;
	JLabel mobile_number;
	JLabel work_number;
	
	JTextField first_name;
	JTextField last_name;
	JTextField midle_Name;
	
	JTextField city;
	JTextField district;
	JTextField st_name;
	JTextField st_number;
	
	JTextField home;
	JTextField mobile;
	JTextField work;
	
    JButton ok;
    
    public Add() {
		

		setBounds(450, 150, 428, 500);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	
		
		
	
		jpanel = new JPanel();
		setContentPane(jpanel);
		jpanel.setLayout(null);
		getContentPane().setBackground(Color.white);
		
		logo = new JLabel();
		logo.setBounds(250,50, 130, 180);
		jpanel.add(logo);
		ImageIcon img = new ImageIcon("F:/Tiyan/2.jpg");
		logo.setIcon(img );
		
		name = new JLabel(" Name ");
		name.setBounds(102, 10, 46, 14);
		jpanel.add(name);
		
		f_name = new JLabel("First Name");
	    f_name.setBounds(11, 38, 46, 14);
		jpanel.add(f_name);
		
		l_name = new JLabel("Last Name");
		l_name.setBounds(11, 69, 59, 14);
		jpanel.add(l_name);
		
		midle_name = new JLabel("Midle Name");
		midle_name.setBounds(10, 100, 59, 14);
		jpanel.add(midle_name);
		
		
		
		address = new JLabel("Address");
		address.setBounds(102, 124, 75, 14);
		jpanel.add(address);
		
		name_of_city = new JLabel("City");
		name_of_city.setBounds(11, 152, 46, 14);
		jpanel.add(name_of_city);
		
		district_city = new JLabel("District");
		district_city.setBounds(11, 185, 46, 14);
		jpanel.add(district_city);
		
		st_Name = new JLabel("Street Name");
		st_Name.setBounds(8, 215, 62, 17);
		jpanel.add(st_Name);
		
		st_Number = new JLabel("Street Num");
		st_Number.setBounds(8, 247, 59, 17);
		jpanel.add(st_Number);
		
		Phone_Number = new JLabel("Phone Numbers");
		Phone_Number.setBounds(67, 275, 160, 14);
		jpanel.add(Phone_Number);
		
		home_number = new JLabel("Home Number");
		home_number.setBounds(8, 303, 46, 14);
		jpanel.add(home_number);
		
		mobile_number = new JLabel("Mobile Number");
		mobile_number.setBounds(11, 334, 46, 14);
		jpanel.add(mobile_number);
		
		work_number = new JLabel("Work Number");
		work_number.setBounds(11, 365, 46, 14);
		jpanel.add(work_number);
		
		
			
		first_name = new JTextField();
		first_name.setBounds(67, 35, 149, 20);
		jpanel.add(first_name);
		
		
		last_name = new JTextField();
		last_name.setBounds(67, 66, 149, 20);
		jpanel.add(last_name);
		
		midle_Name = new JTextField();
		midle_Name.setBounds(67, 97, 149, 20);
		jpanel.add(midle_Name);
		
		city = new JTextField();
		city.setBounds(67, 149, 149, 20);
		jpanel.add(city);
		
		district = new JTextField();
		district.setBounds(67, 182, 149, 20);
		jpanel.add(district);
		
		st_name = new JTextField();
		st_name.setBounds(67, 213, 149, 20);
		jpanel.add(st_name);
		
		st_number = new JTextField();
		st_number.setBounds(67, 244, 149, 20);
		jpanel.add(st_number);
		
		home = new JTextField();
		home.setBounds(67, 300, 149, 20);
		jpanel.add(home);
		
		mobile = new JTextField();
		mobile.setBounds(67, 331, 149, 20);
		jpanel.add(mobile);
		
		work = new JTextField();
		work.setBounds(67, 362, 149, 20);
		jpanel.add(work);
		
		
		
		ok = new JButton("Accept");
		ok.setBounds(318, 409, 89, 23);
		jpanel.add(ok);
	    ok.addActionListener(this);
	    
	    
	    setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton input = (JButton)e.getSource();
		if(input==ok){
		Address_Book.Add_Person(first_name.getText(),last_name.getText(),midle_Name.getText(),name_of_city.getName(),district.getText(),st_name.getText(),st_number.getText(),home.getText(),mobile.getText(),work.getText());
//		setVisible(false);
		}	
		
	}

	

	
	public static void main(String[] args) {
		new Add();
	}
		
	
}


