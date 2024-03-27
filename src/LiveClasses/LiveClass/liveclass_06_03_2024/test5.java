package LiveClasses.LiveClass.liveclass_06_03_2024;


class Parent2
{
    public final void methodOne(){
        System.out.println("ParentClass:: methodOne()");
    }
}
class Child2 extends Parent2
{
//    public void methodOne(){
//        System.out.println("ChildClass:: methodOne()");
//    }
}
public class test5 {
    public static void main(String[] args) {
        Parent2 p = new Child2();
        p.methodOne();
    }

}
