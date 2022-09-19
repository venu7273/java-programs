import java.util.Arrays;
import java.util.Scanner;  
public class sum
{  
public static void main(String[] args)   
{  
int n,max,min,sum,diff;  
Scanner sc=new Scanner(System.in);  
System.out.print("Enter the number of elements: ");  
n=sc.nextInt();  
int[] array = new int[10];  
System.out.println("Enter the elements of the array: ");  
for(int i=0; i<n; i++)  
{  
array[i]=sc.nextInt();  
} 
Arrays.sort(array);
max = array[array.length - 1]; 
Arrays.sort(array);
min = array[array.length-n];	
sum=max+min;
diff=max-min;
System.out.println("max Array elements are: " +max);
System.out.println("min Array elements are: " +min);
System.out.println("sum of elements are: " +sum);
System.out.println("diff of elements are: " +diff);
}  
} 