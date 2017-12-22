package mypack;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class FilterExamples {

	public static void main(String[] args) {
		 
		List<String> list = Arrays.asList("aaa", "bbb", "cc", "dddd", "ee");
		boolean result = list.stream().filter(str -> str.length()>2)
		.allMatch(str -> str.length()>5);
		System.out.println(result);
		
	}
	
}
