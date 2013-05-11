import java.util.ArrayList;
import java.util.List;


public class Main {
	public static void main(String[] args) {
		printZeroToHund();
		printHundredToZero();
		printZeroToHund();
		printZeroToNegativeHund();
		printNegativeHundZeroTo();
		printZeroToNegativeHund();
		printFromList();
		printSecondArray();
		printthirdArray();
	}

	private static Boolean findThree(int b){
		String result = "" + b;
		if(result.contains("3")){
			return true;
		}else
		{
			return false;
		}
	}
	
	private static Boolean findFive(int b){
		String result = "" + b;
		if(result.contains("5")){
			return true;
		}else
		{
			return false;
		}
	}
	
	private static Boolean findThreeAndFive(int b){
		if((b % 3== 0)&& (b % 5 == 0)){
			return true;
		}else
		{
			return false;
		}
	}
	//find zeor
	private static Boolean findZero(int b){
		if(b == 0){
			return true;
		}else
		{
			return false;
		}
	}
	//zero to 100
	private static void printZeroToHund(){
		int result = 0 ;
		for(int i=0; i<=100;i++){
			if (findZero(i)){
				System.out.println("Zero");	
			}
			else if(findThreeAndFive(i)){
				System.out.println("fizzBuzz");
			}
			else if (i % 3 == 0)
			  {
				result= i;
                System.out.println("fizz");
			  }
			else if(i % 5 == 0){
				result =i;
                System.out.println("buzz"); 
			     }
			else if(findThree(i)){
				System.out.println("fizz");
			  }
			else if(findFive(i)){
				System.out.println("Buzz");
			  }
			else{
				result =i;
		     System.out.println(result);
			 }
		}
		System.out.println("END......");
	}
	//100 to 0	
		private static void printHundredToZero(){
			int result = 0 ;
			for(int i=100; i>=0 ;i--){
				if (findZero(i)){
					System.out.println("Zero");	
				}
				else if(findThreeAndFive(i)){
					System.out.println("fizzBuzz");
				}
				else if (i % 3 == 0)
				  {
					result= i;
	                System.out.println("fizz");
				  }
				else if(i % 5 == 0){
					result =i;
	                System.out.println("buzz"); 
				     }
				else if(findThree(i)){
					System.out.println("fizz");
				  }
				else if(findFive(i)){
					System.out.println("Buzz");
				  }
				else{
					result =i;
			     System.out.println(result);
				 }
			}
			System.out.println("END......");
	}
		//...........
		private static void printZeroToNegativeHund(){
			int result = 0 ;
			for(int i=0; i>=-100;i--){
				if (findZero(i)){
					System.out.println("Zero");	
				}
				else if(findThreeAndFive(i)){
					System.out.println("fizzBuzz");
				}
				else if (i % 3 == 0)
				  {
					result= i;
	                System.out.println("fizz");
				  }
				else if(i % 5 == 0){
					result =i;
	                System.out.println("buzz"); 
				     }
				else if(findThree(i)){
					System.out.println("fizz");
				  }
				else if(findFive(i)){
					System.out.println("Buzz");
				  }
				else{
					result =i;
			     System.out.println(result);
				 }
			}
			System.out.println("END......");
		}
	//-----
		private static void printNegativeHundZeroTo(){
			int result = 0 ;
			for(int i=-100; i<=-0;i++){
				if (findZero(i)){
					System.out.println("Zero");	
				}
				else if(findThreeAndFive(i)){
					System.out.println("fizzBuzz");
				}
				else if (i % 3 == 0)
				  {
					result= i;
	                System.out.println("fizz");
				  }
				else if(i % 5 == 0){
					result =i;
	                System.out.println("buzz"); 
				     }
				else if(findThree(i)){
					System.out.println("fizz");
				  }
				else if(findFive(i)){
					System.out.println("Buzz");
				  }
				else{
					result =i;
			     System.out.println(result);
				 }
			}
			System.out.println("END......");
		}
		//Array list-----
		private static void printFromList(){
			int result =0;
			int[] anArray= {2,5,7,9,12,15};
			 for(int i=0; i<anArray.length;i++){
				 result = anArray[i];
				 if (findZero(result)){
						System.out.println("Zero");	
					}
					else if(findThreeAndFive(result)){
						System.out.println("fizzBuzz");
					}
					else if (result % 3 == 0)
					  {
		                System.out.println("fizz");
					  }
					else if(result % 5 == 0){
		                System.out.println("buzz"); 
					     }
					else if(findThree(result)){
						System.out.println("fizz");
					  }
					else if(findFive(result)){
						System.out.println("Buzz");
					  }
					else{
				     System.out.println(result);
					 }
			  }
		}
		
		//Array list-----
				private static void printSecondArray(){
					int result =0;
					int[] anArray= {-3,-2,0,7,9,11};
					 for(int i=0; i<anArray.length;i++){
						 result = anArray[i];
						 if (findZero(result)){
								System.out.println("Zero");	
							}
							else if(findThreeAndFive(result)){
								System.out.println("fizzBuzz");
							}
							else if (result % 3 == 0)
							  {
				                System.out.println("fizz");
							  }
							else if(result % 5 == 0){
				                System.out.println("buzz"); 
							     }
							else if(findThree(result)){
								System.out.println("fizz");
							  }
							else if(findFive(result)){
								System.out.println("Buzz");
							  }
							else{
						     System.out.println(result);
							 }
					  }
					 System.out.println("END......");
				}
				
				//Array list-----
				private static void printthirdArray(){
					int result =0;
					int[] anArray= {0};
					 for(int i=0; i<anArray.length;i++){
						 result = anArray[i];
						 if (findZero(result)){
								System.out.println("Zero");	
							}
							else if(findThreeAndFive(result)){
								System.out.println("fizzBuzz");
							}
							else if (result % 3 == 0)
							  {
				                System.out.println("fizz");
							  }
							else if(result % 5 == 0){
				                System.out.println("buzz"); 
							     }
							else if(findThree(result)){
								System.out.println("fizz");
							  }
							else if(findFive(result)){
								System.out.println("Buzz");
							  }
							else{
						     System.out.println(result);
							 }
					  }
				}
				
			private static void	printArray(int[] ray){
					
				}
			private static void arraylists(){
				
				int[] rray1= {2,5,7,9,12,15};
				int[] rray2= {-3,-2,0,7,9,11};
				int[] rray3= {0};
				List<int[]> banchOfArrays = new ArrayList<int[]>();
				banchOfArrays.add(rray1);
				banchOfArrays.add(rray2);
				banchOfArrays.add(rray3);
				
				while(!banchOfArrays.isEmpty()){
					printArray(banchOfArrays.)
				}
			}
	/* (non-Java-doc)
	 * @see java.lang.Object#Object()
	 */
	public Main() {
		super();
	}

}