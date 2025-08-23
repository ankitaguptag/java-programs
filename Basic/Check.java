                 /* Interface Variable*/
interface customerAvi{
int amt=5;
void purchase();
}
class sellerKvi implements customerAvi
{
@Override
public void purchase(){
System.out.println("Avi need "+amt+" kg rice");
}
}
class Check{
public static void main(String[] args){
customerAvi c=new sellerKvi();
c.purchase();
}
}