class A{
int a=10;
}
class Ba extends A{
int a=20;
void show(){
System.out.println(a);
System.out.println(super.a);
}
} 
class B{
public static void main(String[] args){
Ba r=new Ba();
r.show();
}
}