import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatefromagivenSting {

	public static void main(String[] args) {
			
	List <Integer> numbers = Arrays.asList(1,2,2,3,3,4,5,6,7,7,8,8,9);
	List <Integer> duplicationnums= numbers.stream()
			.distinct().toList();
	
	System.out.println("Before removing duplicates" + numbers);
	System.out.println("After Removing duplicates" + duplicationnums);
	
}
}


