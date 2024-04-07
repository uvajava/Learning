import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindallDuplicateNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List <Integer> nums = Arrays.asList(1,2,2,3,3,4,5,6,7,6,7);
		
		List <Integer> duplicate = nums.stream()
		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		.entrySet()
		.stream()
		.filter(x->x.getValue()>1)
		.map(Map.Entry::getKey)
		.collect(Collectors.toList());
		
		System.out.println(duplicate);
	}

}
