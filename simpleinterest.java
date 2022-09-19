import java.util.Scanner;
public class simpleinterest
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        float p, t, si;
        int l;
        System.out.println("Enter the Principal : ");
        p = sc.nextFloat(); 
        System.out.println("Enter the Time period : ");
        t = sc.nextFloat(); 
        System.out.println("choose below options:");
        System.out.println("1.senior citizen    2.not senior citizen");
        l = sc.nextInt();
        if(l == 1)     
        {
        si = (p * 12 * t) / 100;
         }
       else
           {
          si = (p * 10 * t) / 100;
           }
       System.out.println("Simple Interest is: " +si);
    }
}