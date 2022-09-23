import java.util.Scanner;
class removevowel{
  public static void main(String args[]){
    Scanner v=new Scanner(System.in);
    System.out.println("Enter a string:");
    String str=v.nextLine();
    str=str.replaceAll("[aeiouAEIOU]","");
    System.out.println("The string without vowel is:"+str);
  }
}
