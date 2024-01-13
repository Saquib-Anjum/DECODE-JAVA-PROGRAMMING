package Basics;

public class ModulusOPERATOR {
    public static void main(String[] args) {
        int x= 564;
        int y = 1000;

        double z = y%x;
        System.out.println(z);
        int a= 10;
        int b= 7;
        int c = a%b;
        System.out.println(c);

        /*
        some properties of modulus
        1.  a%b  => a        if [a<b]
        2. a%(-b) => a%b
        3.  (-a)%b = -a%b
        4.  (-a)%(-b) => -a%b
         */
        System.out.println(5%9);
        System.out.println(4%(-2));
        System.out.println((-5)%9);
        System.out.println((-6)%(-56));


    }
}
