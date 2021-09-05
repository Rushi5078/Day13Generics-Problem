package GenericProblem;
import java.util.Scanner;
public class MaximumNumber {

	
		//declare the method to find Maximum of three Number
		public Integer MaximumInteger(Integer firstnumber, Integer secondnumber, Integer thirdnumber) {
			Integer maxInteger = firstnumber;
			if (secondnumber.compareTo(maxInteger) > 0)
				maxInteger = secondnumber;
			if (thirdnumber.compareTo(maxInteger) > 0)
				maxInteger = thirdnumber;
			System.out.println("The Maximum Number is :"+maxInteger);
			return maxInteger;
		}
     //main method
		public static void main(String[] args) {
			System.out.println("Welcome to program");
			   MaximumNumber obj = new MaximumNumber();
			
			//get Number from user 
	         Scanner sc =new Scanner(System.in);
	         System.out.println("Enter first number");
	         Integer x = sc.nextInt();
	         System.out.println("Enter second number");
	         Integer y = sc.nextInt();
	         System.out.println("Enter third number");
	         Integer z = sc.nextInt();
	         
	 		 obj.MaximumInteger(x,y,z);

		}
	}
