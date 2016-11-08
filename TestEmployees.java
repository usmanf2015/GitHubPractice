//UsmanFarooq-15026371
//Lab Week4-Q4
public class TestEmployees{
	public static void main(String[]args){
		//makins 3 objects of same class employees
		Employees e1=new Employees();
		Employees e2=new Employees();
		Employees e3=new Employees();
		
		//assigning values to first object
		e1.setFirstName("Ali");
		e1.setLastName("Zaib");
		e1.setContactNumber("0300*******");
		e1.setID("001");

		//assigning values to second object
		e2.setFirstName("Hamza");
		e2.setLastName("Ali");
		e2.setContactNumber("0310*******");
		e2.setID("002");
		
		//assigning values to third object
		e3.setFirstName("Faizan");
		e3.setLastName("Ali");
		e3.setContactNumber("0320*******");
		e3.setID("003");

		//printins values of first object
		System.out.println(e1.getFirstName()+" "+e1.getLastName()+"\t"+e1.getContactNumber()+"\t"+e1.getID());

		//printins values of second object
		System.out.println(e2.getFirstName()+" "+e2.getLastName()+"\t"+e2.getContactNumber()+"\t"+e2.getID());

		//printins values of third object
		System.out.println(e3.getFirstName()+" "+e3.getLastName()+"\t"+e3.getContactNumber()+"\t"+e3.getID());

	}
}