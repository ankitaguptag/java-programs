                         /* abstract class program */   
abstract class Animal
{
   Animal()
   {
      System.out.println("All animal:");
   }
   public abstract void sound();
}
class Dog extends Animal
{
   Dog()
   {
     super();
   }
   public void sound()
   {
     System.out.println("Dog is Barking");
 }
}
class Lion extends Animal
{
   Lion()
   {
     super();
   }
   public void sound()
   {
     System.out.println("Lion is Roar");
 }
}
class Abst
{
   public static void main(String[] args)
   {
   Dog d=new Dog();
   Lion l=new Lion();
   d.sound();
   l.sound();
 }
}