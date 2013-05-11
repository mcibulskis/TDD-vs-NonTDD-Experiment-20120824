import java.util.ArrayList;


public class FizzBuzzer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Input:  1,2,Fizz,4,Buzz,Fizz,7,8,Fizz,Buzz
		
		//Output:
//		1
//		2
//		[3,6,9]
//		4
//		[5,10]
//		[3,6,9]
//		7
//		8
//		[3,6,9]
//		[5,10]
//		
		

// Get the number of arguments passed in

//Loop through each argument
//	if it's a string
//		Convert Fizz or Buzz to multiples
//	else
//		Convert like we do now

		int numberOfArgs = getNumberOrArgs(args);
		int startingNumber = Integer.parseInt(args[0]);
		int lastNumber = startingNumber + numberOfArgs;
		
		
		
		for (int i=startingNumber; i < lastNumber; i++)
		{
			if (isDouble(args[i]))
			{
				double number = Double.parseDouble(args[i]);
				if (number < 0)
				{
					number = number * -1;
				}
				
				System.out.println(fizzBuzzConverter(number));
			}
			else
			{
				 ArrayList<String> result = fizzBuzzToNumbers(args[i], startingNumber, lastNumber);
				 
				 String resultString = "[";
				 
				 for (String resultItem : result) {
					 resultString += resultItem + ",";
				 }
				 resultString = resultString.substring(0,(resultString.length() - 1));
				 resultString += "]";
				 
				 System.out.println(resultString);
			}
		}

		
		
		
		//Array
//		 String[] fizzArray;
//		 fizzArray = getFizzBuzzArray();
//		 
//		 for (int i = 0; i < args.length; i++)
//		 {
//		 	 if ((isDouble(args[i]) == true) || (isInteger(args[i]) == true))
//			 {
//				 double number = Double.parseDouble(args[i]);
//				 boolean isNegative = false;
//				 if (number < 0.00)
//				 {
//					 isNegative = true;
//					 number = number * -1;
//				 }
//				 
//				 String result = fizzBuzzConverter(Double.parseDouble(args[i]));
//				 
//				 if (isInteger(result))
//				 {
//					 int resultNumber = Integer.parseInt(result);
//					 
//					 if (isNegative == true)
//					 {
//						 resultNumber = Integer.parseInt(result) * -1; 
//					 }
//					 
//					 System.out.println(resultNumber);
//				 }
//				 else
//				 {
//					 System.out.println(result);
//					 
//				 }
//				 
//			 }			 
//		 }
	}
	
	public static ArrayList<String> fizzBuzzToNumbers(String input, int startingNumber, int endingNumber)
	{
		ArrayList<String> multiplesArray = new ArrayList();
		
		for (int i = startingNumber; i<=endingNumber; i++)
		{
			if (fizzBuzzConverter((double)i) == input)
			{
				 multiplesArray.add(Integer.toString(i));				
			}
		}
		return multiplesArray;		
	}
	
	
	public static int getNumberOrArgs(String[] args)
	{
		return args.length;
	}
	
	public static String[] getFizzBuzzArray()
	{
		 String[] fizzArray;
		 fizzArray = new String[101];
		 
		for (int i = 0; i <= 100; i++)
		{
			fizzArray[i] = fizzBuzzConverter((double)i);
		}
		
		return fizzArray;
				
	}
	
	
	public static String fizzBuzzConverter(double number)
	{
		String returnValue;
		
		if (number == 0)
		{
			returnValue = "zero";
		}
		else if (((number % 3) == 0) & ((number % 5) == 0))
		{
			returnValue = "FizzBuzz";
		}
		else if ((number % 3) == 0)
		{
			returnValue = "Fizz";
		}
		else if ((number % 5) == 0)
		{
			returnValue = "Buzz";
		}
		
		else if (Double.toString(number).contains("3"))
		{
			returnValue = "Fizz";
		}
		else if (Double.toString(number).contains("5"))
		{
			returnValue = "Buzz";
		}
		
		else
		{
			returnValue = Double.toString(number);
		}
		
		return returnValue;
		
	}
	
	
	
	public static boolean isInteger(String i)
	{
		try
		{
			
			Integer.parseInt(i);
			return true;
		}
		catch(NumberFormatException nfe)
		{
			return false;
		}
	}

	public static boolean isDouble(String i)
	{
		try
		{
			
			Double.parseDouble(i);
			return true;
		}
		catch(NumberFormatException nfe)
		{
			return false;
		}
	}	
	
}
