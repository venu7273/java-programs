import java.util.*;   
class palindrome
{  
   public static void main(String args[])  
   {  
      String original, reverse = "";
      int m;
      Scanner in = new Scanner(System.in); 
      Scanner Sc = new Scanner(System.in); 
      System.out.println("choose the option you want");
      System.out.println("1.number   2. string"); 
      m = Sc.nextInt();
      System.out.println("Enter a suitable input according to your choice");  
      original = in.nextLine();   
      int length = original.length();   
      for ( int i = length - 1; i >= 0; i-- )  
         reverse = reverse + original.charAt(i);  
      if (original.equals(reverse))  
         System.out.println("Entered input  is a palindrome.");  
      else  
         System.out.println("Entered input isn't a palindrome.");   
   }  
}