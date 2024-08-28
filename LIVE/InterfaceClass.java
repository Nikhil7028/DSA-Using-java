package LIVE;

interface CalculatorI{
    void add(int x, int y);
    void sub(int x, int y);
    // void div(int x, int y);
    // void mul(int x, int y);
}
class class2 {
    public void mul(int x, int y){
        System.out.println("Mul :: "+(x*y));
    }
    public void div(int x, int y){
        System.out.println("div :: "+(x/y));
    }
}
class CalculatorImp extends class2 implements CalculatorI{
    public void add(int x, int y){
        System.out.println("sum :: "+(x+y));
    }
    public void sub(int x, int y){
        System.out.println("sub :: "+(x-y));
    }
    
}

public class InterfaceClass {
    public static void main(String[] args) {
        CalculatorI cal=new CalculatorImp();
        cal.add(10,20 );
        cal.sub(100,20 );
        // cal.mul(10,20 );
        // cal.div(100,20 );
        class2 c2=new class2();
        c2.mul(10,20 );
        c2.div(100,20 );
    }    
}
