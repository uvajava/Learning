//Write a Java Program to find first non repeated element from a Give String.

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Nonrepeated {

	public static void main(String[] args) {

String s = "Firstnonrepeated";

String ss= Arrays.stream(s.split(""))
.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()))
.entrySet().stream()
.filter(x->x.getValue()==1)
.findFirst()
.get().getKey();

System.out.println(ss);

	}

}
