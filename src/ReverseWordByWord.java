import java.util.Arrays;
import java.util.List;

public class ReverseWordByWord {

	public static void main(String[] args) {
		String given = "learning oops concepts in java";
		String[] words = given.split(" ");
		String reversed = "";
		System.out.println("Given : " + given);
		for (int k = 0; k < words.length; k++) {
			String wordsArray="";
			wordsArray=wordsArray+words[k]+" ";
			char[] chArray = wordsArray.toCharArray();
			for (int j = chArray.length - 1; j >= 0; j--) {
				reversed = reversed + chArray[j];
			}
		}
		System.out.println("Reversed word by word : " + reversed);
		List<String> w=Arrays.asList(words);
		System.out.println(w.stream().anyMatch(a->a.contains("Java")));
		w.stream().sorted().forEach(System.out::println);
	}
}