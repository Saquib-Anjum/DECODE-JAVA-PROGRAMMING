package Two_Dimensonal_Array.ArrayList;
import java.util.ArrayList;
import java.util.List;

public class operation_on_arraylist {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(10); a.add(40);a.add(50);

        List<Integer> b = new ArrayList<>();
        b.add(90);b.add(34);b.add(67);
        List<Integer> c = new ArrayList<>();
        c.add(78);c.add(98);c.add(65);
        List<List<Integer>> arr= new ArrayList<>();
        arr.add(a);arr.add(b);arr.add(c);
        for (int i = 0; i <arr.size() ; i++) {

            System.out.println(arr.get(i));

        }
    }
}
