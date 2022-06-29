package arrays;
import java.util.*;
public class rev_arr {
    
	static void reverse_array(int arr[], int l )
	{
		System.out.println("Reversed array");
		for(int i=l-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
	}
public static void main(String args[])
{
	
	Scanner sc=new Scanner(System.in);
	int a[]=new int[10];
	System.out.println("Enter len of array[1-10]");
	int n = sc.nextInt();
	System.out.println("enter array values");
	   for(int i=0;i<n;i++)
		   a[i]=sc.nextInt();
	   System.out.println("original array");
       for(int i=0;i<n;i++)
    	   System.out.print(a[i]+" ");
       
    reverse_array( a,n);
    sc.close();
}
}
    