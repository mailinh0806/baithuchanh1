package List;

import java.util.ArrayList;
import java.util.Iterator;

public class App18 {
    public static void main(String[] args) {
        ArrayList<Float> arr = new ArrayList<>();
        arr.add(0.76f);
        arr.add(7.26f);
        arr.add(1.02f);
        arr.add(9.3f);
        Iterator<Float> iterator = arr.iterator();
        System.out.println("Cac phan tu co trong mang arr la:");
        while (iterator.hasNext()) {            
            System.out.println(iterator.next());
        }
    }
 
}