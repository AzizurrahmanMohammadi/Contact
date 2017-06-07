package Address_Book;

//   This class create for show better readability of code........ 
public class Contact {
     Name name;
     Address address;
     Phone_Number phone_number;
     
     public Contact(){
    	 name = new Name();
    	 address = new Address();
    	 phone_number = new Phone_Number();
    	
     }

	@Override
	public String toString() {
		return name+""+address+""+phone_number;
	}
    
     
     
}	