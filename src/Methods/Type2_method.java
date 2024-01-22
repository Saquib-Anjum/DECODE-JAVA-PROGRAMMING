package Methods;

public class Type2_method {
    public static void main(String[] args) {
        calculator calc= new calculator();
        int sum =calc.add();
        System.out.println(sum);

    }
}
class calculator{
    int a;
    int b;
    int res;
    int add(){
        a=10;
        b=20;
        res=a+b;
        return  res;

    }
}

