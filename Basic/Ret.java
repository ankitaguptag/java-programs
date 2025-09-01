                            /* covariant return type */ 
class A
{
A Show()
{
   System.out.println("Learn coding");
   return new A();//this --> new A();
 }
}
class B extends A
{
   @Override
   B Show()
{
   super.Show();
   System.out.println("please like");
   return new B();
 }
}
class Ret
{
   public static void main(String[] args)
{
   B h=new B();
   h.Show();
 }
}