package Basics;

public class doubleDATAtype {

    public static void main(String[] args) {
        /*
        it will show error because it is not compatible
        float x= 89787.79989896767869767896876767869878967867697867;
        if we put f in last like this  5.898899f
        now it comfortable
        */
        float x= 89787.79989896767869767896876767869878967867697867f;
        double y= 89787.79989896767869767896876767869878967867697867;
        System.out.println(x);
        System.out.println(y);

        double a = 5.7;
        double b = 6.9;
        System.out.println(a+b);
        System.out.println(a*b);
    }
}
