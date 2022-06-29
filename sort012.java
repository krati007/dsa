package arrays;
import java.util.*;
public class sort012 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		int arr[]= {1,2,0,0,1,1,1,2,0,1};
		int c1=0,c2=0,c0=0;int i;
		for(i=0;i<arr.length;i++)       //counting no. of 0's,1's,2's
		{
			if(arr[i]==0)
				c0++;
			else 
				if(arr[i]==1)
				c1++;
			else
				c2++;
		}
		i=0;                              //inserting in array in ascending order
		while(i<c0)
		{
			arr[i]=0;
			i++;
		}
		i=c0;
		while(i<c0+c1)
		{
			arr[i]=1;
			i++;
		}
		i=c1+c0;
		while(i<c0+c1+c2)
		{
			arr[i]=2;
			i++;
		}
		
		for(i=0;i<arr.length;i++)
			System.out.println(arr[i]+" ");
		
		sc.close();
	}
		
	}


