package arrays;
import java.util.*;
public class kth_min {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[20];
		System.out.println("enter len of array");
		int len =sc.nextInt();
		System.out.println("enter elements");
		for(int i=0;i<len;i++)
			arr[i]=sc.nextInt();
		
		for(int j=1; j<len-1; j++)  //sorting array
		{  
	        int temp = arr[j];  
	        int a= j-1;  
	        while(a>=0 && arr[j]> temp)  
	        {  
	            arr[j+1] = arr[j];   
	            j = j-1;  
	        }  
	        arr[j+1] = temp;
		}
		
		System.out.println("enter a number smaller than length of array"); // finding k th element
		int k=sc.nextInt();
		if(k>len)
			System.out.println("invalid");
		else
			System.out.println("Kth smallest element is"+ arr[k-1]);
		sc.close();

	}
}
