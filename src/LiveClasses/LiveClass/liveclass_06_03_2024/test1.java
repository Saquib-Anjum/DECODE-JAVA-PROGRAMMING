package LiveClasses.LiveClass.liveclass_06_03_2024;
class Plane
{
    public void takeOff(){
        System.out.println("Plane tookOff...");
    }
    public void fly(){
        System.out.println("Plane is flying...");
    }
    public void land(){
        System.out.println("Plane is landing...");
    }
}
class PassengerPlane extends Plane
{
    public void takeOff(){
        System.out.println("Passenger-Plane tookOff...");
    }
    public void fly(){
        System.out.println("Passenger-Plane is flying...");
    }
    public void land(){
        System.out.println("Passenger-Plane is landing...");
    }
}
class CargoPlane extends Plane
{
    public void takeOff(){
        System.out.println("Cargo-Plane tookOff...");
    }
    public void fly(){
        System.out.println("Cargo-Plane is flying...");
    }
    public void land(){
        System.out.println("Cargo-Plane is landing...");
    }
}
class FighterPlane extends Plane
{
    public void takeOff(){
        System.out.println("Fighter-Plane tookOff...");
    }
    public void fly(){
        System.out.println("Fighter-Plane is flying...");
    }
    public void land(){
        System.out.println("Fighter-Plane is landing...");
    }
}
class Airport
{
    //TruePolymorphism
    public void allowPlane(Plane p){
        p.takeOff();
        p.fly();
        p.land();
        System.out.println();
    }
}
public class test1 {public static void main(String[] args) {
    PassengerPlane p = new PassengerPlane();
    CargoPlane c= new CargoPlane();
    FighterPlane f = new FighterPlane();
    Airport a= new Airport();
    a.allowPlane(p);
    a.allowPlane(c);
    a.allowPlane(f);
}
}
