public class Day{
public static void main(String[] args){
int day=4;
String  dayname;
switch(day){
case 1:
dayname="monday";
break;

case 2:
   dayname="tuesday";
   break;
case 3:
   dayname="wednesday";
   break;
case 4:
   dayname="thrusday";
   break;
case 5:
   dayname="friday";
   break;
case 6:
   dayname="saturday";
   break;
case 7:
   dayname="sunday";
   break;
default:
 dayname="invalid day";
}
System.out.println(dayname);
}
}