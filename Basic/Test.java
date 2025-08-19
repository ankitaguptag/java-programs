                      /*Method Overloading*/
class Test{
void add(){
int a=10,b=5, c;
c=a+b;
System.out.println(c);
}
void add(int x, int y){
int c;
c=x+y;
System.out.println(c);
}
void add(int x, double y){
double c;
c=x+y;
System.out.println(c);
}
public static void main(String[] args){
Test r=new Test();
r. add();
r.add(100,30);
r.add(50,43.56);
}
}