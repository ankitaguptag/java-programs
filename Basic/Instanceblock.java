class A{
int a,b;
static void show(){
System.out.println("Learn coding");
}
A(){
a=10; b=30;
System.out.println(a+" "+b);
}
{
a=20; b=40;
System.out.println(a+" "+b);
}
}
class Instanceblock{
public static void main(String[] args){
A.show();
A r=new A();
}
}