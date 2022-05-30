import java.util.ArrayList;

public class App18 {
    public static void main(String[] args) {
        ArrayList<Float> arrayListFloat = new ArrayList<>();

        arrayListFloat.add(0.7f);
        arrayListFloat.add(7.26f);
        arrayListFloat.add(1.02f);
        arrayListFloat.add(9.3f);

        System.out.println("Cac phan tu co trong arrListFloat la:");
        for(int i = 0; i < arrayListFloat.size();i++)
            System.out.println(arrayListFloat.get(i));
    }
}