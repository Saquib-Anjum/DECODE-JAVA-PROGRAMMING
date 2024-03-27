package LiveClasses.liveClass29_02_2024;

public class Main {
    public static void main(String[] args) {
        dog d=new dog();
        //following method is wrong;
//        d.breed="pug";
//        d.age=5.9f;
//        d.price=8900;
//        System.out.println(d.breed);
//        System.out.println(d.age);
//        System.out.println(d.price);
        d.setBreed("asdf");
        d.setAge(4.6f);
        d.setPrice(34567);
        System.out.println("Breed  ->"+d.getBreed());
        System.out.println("Age   ->"+d.getAge() );
        System.out.println("Price   ->"+d.getPrice());





    }
}
 class dog{
    private String breed;
    private float age;
    private int price;

    public void setBreed(String s){
        //validation
        //if(s.length()>0)
            breed=s;
    }
    public void setAge(float a){
        age=a;
    }
    public void setPrice(int a){
        price=a;
    }
    public String getBreed(){
        return breed;
    }
    public float getAge(){
        return age;
    }
    public int getPrice(){
        return price;
    }

}
