                       /* Interface Program */
import java.util.Scanner;
interface client
{
   void input();//public+abstrect
   void output();//public+abstrect
}
class Ankita implements client
{
   String name;
   double sal;
   public void input()
{
     Scanner r=new Scanner(System.in);
     System.out.println("Enter Username:");
     name=r.nextLine();
     System.out.println("Enter Salary:");
     sal=r.nextDouble();
 }
 public void output()
{
  System.out.println(name+" "+sal);
}
  public static void main(String[] args)
{
  client c=new Ankita();
  c.input();
  c.output();
 }
}