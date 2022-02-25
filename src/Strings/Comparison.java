package Strings;

public class Comparison {

	public static void main(String[] args) {
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		System.out.println("Comparision using '==' with creating object : "+s1==s2);//false
		System.out.println("Comparision using 'equals()' with creating object: "+s1.equals(s2));//true
		
		
		
		String s3 = "CherCher tech";
		String s4 = "CherCher tech";

		System.out.println("Comparision using '==' with double cote : " + (s3 == s4));
		System.out.println("Comparision using 'equals()' with double cote: " +(s3.equals(s4)));
	
		
	}

}
