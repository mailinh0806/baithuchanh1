import java.util.HashSet;
import java.util.Scanner;

public class App52 {
    public static void main(String[] args) throws Exception {
        int number, soPhanTu;
        HashSet<Integer> hashSetInteger = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap so luong phan tu: ");
        soPhanTu = sc.nextInt();
        for(int i = 0; i < soPhanTu; i++){
            System.out.println("Nhap phan tu thu " + (i+1) + ": ");
            number = sc.nextInt();
            hashSetInteger.add(number);
        }
        // hashSetInteger.add(0);
        // hashSetInteger.add(1);
        // hashSetInteger.add(4);
        // hashSetInteger.add(7);
        // hashSetInteger.add(6);
        // hashSetInteger.add(5);
    
        System.out.println("Cac phan tu co trong hashSetInteger:");
        System.out.println(hashSetInteger);
        System.out.println("Nhap phan tu can them: ");
        number = sc.nextInt();

        if (!hashSetInteger.contains(number)) {
            hashSetInteger.add(number);
            System.out.println("Them thanh cong");
            System.out.println("Cac phan tu trong hashSetInteger sau khi them: ");
            System.out.println(hashSetInteger);
        }else{
            System.out.println("Phan tu " + number + " da ton tai!");
        }
    }
}
