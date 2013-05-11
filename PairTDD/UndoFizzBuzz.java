package fizzbuzz.pairtdd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UndoFizzBuzz {
	private static final String FIZZ = "Fizz";
	private static final String BUZZ = "Buzz";
	
	public static List<List<Double>> generateUndoneFizzBuzz(List<String> fizzBuzz) {
		List<Double> fizzes = new ArrayList<Double>();
		List<Double> buzzes = new ArrayList<Double>();
		List<Double> fizzBuzzes = new ArrayList<Double>();
		
		Double startValue = Double.parseDouble(fizzBuzz.get(0));
		for( int index = 0; index < fizzBuzz.size(); index++ ) {
			String element = fizzBuzz.get(index);
			double currentValue = startValue + index;
			if( element.equals(FIZZ) ) {
				fizzes.add(currentValue);
			} else if( element.equals(BUZZ) ) {
				buzzes.add(currentValue);
			} else if (element.equals(FIZZ+BUZZ) ) {
				fizzBuzzes.add(currentValue);
			}
		}
		
		List<List<Double>> undone = new ArrayList<List<Double>>();
		for( String element : fizzBuzz ) {
			if( element.equals(FIZZ) ) {
				undone.add(fizzes);
			} else if( element.equals(BUZZ) ) {
				undone.add(buzzes);
			} else if ( element.equals(FIZZ+BUZZ) ) {
				undone.add(fizzBuzzes);
			} else {
				undone.add(Arrays.asList(new Double[] {Double.parseDouble(element)}));
			}
		}
		
		return undone;
	}

}
