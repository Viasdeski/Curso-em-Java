package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;


public class DesafioMap {
	public static void main(String[] args) {
		/*
		 *1.Numero para string binaria
		 *2.Reverter a strin
		 *3.Converter de volta para inteiro 
		 */
		
		Consumer<Integer> println = System.out::println;
		
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
		Function<Integer, String> convertBinary = num -> Integer.toBinaryString(num);
		UnaryOperator<String> reverse = str -> str.chars().mapToObj(c -> (char) c).reduce("",(s, c) -> c + s, (s1, s2)-> s1 + s2);
		Function<String, Integer> convertInt = num -> Integer.parseInt(num, 2);
		
		nums.stream()
			.map(convertBinary)
			.map(reverse)
			.map(convertInt)
			.forEach(println);;
		
	}
	
//	public static String reverse(String str) {
//		StringBuilder reversed = new StringBuilder();
//		for(int i = str.length() - 1; i >=0; i--) {
//			reversed.append(str.charAt(i));
//		}
//		return reversed.toString();
//	}

}
