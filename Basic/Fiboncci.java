import java.util.Scanner;
public class Fiboncci{
 public static void main(String[] args){
   int i,a=0,b=1,term,c;
    System.out.print("Enter the number:");
   Scanner obj=new Scanner(System.in); 
    term=obj.nextInt();
for(i=1;i<=term;i++){
System.out.println(" "+ a);
   c=a+b;
   a=b;
   b=c;
}
  }
}