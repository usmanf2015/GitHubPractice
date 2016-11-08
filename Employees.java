//UsmanFarooq-15026371
//Lab Week4-Q4
public class Employees{
	private String firstName;
	private String lastName;
	private String contactNo;
	private String id;
		
	public void setFirstName(String name){
		firstName=name;
	}
	
	public void setLastName(String name){
		lastName=name;
	}

	public String getFirstName(){
		return firstName;
	}

	public String getLastName(){
		return lastName;
	}
	
	public void setID(String num){
		id=num;
	}

	public void setContactNumber(String num){
		contactNo=num;
	}
		
	public String getID(){
		return id;
	}

	public String getContactNumber(){
		return contactNo;
	}
}