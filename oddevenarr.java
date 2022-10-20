import java.io.*;
import java.util.*;

public class oddevenarr
 {
      public static void main(String args[])
		
	{
                try
                {
                        Scanner s = new Scanner(System.in);
                        int[] arr;
                        int n,i;
                        System.out.println("Enter the size of the array:");
                        n=s.nextInt();
		        arr= new int[n];
                        if(n<=0) 
                        {
                           System.out.println("Enter the valid size of array");
                        }
                        else
                        {
             
			System.out.println("Enter the elements of the array:");
			for (i = 0; i < n; i++) 
                        {

				
				arr[i] = s.nextInt();
			} 
                        System.out.println("Even numbers in array:");
                        for (i = 0; i < n; i++) 
                        {
                           if(arr[i]%2==0)
                           System.out.println(arr[i]);
			}
                        System.out.println("odd numbers in array:");
                        for (i = 0; i < n; i++) 
                        {
                           if(arr[i]%2!=0)
                           System.out.println(arr[i]);
			}
                      }
                   }
                 catch (ArrayIndexOutOfBoundsException e)
                 {
			
			System.out.println("Array Bounds Exceeded...\nTry Again");
		 }
                 catch(Exception e)
                 {
                      System.out.println("Invalid due to character exception or floating point exception");
                 }
            }
       }
