package Methods;

public class type3_method {
    public static void main(String[] args) {
        calculator3 calc = new calculator3();
        int a=5;
        int b=67;

        calc.add(a,b);
    }
}
class calculator3{
    int res;
    void add(int x,int y)
    {
        res=x+y;
        System.out.println(res);
    }
}