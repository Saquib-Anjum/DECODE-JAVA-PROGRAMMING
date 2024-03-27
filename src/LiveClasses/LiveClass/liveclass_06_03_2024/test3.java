package LiveClasses.LiveClass.liveclass_06_03_2024;

class Parent1
{
//public Object methodOne()
public Object methodOne(){
    return null;
}
}
class Child1 extends Parent1
{
//object and void return type gives the error
// so we can take the all chils class of object class
    public String methodOne(){
        System.out.println("Hello from child...");
        return null;
    }
}
public class test3 {
    public static void main(String[] args) {
        Parent1 p = new Child1();
        p.methodOne();
    }
}
