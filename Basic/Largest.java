import java.util.Scanner;
public class Largest{
public static void main(String[] args){
int a,b,c,max;
Scanner obj=new Scanner(System.in);
     a=obj.nextInt();
     b=obj.nextInt();
     c=obj.nextInt();
     max=a;
    if(b>max)
{
 max=b;
}
if(c>max){
  max=c;
}
System.out.println("largest no is = " + max);
}
}