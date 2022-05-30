import java.util.HashSet;
import java.util.Scanner;

public class App54 {
    public static void main(String[] args){
        String name;
        int soPhanTu;
        HashSet<String> hashSetString = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap so luong phan tu: ");
        soPhanTu = sc.nextInt();
        for(int i = 0; i < soPhanTu; i++){
            System.out.println("Nhap phan tu thu " + (i+1) + ": ");
            name = sc.nextLine();
            hashSetString.add(name);
        }

        // hashSetString.add("C");
        // hashSetString.add("C++");
        // hashSetString.add("Ruby");
        // hashSetString.add("Java");
        // hashSetString.add("Python");
        // hashSetString.add("JavaScript");

        System.out.println("Cac phan tu co trong hashSetString: ");
        System.out.println(hashSetString);
        System.out.println("Nhap phan tu can xoa ");
        name = sc.nextLine();

        if(hashSetString.contains(name)){
            hashSetString.remove(name);
            System.out.println("Xoa thanh cong!");
            System.out.println("Cac phan tu con lai trong hashSetString: ");
            System.out.println(hashSetString);
        }else {
            System.out.println("Xoa khong thanh cong");
        }
    }    
}
