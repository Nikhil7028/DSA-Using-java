package LIVE;
abstract class Plane{
    abstract void tackoff();
    abstract void fly();
    abstract void land();

}
class pessangerPlane extends Plane{
    void tackoff(){
        System.out.println("Pessanger plane is take off");
    }
    void fly(){
        System.out.println("pessanger plane is fly...");
    }
    void land(){
        System.out.println("pessanger plane is land...");
    }

}
class FighterPlane extends Plane{
    public void tackoff(){
        System.out.println("FighterPlane is tack off...");
    }
    public void fly(){
        System.out.println("FighterPlane is flying...");
    }
    public void land(){
        System.out.println("FighterPlane is landing...");
    }

}

class CargoPlane extends Plane{
    public void tackoff(){
        System.out.println("CargoPlane is tack off...");
    }
    public void fly(){
        System.out.println("CargoPlane is flying...");
    }
    public void land(){
        System.out.println("CargoPlane is landing...");
    }

}
class Airport{
    public void allowPlane(Plane p){
        p.tackoff();
        p.fly();
        p.land();
    }

}

public class AbstractClass {
    public static void main(String[] args) {
        Airport a=new Airport();
        a.allowPlane(new pessangerPlane());
        System.out.println();
        a.allowPlane(new FighterPlane());
        System.out.println();
        a.allowPlane(new CargoPlane());
        System.out.println();
        
    }    
}
