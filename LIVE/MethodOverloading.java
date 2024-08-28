
package LIVE;

/**
 * InnerMethodOverloading
 */
class Calculator {
    public void add(int a, int b){
        System.out.println("int-int argument "+(a+b));
    }
    public void add(float a, float b){
        System.out.println("float-float argument "+(a+b));
    }
    public void add(double a, double b){
        System.out.println("double-double argument "+(a+b));
    }


    
}
public class MethodOverloading {
    public static void main(String[] args) {
        Calculator cal=new Calculator();
        cal.add(10, 20);
        cal.add(45.1f, 65.2f);
        cal.add(11.8, 35.12);
    }
    
}
