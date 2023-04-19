import java.util.Arrays;
import java.util.List;

public class LambdaExpression {

	public static void main(String[] args) {
		List<Integer> li=Arrays.asList(85, 19, 21,56);
		System.out.println(li);
		li.forEach(n->{System.out.println(n);});
	}

}
