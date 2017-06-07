package Address_Book;

public class Address {
	 String city;
	 String district;
	 String street_name;
     String street_number;
	
	public Address() {		
		
	}

	
	public String toString(){
		return  city + "@" + district + "@" +  street_name + "@" +  street_number +"@" ;
		
	}
	

}
