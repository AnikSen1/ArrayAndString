package Strings;

import java.util.Arrays;

public class StringMethod {

	public static void main(String[] args) {
	//String class implements the CharSequence interface and extends Object class
		String v1="Create";
         String v2="Test";
         String v3="Case";
         System.out.println(v1.length());
         System.out.println(v1+" " + v2+" "+v3);
         //or
         System.out.println(v1.concat(" "+v2).concat(" "+v3));
         
         System.out.println(v1.contains("e"));//true
         System.out.println(v1.contains("E"));//false
         
         System.out.println(v1.substring(0, 3));//Cre
         System.out.println(v1.substring(3, 6));//ate
         
         System.out.println(v3.replace("Case", "Plan"));//Plan
         System.out.println(v3.replace("C", "Plan")); //Planase
         System.out.println(v1.equals("CreatE")); //false(case sensitive)
         System.out.println(v1.equalsIgnoreCase("CreatE"));//true(not case sensitive)
         
         
         
         String str=" Anik  ";
         System.out.println(str.length());
         System.out.println(str.trim().length());
         
         String sentence="I am a QA Lead";
         String[] Words=sentence.split(" ");//After using split(), now it is an array
         System.out.println(Arrays.toString(Words));
         System.out.println("Number of words :"+Words.length);
	}

}
