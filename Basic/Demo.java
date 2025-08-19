                          /* Method Overriding */
class Shape
{
void draw()
{
 System.out.println("con't say shape type");
} 
}
class Square extends Shape
{
@Override
void draw()
{
System.out.println("draw the square shape");
}
}
class Demo{
public static void main(String[] args)
{
Shape r=new Square();
r.draw();
}
}