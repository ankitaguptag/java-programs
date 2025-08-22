 abstract class Programming
{
   public abstract void Developer();
}
class HTML extends Programming
{
   @Override
   public void Developer(){
     System.out.println("Tim Berners Lee");
} 
}
 class Java extends Programming
{
   @Override
   public void Developer(){
     System.out.println("Games Gosling");
} 
}
class AbsMethod{
public static void main(String[] args){
/* HTML h=new HTML();
h.Developer();
Java j=new Java();
j.Developer();*/

 Programming h=new HTML();//refrence
 h.Developer();
 Programming j=new Java();
j.Developer();

}
}