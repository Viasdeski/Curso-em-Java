package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMapResposta {
	
	public static void main(String[] args) {
	
		Consumer<Integer> println = System.out::println;
		
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
		UnaryOperator<String> reverse = str -> new StringBuilder(str).reverse().toString();
		Function<String, Integer> convertInt = str -> Integer.parseInt(str, 2);
		
		nums.stream()
			.map(Integer::toBinaryString)
			.map(reverse)
			.map(convertInt)
			.forEach(println);
	}
}
