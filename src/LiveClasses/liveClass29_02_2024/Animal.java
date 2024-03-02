package LiveClasses.liveClass29_02_2024;

public class Animal { }
class Monkey extends Animal{}
class AnimalApp{
    public void m1(Monkey m){
        System.out.println("Monkey version  ");
    }
    public void m1(Animal a){
        System.out.println("Animal  version  ");
    }

}
class test1 {
    public static void main(String[] args) {
        Monkey m=new Monkey();
       // a.m1(m);//m(Monkey version)---------->Monkey
        Animal an=new Animal();
       // a.m1(an);//an(Animal)---->Animal
    }

}

