package LiveClasses.liveClass29_02_2024;

public class newexample {
    public static void main(String[] args) {
        calculator c=new calculator();
        c.add(3,5);
        c.add(3.0f,5);
        c.add(3,5.f);
        c.add(3,5);

    }
}
 class calculator{
    public static void add(int a,int b){
        System.out.println("int argument");
    }
    public static void add(float a,float b){
        System.out.println("float argument");
    }
    public static void add(double a,double b){
        System.out.println("float argument");
    }
     public static void add(int a,float b){
         System.out.println("int-float argument");
     }
     public static void add(float a,int b){
         System.out.println("float-int  argument");
     }
}
