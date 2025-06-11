package day7;

public class SearchingElementInArray {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,60};
		int search_ele=30;
		boolean status=false;
		for(int i=0; i<=a.length-1; i++) 
		{
			if(a[i]==search_ele)
			{
				System.out.println("element found");
				status=true;
				break;
			}
			
		}
		
		/*for(int x:a)
		{
			if(x==search_ele)
			{
				System.out.println("element found");
				status=true;
				break;
			}
			
		}*/
		
		if(status==false) {
		System.out.println("element not found");
		}
	}

}
