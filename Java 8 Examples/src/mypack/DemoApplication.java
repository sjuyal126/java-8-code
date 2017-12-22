package mypack;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DemoApplication {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10); 
		Comparator<Integer> desclist = (Integer i1, Integer i2) -> (i2-i1);
		Collections.sort(list, desclist);
		list.stream().forEach(System.out::println);
	}

}
