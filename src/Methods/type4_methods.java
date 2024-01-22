package Methods;

public class type4_methods {
    public static void main(String[] args) {
        calculator4 calc = new calculator4();
        int a=5;
        int b=67;

        int sum = calc.add(a,b);
        System.out.println(sum);
    }
}
class calculator4{
    int res;
    int add(int x,int y)
    {
        res=x+y;
        return res;
    }

}
