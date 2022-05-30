import java.util.ArrayList;
import java.util.Scanner;

public class   App24 {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int number;

        System.out.println("Nhap so phan tu ArrayList: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " + i + ": ");
            number = sc.nextInt();
            arr.add(number);
        }

        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i).compareTo(max) > 0) {
                max = arr.get(i);
            }
        }
        System.out.println("Phan tu lo nhat trong mang arr =  " + max);
    }
}