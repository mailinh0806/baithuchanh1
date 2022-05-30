import java.util.LinkedList;
import java.util.Scanner;

public class App111 {
    public static void main(String[] args) {
        LinkedList<Integer> intLinkedList = new LinkedList<>();
        int sophantu;
        int a;
        int tong = 0;
        int count=0;
        float tbc = 0f;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap vao so cac phan tu:");
        sophantu = sc.nextInt();
        for(int i = 0;i<sophantu;i++){
            System.out.println("Nhap vao phan tu thu "+(i+1));
            a = sc.nextInt();
            intLinkedList.add(a);
        };

        for(int i = 0;i<sophantu;i++){
            if(intLinkedList.get(i)%2==0){
                count++;
                tong += intLinkedList.get(i);
            }
        };

        if(count>0){
            tbc = tong/count;
        }

        System.out.println("Trung binh cong cac so chan trong LinkedList la:");
        System.out.println(tbc);
        sc.close();
    }
}