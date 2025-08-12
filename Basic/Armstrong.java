import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        int num ; 
        int sum = 0;
  System.out.println("enter a number");
  Scanner r=new Scanner(System.in);
  num=r.nextInt();
  int original = num;
        while (num > 0) {
            int digit = num % 10;
            sum = sum + (digit * digit * digit); 
            num = num / 10;
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is NOT an Armstrong number.");
        }
    }
}
