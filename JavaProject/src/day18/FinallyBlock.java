package day18;

public class FinallyBlock {

	public static void main(String[] args) {
		String s=null;
		try
		{
			System.out.println(s.length());
		}
		
		catch(Exception e)
		{
			System.out.println("catch blocked handled");
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("finally blocked");
		}
		
		System.out.println("program finished");
		
	}

}
