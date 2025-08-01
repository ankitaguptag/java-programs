public class Palindrome{
    public static void main(String[] args) {
        int num = 121;  
        int orig = num;
        int rev = 0;

        while (num > 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }

        if (orig == rev) {
            System.out.println(orig + " is a Palindrome number.");
        } else {
            System.out.println(orig + " is NOT a Palindrome number.");
        }
    }
}
