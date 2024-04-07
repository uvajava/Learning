//Find the Second HighestNumber from a given array?

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Second {

	public static void main(String[] args) {

		int [] nums = {5,9,7,8,6,5,2,};
		
	Integer secondhighest = 	Arrays.stream(nums).boxed()
		.sorted(Comparator.reverseOrder())
		.skip(1)
		.findFirst()
		.get();
		
		System.out.println(secondhighest);
	}

}
