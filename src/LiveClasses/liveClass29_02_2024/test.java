package LiveClasses.liveClass29_02_2024;


class sample {
    public void methoddone(String s){
        System.out.println("string version.........");
    }
    public void methoddone(Object s){
        System.out.println("Object version  version.........");
    }
    public void methoddone(StringBuffer s){
        System.out.println("Object version  version.........");
    }
}
public class test {
    public static void main(String[] args) {
        sample s=new sample();
        s.methoddone("saquib");
        s.methoddone(new StringBuffer("sechin"));
       // s.methoddone(null);


    }
}
