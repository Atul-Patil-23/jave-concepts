package day11;

public class GeatingsMain {

	public static void main(String[] args) {
		Greatins gr=new Greatins();
		gr.m1();  // 1

		//2
		String str=gr.m2();
		System.out.println(str);
		System.out.println(gr.m2());
		
		//3
		gr.m3("Atul", 30);
		
		//4
		String str2=gr.m4("Patil");
		System.out.println(str2);
		System.out.println(gr.m4("Patil"));
		
		
		
		
	}

}
