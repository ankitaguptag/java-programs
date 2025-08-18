class A{
int a,b,c;
void add(){
a=10; b=20;
c=a+b;
System.out.println("sum of two number:"+c);
}
void sub(){
a=50; b=20;
c=a-b;
System.out.println("sub of two number:"+c);
}
}
class B extends A
{
void multi(){
a=10; b=3;
c=a*b;
System.out.println("multiply of two number:"+c);
} 
void div(){
a=10; b=2;
c=a/b;
System.out.println("divide of two number:"+c);
}
}
class C extends B
{
void rem(){
a=10; b=3;
c=a%b;
System.out.println("Remainder of two number:"+c);
}
}
class Text{
public static void main(String[] args){
C r=new C();
r.add();
r.sub();
r.multi();
r.div();
r.rem();
}
}