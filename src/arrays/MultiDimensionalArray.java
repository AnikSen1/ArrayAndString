package arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {

	int [][] a= {{10,20,30}, {11,21,31}};
	for(int i=0; i<2;i++)
	{
		for(int j=0;j<3;j++)
		{
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
		}
	
	
	
	System.out.println("Using for-each loop");
	for(int[] i:a) 
	{
		for(int j:i) 
		{
			System.out.print(j+" ");	
		}
	
	System.out.println();
	}
	
	
	
	System.out.println(">>>>>>>>>>>>>>>>> " + "Same Thing In Different way");
	int[][] b= new int[2][3];
	b[0][0]=40;
	b[0][1]=50;
	b[0][2]=60;
	b[1][0]=41;
	b[1][1]=51;
	b[1][2]=61;
	
	for(int i=0; i<2;i++)
	{
		for(int j=0;j<3;j++)
		{
			System.out.print(b[i][j]+" ");
		}
		System.out.println();
		}
	
	
	
	System.out.println("Using for-each loop");
	for(int[] i:b) 
	{
		for(int j:i) 
		{
			System.out.print(j+" ");	
		}
	
	System.out.println();
	}
	
	}
		
	}


