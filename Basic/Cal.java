import java.util.Scanner;

public class Cal {
    public static void main(String[] args) {
        
        int ch;
        int a,b,result;
        while (true) {
            System.out.println(" Calculator");
            Scanner obj = new Scanner(System.in);
            System.out.println("1. Add");
            System.out.println("2. Sub");
            System.out.println("3. Multi");
            System.out.println("4. Divi");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            ch = obj.nextInt();
            
            System.out.print("Enter first number: ");
            a = obj.nextInt();
    if(a<0){
        System.out.println("please enter the positive number");
        break;
}

            System.out.print("Enter second number: ");
            b = obj.nextInt();
  if(b<0){
        System.out.println("please enter the positive number");
        break;
}           
            switch (ch) {
                case 1:
                    result=a+b;
                    System.out.println("Result: " + result);
                    break;
                case 2:
                     result=a-b;
                    System.out.println("Result: " + result);
                    break;
                case 3:
                     result=a*b;
                    System.out.println("Result: " + result);
                    break;
                case 4:
                    result=a/b;
                        System.out.println("Result: " + result);
                    break;
            case 5:
                System.out.println("Exiting the calculator");
                break;
      
            default:
                    System.out.println("Invalid choice");
                    break;
            }
            
           
        }
        
        
    }
}
