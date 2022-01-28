package Strings;

public class StringMethod {

	public static void main(String[] args) {
		
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
         
         System.out.println(v3.replace("Case", "Plan"));
         System.out.println(v1.equals("CreatE")); //false(case sensitive)
         System.out.println(v1.equalsIgnoreCase("CreatE"));//true(not case sensitive)
	}

}
