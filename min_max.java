package arrays;
import java.util.*;
public class min_max {
   public static void main(String args[])
   {
	   int arr[]=new int[10];
	   Scanner sc=new Scanner(System.in);
       System.out.println("Enter array elements");
	   for (int i=0;i<10;i++)
		   arr[i]=sc.nextInt();
	   mini_maxi(arr,arr.length);
	   sc.close();
	}
    
    static void mini_maxi(int a[], int l)
    {
    	int max=a[0],min =a[0];
    	for(int i=1;i<l;i++)
    	{
    		if(a[i]>max)
    			max=a[i];
    		else if(a[i]<min)
    			min=a[i];
    	}
    	System.out.println("max value:"+ max +"min value:"+ min);
    }

}

