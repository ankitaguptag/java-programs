/*class A{
void show(){
System.out.println(this);
}
public static void main(String[] args){
A r=new A();
System.out.println(r);
r.show();
} 
}*/
  
/*class A{
int a;
A(int a)
{
this.a=a;
}
void show()
{
System.out.println(a);
}
public static void main(String[] args){
A r=new A(100);
r.show();
} 
}*/

/*class A{
A(){
System.out.println("Ankita Gupta");
}
A(int a)
{
this();
System.out.println(a);
}
public static void main(String[] args){
A r=new A(100);
} 
}*/


class A{
A()
{
this(20);
}
A(int a)
{
System.out.println(a);
}
public static void main(String[] args){
A r=new A();
} 
}
