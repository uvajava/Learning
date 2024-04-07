//Java Program to find all the duplicate element in a Given String

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicatefromagivenString {

	public static void main(String[] args) {
		
		String s = "DuplicateElements";
		List <String> duplicate = 	Arrays.stream(s.split(""))
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet().stream()
		.filter(x->x.getValue()>1)
		.map(Map.Entry::getKey)
		.collect(Collectors.toList());
		
		System.out.println(duplicate);

	}

}
