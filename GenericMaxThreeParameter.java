package GenericProblem;
import java.util.Collections;
import java.util.ArrayList;
public class GenericMaxThreeParameter {
	
	public void maxInteger() {
		
		ArrayList<Integer> Intvalue = new ArrayList<Integer>();
		
	    Intvalue.add(21);
	    Intvalue.add(49);
	    Intvalue.add(56);
	    Intvalue.add(89);
	    Intvalue.add(50);
	    //sorting in reverseOrder
	    Collections.sort(Intvalue, Collections.reverseOrder());
	    
	    
		System.out.println("The Maximum string value is:" + Intvalue);
	    
		}
	    //main method
	    public static void main(String args []) {
	    	GenericMaxThreeParameter obj = new GenericMaxThreeParameter();
	    	
	    	//call the function
	    	obj.maxInteger();
	    	
	    }

	}
