package fizzbuzz.pairtdd;

import java.util.List;

public class Runme {
	public static void main(String[] args) {
		List<Double> numbers = FizzBuzz.generateNumberList();
		List<String> results = FizzBuzz.generateFinalList(numbers);
		for( String element : results ) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
}
