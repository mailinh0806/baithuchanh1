package List;

import java.util.ArrayList;
import java.util.Scanner;

public class App24 {
    public static void main(String[] args) {
        ArrayList<Integer> arrInteger = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int number ;
        
        System.out.println("Nhap N so phan tu ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " + i);
             number = sc.nextInt();
            arrInteger.add(number);
        }
        int max = arrInteger.get(0);
        for (int i = 0; i < arrInteger.size(); i++) {
            if(arrInteger.get(i).compareTo(max) > 0){
                max = arrInteger.get(i);
            }
        }
        System.out.println("Phan tu lon nhat trong mang arrInteger la: " + max);
    }
    
}