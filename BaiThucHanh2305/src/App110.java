import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class App110{
    public static void main(String[] args) {
        ArrayList<Integer> intArraylist = new ArrayList<>();
        int sophantu;
        int a;
        int max = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap vao so cac phan tu:");
        sophantu = sc.nextInt();
        for(int i = 0;i<sophantu;i++){
            System.out.println("Nhap vao phan tu thu "+(i+1));
            a = sc.nextInt();
            intArraylist.add(a);
        };

        for(int i = 0; i < intArraylist.size(); i++) {   
            if(max < intArraylist.get(i))
                max = intArraylist.get(i);
        };  

        System.out.println("Nhap vao phan tu can xoa:");
        a = sc.nextInt();

        for(int i = 0; i < intArraylist.size(); i++) {   
            if(a == intArraylist.get(i))
                intArraylist.remove(i);    
        };

        Collections.sort(intArraylist);

        System.out.println("Mang sau khi sap xep la:"); 
        for(int i = 0; i < intArraylist.size(); i++) {  
            System.out.print(intArraylist.get(i)+" ");
        }  
        

        sc.close();
    }

}