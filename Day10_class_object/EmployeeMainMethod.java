package day10_class_object;

public class EmployeeMainMethod {
	
	// Here we created another class which contains main method inside the same package.
	// If class is present in another package then, we need to import that class.
	// Eg. import packagename.classname
	
	public static void main(String[] args) {
		Employee emp1=new Employee();  // Here we created object "emp1" of "Employee" class
		emp1.eid=100;
		emp1.name="Atul";
		emp1.job="Manager";
		emp1.sal=10000;
		emp1.show();
		
	}

}
