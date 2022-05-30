import java.util.ArrayList;

public class App17 {
    public static void main(String[] args) {
        ArrayList<Integer> arrListInteger = new ArrayList<>();
        arrListInteger.add(0);
        arrListInteger.add(7);
        arrListInteger.add(1);
        arrListInteger.add(9);

        System.out.println("Cac phan tu co trong arrListInteger la:");
        for(int i = 0; i < arrListInteger.size();i++)
        System.out.println(arrListInteger.get(i));
    }
}