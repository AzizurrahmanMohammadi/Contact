package View;

import image.Demo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Address_Book.Address_Book;
import View.Display;

// This class extends class JFrame and implement interface For all methods of use 
public class Common extends JFrame implements ActionListener {
	JPanel jpanel;
	JButton Add;
	JButton Show_Person;
	JButton Edit;
	JButton Remove;
	JButton Search;
	JLabel  logo;
	JLabel  header_picture;
	
	

	public Common(String name) {
		
		
	
		setBounds(450, 150, 600, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		

		jpanel = new JPanel();
		setContentPane(jpanel);
		setLayout(null);
		getContentPane().setBackground(new Color(80,45,45));
		
		header_picture = new JLabel();
		header_picture.setBounds(0,0, 600, 100);
		jpanel.add(header_picture);
		ImageIcon img = new ImageIcon("F:/Tiyan/aza.png");
		header_picture.setIcon(img );
		
		logo = new JLabel();
		logo.setBounds(0,60, 450, 500);
		jpanel.add(logo);
		ImageIcon im = new ImageIcon("F:/Tiyan/as.png");
		logo.setIcon(im );
		
		Add = new JButton("Add");
		Add.setBounds(450, 140, 100, 30);
		jpanel.add(Add);
		Add.addActionListener(this);
		
		
		Show_Person = new JButton(" Display ");
		Show_Person.setBounds(450, 210, 100, 30);
		jpanel.add(Show_Person);
		Show_Person.addActionListener(this);

		Edit = new JButton("Edit");
		Edit.setBounds(450, 280, 100, 30);
		jpanel.add(Edit);
		Edit.addActionListener(this);

		Remove = new JButton("Remove");
		Remove.setBounds(450, 350, 100, 30);
		jpanel.add(Remove);
		Remove.addActionListener(this);

		Search = new JButton("Search");
		Search.setBounds(450, 420, 100, 30);
		jpanel.add(Search);
		Search.addActionListener(this);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent i) {

		JButton input = (JButton) i.getSource();

		if (input == Add) {
			new View.Add();
			
		}

		if (input == Edit) {
			new View.Edit();
			
			
		}

		if (input == Remove) {
			String input1 = JOptionPane.showInputDialog(Common.this,"for choice Remove by name input 1 \n  for Remove by Phone Number input 2");
			int change = Integer.parseInt(input1);
			if (change == 1){
			String name = JOptionPane.showInputDialog(Common.this,"Please input your name");
			Address_Book.Remove_person(name);    
			}
			else if (change == 2) {
				String phone_number = JOptionPane.showInputDialog(Common.this,
						"Please input your Phone Number");
				Address_Book.Remove_person_by_phone_Number(phone_number);
			}
			
			else{
				JOptionPane.showMessageDialog(Common.this, "your input is wrong");
			}
			
			
			
		}
		
		
		if (input == Show_Person){
	    Display.Show_All_Element_AddressBook();
			
		}
		
		if (input == Search){
			String name = JOptionPane.showInputDialog(Common.this,
					"Please input your name");
			Address_Book.Find_By_Name(name);
		}
		
		
	}

	public static void main(String[] args) {
		new Common("Add");
		
	}

}
