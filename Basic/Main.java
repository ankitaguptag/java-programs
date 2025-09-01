                   /* @override annotation */
class A
{
   void Show()
{
    System.out.println("Super class");
 }
}
class B extends A
{
    @Override
    void Show()
{
    System.out.println("Sub class");
 }
}
class Main
{
    public static void main(String[] args)
{
    B r=new B();
    r.Show();
  }
}