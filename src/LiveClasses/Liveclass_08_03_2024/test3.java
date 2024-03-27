package LiveClasses.Liveclass_08_03_2024;


abstract class Bird
{
    public abstract void fly();
    public abstract void eat();
}
class Sparrow extends Bird
{
    public void fly(){
        System.out.println("Sparrow fly @short height");
    }
    public void eat(){
        System.out.println("Sparrow eat grains...");
    }
}
//abstract class can contain concrete and abstract methods
//concrete methods : A method with implementation
//abstrct methods : A method without implementation
abstract class Eagle extends Bird
{
    public void fly(){
        System.out.println("Eagel fly @very very height");
    }
    public abstract void eat();
}
class SerpentEagle extends Eagle
{
    public void eat(){
        System.out.println("Serpent eagel eats snakes...");
    }
}
class GoldenEagle extends Eagle
{
    public void eat(){
        System.out.println("Golden eagel catches prey over the ocean...");
    }
}
class Crow extends Bird
{
    public void fly(){
        System.out.println("Crow fly @medium height...");
    }
    public void eat(){
        System.out.println("Crow eat grains...");
    }
}
class Sky
{
    public void allowBird(Bird ref){
        ref.fly();
        ref.eat();
        System.out.println();
    }
}

public class test3 {

    public static void main(String[] args) {
        Sky sky = new Sky();
        sky.allowBird(new Sparrow());
        sky.allowBird(new SerpentEagle());
        sky.allowBird(new GoldenEagle());
        sky.allowBird(new Crow());
    }
}
