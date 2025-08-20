                          /* Encapsulation */
class A
{
private int value; //data hiding
public void setValue(int x) //data Abstraction
{
value=x; //value=100
}
public int getValue()
{
return value;
}
}
class Encap
{
public static void main(String[] args)
{
A r=new A();
r.setValue(100);
System.out.print(r.getValue());
}
}