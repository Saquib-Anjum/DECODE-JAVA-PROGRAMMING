package LiveClasses.liveClass29_02_2024;

public class liveClass_29_02_2024 {

        public void add(int a,int b){
            System.out.println("int-int argument");
        }
        public void add(float a,float b){
            System.out.println("float-float argument");
        }
        public void add(double a,double b){
            System.out.println("double-double argument");
        }
    }
    class Test
    {
        public static void main(String[] args)
        {
            liveClass_29_02_2024 c = new liveClass_29_02_2024();
            c.add(10,20); //int-int
            c.add(10.5f,20.5f);//float-float
            c.add(10.0,20.0);//double-double
        }
    }


