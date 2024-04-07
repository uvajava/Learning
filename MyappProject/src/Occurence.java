import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
//.Java Program to count the occurence of each character in a String.
public class Occurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



String s = "JavaLearningProcess";
		
		Map <String ,Long> Occurence = Arrays.stream(s.split(""))
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(Occurence);
	}

}
