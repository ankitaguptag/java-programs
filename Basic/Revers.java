import java.util.Scanner;
public class Revers {
  public static void main(String[] args) {
    int n, rev = 0, r;
    System.out.println("Enter the Number: " );
    Scanner obj=new Scanner(System.in);
     n =obj.nextInt();
    while(n!= 0) {
      r = n % 10;
      rev = rev* 10 + r;
      n= n/ 10;
    }

    System.out.println("Reversed Number: " + rev);
  }
}