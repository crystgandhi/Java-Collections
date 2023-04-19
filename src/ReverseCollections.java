import java.util.*;

public class ReverseCollections {

	public static void main(String[] args) {
		// print an array using loop
		String[] name = { "ABC", "DEF" };
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
		List<String> mylist = new ArrayList<String>();
		mylist.add("java");
		mylist.add("python");
		mylist.add("selenium");
		mylist.add("cucumber");
		System.out.println("List created: " + mylist);

		// print list using loop
		for (int i = 0; i < mylist.size(); i++) {
			System.out.println(mylist.get(i));
		}

		// Reverse String Array
		Collections.reverse(mylist);
		System.out.println("Reversed List: " + mylist);

		// Sort String Array
		Collections.sort(mylist);
		System.out.println("Sorted List: " + mylist);
	}

}
