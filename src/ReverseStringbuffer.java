
public class ReverseStringbuffer {

	public static void main(String[] args) {
		String myname="Computer";
		int myNumber=11453;
		System.out.println(myname.toString());
		System.out.println(Integer.toString(myNumber));
	StringBuffer str = new StringBuffer("PythonProgramming");
		System.out.println(str);
		
		System.out.println("Special");
		System.out.println(str.toString());
		
		System.out.println("Substring");
		String subStr = str.substring(4);
		System.out.println(subStr);
		
				
		System.out.println("Reversed");
		StringBuffer reverseStr = str.reverse();
		System.out.println(reverseStr);
		String subStr1 = str.substring(4);
		System.out.println(subStr1);
		System.out.println(reverseStr.toString());


	}

}
