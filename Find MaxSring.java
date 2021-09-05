package GenericProblem;

import java.util.Scanner;

public class MaxString {


	//declare the method to find Maximum of three Alphabet
			public String MaximumString(String firstString,String secondString,String thirdString) {
				String maxString = firstString;
				if (secondString.compareTo(maxString) > 0)
					maxString = secondString;
				if (thirdString.compareTo(maxString) > 0)
					maxString = thirdString;
				System.out.println("The Maximum String is :"+maxString);
				return maxString;
			}
	     //main method
			public static void main(String[] args) {
				System.out.println("Welcome to program");
				   MaxString obj = new MaxString();
				
				//get String from user 
		         Scanner sc =new Scanner(System.in);
		         System.out.println("Enter first String");
		        String x = sc.next();
		         System.out.println("Enter second String");
		        String y = sc.next();
		         System.out.println("Enter third String");
		        String z = sc.next();
		         
		 		 obj.MaximumString(x,y,z);

			}
		}  	


