crtlass Student{
protected int roll,marks;
String name;
protected void input(){
System.out.println("Enter roll number & marks:");
}
}
class SimpleInheritance extends Student
{
  void disp(){
  roll=1; name="ankita"; marks=89;
System.out.println(roll+" "+name+" "+marks);
}
public static void main(String[] args){
SimpleInheritance r=new SimpleInheritance();
r.input();
r.disp();
}
}