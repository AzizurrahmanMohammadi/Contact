package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Display extends JDialog implements ActionListener{

	JScrollPane jp;
	JTable jt;
	
	
	
	public Display (String[][] elements,String header[]){
		
		setBounds(450, 150, 900, 700);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		jp = new JScrollPane();
		getContentPane().add(jp);
		

		jt = new JTable( elements, header);
		jp.setViewportView(jt);
		
		setVisible(true);
	}
	

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		
	}

	// This method print or show All element in ArrayList
		public static void Show_All_Element_AddressBook() {
			String header[] = {  "First Name", "Last Name", "Midle Name","Home Number",
		            "Mobile Number","Work Number","City","District","Street Name","Street Number" };

		    String elements [][] = new String [Address_Book.Address_Book.list.size()][10];
			for (int k = 0; k <Address_Book. Address_Book.list.size(); k++) {
				String[] tokens =Address_Book.Address_Book.list.get(k).toString().split("@");
				for (int i = k; i < elements.length; i++) {
					for (int j = 0; j < header.length; j++) {
						if(j<tokens.length){
						elements[i][j] = tokens[j];
					
					}}
				}
			}
			new Display(elements,header);
			
		}
//		public static void main(String[] args) {
//			String header[] = {  "First Name", "Last Name", "Midle Name","Home Number",
//		            "Mobile Number","Work Number","City","District","Street Name","Street Number" };
//
//		     String elements [][] = new String [Address_Book.list.size()][10];
//			
//		    Display.Show_All_Element_AddressBook();
//		
//		
//		}
		 
			
	    
}
