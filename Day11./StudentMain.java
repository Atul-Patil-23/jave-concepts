package day11;

public class StudentMain {

	public static void main(String[] args) {
		//Student stu=new Student();
		
		//Using object reference variable
		/*stu.sid=10;
		stu.name="Akshay";
		stu.grad='A';
		stu.printSudentdata();
*/
		
		// using method
		/*stu.setStudentData(12,"Rohit", 'C');
		stu.printSudentdata();
		*/
		
		// using constructor
		Student stu=new Student(12,"Rohit", 'C');
		stu.printSudentdata();
	}

}
