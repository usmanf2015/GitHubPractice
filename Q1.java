//UsmanFarooq-15026371
//Lab Week4-Q1

public class Q1{
	static int staticVar=54;
	int nonStaticVar=64;
	
	public static void main(String[]args){

		//calling static method in static method
		staticMethod();

		//calling non-static method in static method
		//nonStaticMethod();
		//Q1.java:14: error: non-static method nonStaticMethod() cannot be referenced froma static context
		new Q1().nonStaticMethod();
	}
		
	public static void staticMethod(){
		//accessing static variable in static method
		System.out.println("StaticVar= " + staticVar);

		//accessing non-static variable in static method
		//System.out.println("NonStaticVar= " + nonStaticVar);
		//Q1.java:22: error: non-static variable nonStaticVar cannot be referenced from a static context
		System.out.println("NonStaticVar= " + new Q1().nonStaticVar);
	}
	
	public void nonStaticMethod(){
		//accessing static variable in non-static method
		System.out.println("StaticVar= " + staticVar);

		//accessing non-static variable in non-static method
		System.out.println("NonStaticVar= " + nonStaticVar);

		//calling static method in non-static method
		staticMethod();

		//calling non-static method in non-static method
		nonStaticMethod2();
	}

	public void nonStaticMethod2(){
		System.out.println("StaticVar= " + staticVar);
		System.out.println("NonStaticVar= " + nonStaticVar);
	}
}