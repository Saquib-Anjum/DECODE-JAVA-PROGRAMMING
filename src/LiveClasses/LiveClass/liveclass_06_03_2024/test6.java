package LiveClasses.LiveClass.liveclass_06_03_2024;


abstract class Parent3
{
    public abstract void methodOne();
}
class Child3 extends Parent3
{
    public void methodOne(){
        System.out.println("ChildClass:: methodOne()");
    }
}
public class test6 {
    public static void main(String[] args) {
        Parent3 p = new Child3();
        p.methodOne();
    }
}
