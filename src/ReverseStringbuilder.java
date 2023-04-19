
public class ReverseStringbuilder {

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("JavaProgramming");
		System.out.println(str);
		
		System.out.println("Special");
		System.out.println(str.toString());
		
		System.out.println("Substring");
		String subStr = str.substring(4);
		System.out.println(subStr);
		
				
		System.out.println("Reversed");
		StringBuilder reverseStr = str.reverse();
		System.out.println(reverseStr);
		
		System.out.println(reverseStr.toString());
		
		String subStr1 = str.substring(4);
		System.out.println(subStr1);

	}

}
