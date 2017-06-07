package View;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import Address_Book.Address_Book;

public class Edit extends JDialog {
	JPanel jpanel;
	
	JLabel logo;
	
	JLabel name;
	JLabel f_name;
	JLabel last_name;
	JLabel midle_name;
	
	JLabel address;
	JLabel city_lable;
	JLabel district_address;
	JLabel st_Name;
	JLabel st_Number;
	
	JLabel phone_Number;
	JLabel home_number;
	JLabel mobile_number;
	JLabel work_number;
	
	JTextField first_name;
	JTextField last_Name;
	JTextField midle_Name;
	
	JTextField city;
	JTextField district;
	JTextField st_name;
	JTextField st_number;
	
	JTextField home;
	JTextField mobile;
	JTextField work;
	
    JButton ok;
    
	public Edit() {
		setBounds(450, 150, 428, 500);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLayout(null);
		
		
	
		jpanel = new JPanel();
		setContentPane(jpanel);
		setLayout(null);
		getContentPane().setBackground(Color.white);
		
		logo = new JLabel();
		logo.setBounds(250,50, 130, 180);
		jpanel.add(logo);
		ImageIcon img = new ImageIcon("F:/Tiyan/2.jpg");
		logo.setIcon(img );
		
		name = new JLabel(" Name ");
		name.setBounds(102, 10, 46, 14);
		jpanel.add(name);
		
		f_name = new JLabel("First name");
	    f_name.setBounds(11, 38, 46, 14);
		jpanel.add(f_name);
		
		last_name = new JLabel("Last name");
		last_name.setBounds(11, 69, 59, 14);
		jpanel.add(last_name);
		
		midle_name = new JLabel("Midle name");
		midle_name.setBounds(10, 100, 59, 14);
		jpanel.add(midle_name);
		
		
		
		address = new JLabel("Address");
		address.setBounds(102, 124, 75, 14);
		jpanel.add(address);
		
		city_lable = new JLabel("City");
		city_lable.setBounds(11, 152, 46, 14);
		jpanel.add(city_lable);
		
		district_address = new JLabel("district");
		district_address.setBounds(11, 185, 46, 14);
		jpanel.add(district_address);
		
		st_Name = new JLabel("Street name");
		st_Name.setBounds(8, 215, 62, 17);
		jpanel.add(st_Name);
		
		st_Number = new JLabel("Street Num");
		st_Number.setBounds(8, 247, 59, 17);
		jpanel.add(st_Number);
		
		phone_Number = new JLabel("Phone Numbers");
		phone_Number.setBounds(67, 275, 160, 14);
		jpanel.add(phone_Number);
		
		home_number = new JLabel("home_number");
		home_number.setBounds(8, 303, 46, 14);
		jpanel.add(home_number);
		
		mobile_number = new JLabel("mobile_number Number");
		mobile_number.setBounds(11, 334, 46, 14);
		jpanel.add(mobile_number);
		
		work_number = new JLabel("work_number");
		work_number.setBounds(11, 365, 46, 14);
		jpanel.add(work_number);
		
		first_name = new JTextField();
		first_name.setBounds(67, 35, 149, 20);
		jpanel.add(first_name);
		
		
		last_Name = new JTextField();
		last_Name.setBounds(67, 66, 149, 20);
		jpanel.add(last_Name);
		
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
		work.setColumns(10);
		work.setBounds(67, 362, 149, 20);
		jpanel.add(work);
		
		
		
		ok = new JButton("Accept");
		ok.setBounds(318, 409, 89, 23);
		jpanel.add(ok);
	
		setVisible(true);
	}
	
}
