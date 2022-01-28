package arrays;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		
		int a []= {1,2,3};
		
		for(int i=0; i<a.length; i++)
		{
	    System.out.print(a[i]+ "  ");
	   
		//System.out.println(a[i]);
		}
		
	
	System.out.println("OR");
	int b []= new int [3];
	b[0]=2;
	b[1]=2;
	b[2]=3;
	
	for(int i=0; i<b.length; i++)
	{
    System.out.print(b[i]+ "  ");
	//System.out.println(a[i]);
	}
	
	
	System.out.println("OR");
	for (int i:b) {
	System.out.print(i+ "  ");
	}
	
	
	
	System.out.println("OR");
	int [] c= {4,2,3};
	
	int sum=0;
	for (int i:c) {
	System.out.print(i+ "  ");
	sum=sum+i;
		}
	System.out.println("<<<<<<<<<<>>>>>>>>>>>");
	System.out.println(sum);

	
	System.out.println("OR");
	int d []= new int [3];
	d[0]=5;
	d[1]=2;
	d[2]=3;
	for (int i:d) {
		System.out.print(i+ "  ");
		}
	
	System.out.println("Single String Array");
	String [] e= new String[3];
	e[0]="Anik";
	e[1]="Samia";
	e[2]="Roshid";
	for (String i:e) 
	    {
	System.out.print(i+ "  ");
		}
	
	
	System.out.println("OR");
	String f [] = new String[3];
	f[0]="Anik";
	f[1]="Samia";
	f[2]="Roshid";
	for (String i:f) 
	    {
	System.out.print(i+ "  ");
		}
	
	
	System.out.println("OR");
	String [] g= {"Anik","Samia","Roshid"};
	for (String i:g) 
	    {
	System.out.print(i+ "  ");
		}
	}
}
