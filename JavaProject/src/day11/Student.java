package day11;

public class Student {

	// Class variables. This is used throughout the class only
	
	int sid;
	String name;
	char grad;
	
	//Method
	void printSudentdata()
	{
		System.out.println(sid+" " + name + " " + grad);
	}
	
	void setStudentData(int id,String str,char gr)
	{
		sid=id;
		name=str;
		grad=gr;
	}
	
	//constructor
	Student(int id,String str,char gr)
	{
		sid=id;
		name=str;
		grad=gr;
	}
	
}
