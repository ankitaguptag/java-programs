class Privconstructor{
int a; double b; String c;
private Privconstructor(){
a=10; b=123.4; c="ankita";
System.out.println(a+" "+b+" "+c);
}
public static void main(String[] args)
{
Privconstructor r=new Privconstructor();
}
}