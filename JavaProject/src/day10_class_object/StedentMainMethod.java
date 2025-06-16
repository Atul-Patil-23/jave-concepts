package day10_class_object;

public class StedentMainMethod {

	public static void main(String[] args) {
		Student std1=new Student();  //Create "std1" object of Student class
		std1.sid=100;
		std1.name="Atul";
		std1.grade='B';
		std1.print();
		
		// we can create multiple objects of same class
		Student std2=new Student();  // Create "std2" object of Student class
		std2.sid=200;
		std2.name="Aksahy";
		std2.grade='A';
		std2.print();
	}

}
