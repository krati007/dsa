package arrays;
import java.util.*;
public class seggrate_negatives {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[10];
		int pos[]=new int[10];
		System.out.println("enter len of array");
		int len =sc.nextInt(); int i=0, c2=0;
		System.out.println("enter elements +ve and -ve");
		for( i=0;i<len;i++)
			arr[i]=sc.nextInt();
		for(int j=0;j<len;j++)
			
			 if (arr[j]>=0)
			    {
				 pos[c2]=arr[j];
				 c2++;
				 }
			 
		for (i=0;i<len;i++)
			{
			if(arr[i]<0)
		     	pos[c2++]=arr[i];
			}
		System.out.println("new array");
		for(i=0;i<len;i++)
			System.out.print(pos[i]+" ");
		sc.close();
	}
	
}
