import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Collectionsstream {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(91,32,73,14);
		System.out.println(list);  //[91,32,73,14]
		Collections.reverse(list); 
		System.out.println(list);  //[14,73,32,91]
		list.stream().sorted().forEach(System.out::println);
		// 14 32 73 91
		list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
		// 91 32 73 14
	}   

}
