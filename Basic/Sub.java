import java.util.Scanner;
public class Sub{
public static void main(String[] args){
sum();
}
static void sum(){
Scanner obj = new Scanner(System.in);
System.out.print("Enter the first no :");
int num1=obj.nextInt();
System.out.print("Enter the first no :");
int num2=obj.nextInt();
int sum=num1+num2;
System.out.println("the sum = "+sum);

}

}