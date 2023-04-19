import java.util.Arrays;
import java.util.List;

public class LambdaFunction2 {

	public static void main(String[] args) {
		String[] places = { "Canada", "India", "Singapore", "USA", "Spain" , "Iran", "Italy", "Indonesiya"};
		List<String> myplaces = Arrays.asList(places);
		myplaces.stream().filter((p) -> p.startsWith("S")).map((p) -> p.toUpperCase()) 
		.sorted().forEach((p) -> System.out.println(p));
		myplaces.stream().sorted().forEach((p) -> System.out.println(p));
		myplaces.stream().filter((p)-> p.startsWith("C")).forEach((p) -> System.out.println(p));
		myplaces.stream().map((p) -> p.toUpperCase()).forEach((p) -> System.out.println(p));
	}

}


