package Method;

import java.util.Scanner;
class Squre
{
 void squaring(int n)
 {
  System.out.println("Square : "+(n*n));
 }
}

class SquareN
{
  public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter a value");
  int n=sc.nextInt();
  Squre sq=new Squre();
  sq.squaring(n);
  sc.close();
 }
}
