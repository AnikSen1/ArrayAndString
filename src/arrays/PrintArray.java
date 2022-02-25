package arrays;

import java.util.Arrays;
import java.util.Iterator;

public class PrintArray {
	
	
	
	public static void main(String[] args)   
	{  
	//declaration and initialization of an array of Double type  
	Double[] array = { 1.5, 2.6, 3.7, 4.8, 5.9};  
	//returns an iterator   
	Iterator<Double> itr = Arrays.asList(array).iterator();  
	while(itr.hasNext()) //returns a boolean value  
	{  
	System.out.print(itr.next()+" ");  
	}
	System.out.println(Arrays.toString(array));
	System.out.println(Arrays.deepToString(array));
	System.out.println(Arrays.asList(array));
	
	
	String[] sArray= {"anik","java","ani"};
	
	System.out.println(Arrays.toString(sArray));
	System.out.println(Arrays.deepToString(sArray));
	System.out.println(Arrays.asList(sArray));
	
	
	//For printing multi dimensional array, we use Arrays.deepToString(array) method
	
	int [][] multiInt= {{10,20,30}, {11,21,31}};
	//System.out.println(Arrays.toString(multiInt));//not work
	System.out.println(Arrays.deepToString(multiInt));
	//System.out.println(Arrays.asList(multiInt));//not work
	
	double [][] multidoub= {{10.5,2.0,30.6}, {1.1,2.1,3.1}};
	//System.out.println(Arrays.toString(multiInt));//not work
	System.out.println(Arrays.deepToString(multidoub));
	//System.out.println(Arrays.asList(multiInt));//not work
	
	
	String[][] multiStr= {{"anik","java"}, {"anik","java"},{"as","gh"}};
	//System.out.println(Arrays.toString(multiStr));//not work
	System.out.println(Arrays.deepToString(multiStr));
	//System.out.println(Arrays.asList(multiStr));/not work
	
	
	}  
}
