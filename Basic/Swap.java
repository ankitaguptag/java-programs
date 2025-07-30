public class Swap {

    public static void main(String[] args) {

        int first = 12, second = 10, temp;

        System.out.println("Before swapping");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
        temp = first;
        first = second;
        second = temp;

        System.out.println("After swapping");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
    }
}