package Methods;

public class type1_method {
    public static void main(String[] args) {
        calculator1 calc= new calculator1();
        calc.add();


    }
}
class calculator1{
    int a;
    int b;
    int res;
    void add(){
        a=10;
        b=20;
        res=a+b;
        System.out.println(res);

    }
}

