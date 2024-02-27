package Recursion_In_Java;

public class FunctionCall_In_java {
    public static void mango(){
        System.out.println("this is mango method okkk");
    }
    public static void banana(){
        mango();
        System.out.println("You are in banana");
    }
    public static void main(String[] args) {
        System.out.println("hii you are in  main method");
        banana();
    }
}
