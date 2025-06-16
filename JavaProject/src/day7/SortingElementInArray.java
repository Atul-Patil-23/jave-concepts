package day7;

import java.util.Arrays;

public class SortingElementInArray {

	public static void main(String[] args) {
		int a[]= {20,5,10,8,44,17};
		System.out.println("Before sorting:"+Arrays.toString(a));
		
		
		Arrays.sort(a);
		System.out.println("after sorting:"+Arrays.toString(a));
		//System.out.println(Arrays.toString(a));
		
	}

}
