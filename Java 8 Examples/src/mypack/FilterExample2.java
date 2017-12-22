package mypack;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FilterExample2 {

	//given an ordered list find the double of the first even number greater than 3
	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
		Optional<Integer> x = number.stream().filter(num -> num%2==0).filter(num -> num>3).findFirst().map(num -> num*2);
		if (x.isPresent()) {
			System.out.println(x.get());
		}
	}
}
