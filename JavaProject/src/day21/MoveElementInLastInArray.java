package day21;

import java.util.Arrays;

public class MoveElementInLastInArray {

	public static void main(String[] args) {
		int a[] = {1, 2, 3, 0, 4, 0, 6, 7};
        int n = a.length;
        int[] result = new int[n];

        int index = 0;

        // Copy non-zero elements
        for (int i = 0; i < n; i++) {
            if (a[i] != 0) {
                result[index++] = a[i];
            }
        }

        // Remaining elements will be 0 (by default in a new int array)

        // Print the updated array
        System.out.println("After moving zeros to the end:");
        System.out.println(Arrays.toString(result));

	}

}
