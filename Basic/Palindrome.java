import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args) {
        int num;  
        int rev = 0;
        System.out.println("Enter a number:");
        Scanner r=new Scanner(System.in);
        num=r.nextInt();
        int orig = num;
while (num > 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }
if (orig == rev) {
            System.out.println(orig + " is a Palindrome number.");
 }
 else {
            System.out.println(orig + " is NOT a Palindrome number.");
        }
    }
}
