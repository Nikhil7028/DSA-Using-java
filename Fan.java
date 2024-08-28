class Fan
{ 
 String CompanyName;
 int price;
 String color;

 void starting()
 { 
  System.out.println("Fan is starting");
 }

 void rotating()
 { 
  System.out.println("Fan is ratating...");
 }

 void blowingAir()
 {
  System.out.println("Fan is blowing air");
 }
 void stopping()
 {
  System.out.println("Fan is stop");
 }
 

public static void main(String args[])
{

 Fan f1=new Fan(); 
 Fan f2=new Fan();
 Fan f3=new Fan();

 f1.starting();
 f1.stopping();

 f2.starting();
 f2.rotating();

 f3.starting();
 f3.rotating();
 f3.blowingAir();
 f3.stopping();
}
}