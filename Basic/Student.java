class Stud
{
  String name;
  int age;

void disp()
{
    System.out.println("Name " + name);
    System.out.println("Age " + age);
 }
}
public class Student
{
   public static void main(String[] args)
{
   Stud s1 = new Stud();
   s1.name = "Ankita";
   s1.age = 20;
   Stud s2 = new Stud();
   s2.name = "Avinash";
   s2.age = 30;
   System.out.println("Details of student1");
   s1.disp();
   System.out.println("Detail of student2");
   s2.disp();
}
}
