package day10_class_object;

public class Employee {

	// Variables - this is called class variables
	int eid;
	String name;
	String job;
	int sal;
	
	// Methods
	void show()  // void means this method return nothing
	{
		System.out.println(eid);
		System.out.println(name);
		System.out.println(job);
		System.out.println(sal);
	}
	
	
	/*public static void main(String[] args) {
		Employee emp1=new Employee();  // Here we created object "emp1" of "Employee" class
		emp1.eid=100;
		emp1.name="Atul";
		emp1.job="Manager";
		emp1.sal=10000;
		emp1.show();
		


	}*/

}
