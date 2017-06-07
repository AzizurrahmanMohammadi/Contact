package Address_Book;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Address_Book {

	// Create Array list for saving Data Unlimite
	public static ArrayList<Contact> list = new ArrayList<Contact>();

	// Create Add Person Class for Adding information
	public static void Add_Person(String f_name, String l_name, String m_name,
			String phone_Number, String home_number, String work_number,
			String city, String district, String street_name,
			String street_number) {

		Contact temp = new Contact();
		temp.name.first_name = f_name;
		temp.name.last_name = l_name;
		temp.name.midle_name = m_name;
		temp.phone_number.home_number = home_number;
		temp.phone_number.mobile_number = phone_Number;
		temp.phone_number.work_number = work_number;
		temp.address.city = city;
		temp.address.district = district;
		temp.address.street_name = street_name;
		temp.address.street_number = street_number;
		list.add(temp);

	}

	/*
	 * This method is used to search inside other methods and receive a string
	 * parameter after is seeking to have two modes: 
	 * 1: If the parameter is not needed to find a message that method   Search_Exist_Element
	 *  2: If their goal was to find parameter returns
	 */

	static int Search_Exist_Element(String input) {
		int index = -1;
		for (int i = 0; i < list.size(); i++)
			if (list.get(i).name.first_name.equals(input))
				index = i;

		return index;

	}

	

	// This method remove element in terms of searching name
	public static void Remove_person(String name) {
		int k = Search_Exist_Element(name);
		if (k < 0) {
			JOptionPane.showMessageDialog(null, "name is not exist");
		}

		else {
			list.remove(k);
			JOptionPane.showMessageDialog(null, "SUCCESFULLE REMOVED");
		}

	}

	// This method remove element in terms of searching Phone Number
	public static void Remove_person_by_phone_Number(String phone_Number) {
		int k = Search_Exist_Element(phone_Number);
		if (k < 0) {
			JOptionPane.showInputDialog(null, "Phone Number is not exist");
		} else {
			JOptionPane.showInputDialog(null, list.remove(phone_Number));
		}

	}

	// This method find element in terms of searching name
	public static void Find_By_Name(String name) {
		int result = Search_Exist_Element(name);
		if (result < 0) {
			JOptionPane.showMessageDialog(null, "name is not exist");
		} else {
			JOptionPane.showMessageDialog(null, list.get(result));
		}
	}

	// This method Edit element in terms of searching name
	static void Edit_Person(String name) {
		int search = Search_Exist_Element(name);
		if (search < 0) {
			System.out.println("Not Found");
		} else {
			Contact temp =list.get(search);
			
            
			

		}

	}

}
