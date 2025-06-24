package day21;

public class DuplicateInStringArray {

	public static void main(String[] args) {
		String str[]= {"Atul","Sam","Patil","Atul","Sam","Nil","Nil"};
		boolean status=false;
		for(int i=0; i<=str.length-1; i++)
		{
			for(int j=i+1; j<=str.length-1; j++)
			{
				if(str[i].equals(str[j]))
				{
					System.out.println("Duplicate element:"+str[i]);
					status=true;
				}
			}
		}
	
		if (status==false) {
            System.out.println("No duplicates found.");
        }
	}
	

}
