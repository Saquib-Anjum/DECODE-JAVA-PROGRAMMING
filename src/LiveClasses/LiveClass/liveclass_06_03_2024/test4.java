package LiveClasses.LiveClass.liveclass_06_03_2024;


class Parent
{
    public Object methodOne(){
        return null;
    }
}
class Child extends Parent
{
    public String methodOne(){
        System.out.println("Hello from child...");
        return null;
    }
}

public class test4 {
    public static void main(String[] args) {
        Parent p = new Child();
        p.methodOne();
    }
}
