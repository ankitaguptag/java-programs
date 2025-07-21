  import java.util.Scanner;

public class Suminput{
  public static void main(String[] args){
       Scanner obj=new Scanner(System.in);
   System.out.println("enter the first number");
   int a = obj.nextInt();
    System.out.println("enter the second number");
  int b = obj.nextInt();
  int sum = a+b;
   System.out.println("sum of two number=  " + sum);
 }
}