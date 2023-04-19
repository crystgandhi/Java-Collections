import java.util.*;

public class CollectionsReverseNumber {

	public static void main(String[] args) {
		Integer arr[] = { 70, 56, 340, 490, 150 };

		// print array using loop
				for (int i = 0; i < arr.length; i++) {
					System.out.print(arr[i] + " ");
				}
				System.out.println();

				// print contents using Arrays.toString()
				System.out.println("Given Array : " + Arrays.toString(arr));

		// Reverse an Array using collections
		Collections.reverse(Arrays.asList(arr));
		System.out.println("Reversed Array : " + Arrays.toString(arr));

		// Sort an Array using collections
		Collections.sort(Arrays.asList(arr));
		System.out.println("Soted Array : " + Arrays.toString(arr));
	}
}
//https://www.geeksforgeeks.org/collections-reverse-method-in-java-with-examples/
