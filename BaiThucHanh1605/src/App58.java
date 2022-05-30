import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Scanner;

public class App58 {
    public static void main(String[] args) {
        int soPhanTu;
        String name;
        Scanner sc = new Scanner(System.in);
        Set<String> linkedHashSet = new LinkedHashSet<String>();

        System.out.println("Nhap so luong phan tu: ");
        soPhanTu = Integer.parseInt(sc.nextLine()); 
        for(int i = 0; i < soPhanTu; i++){
            System.out.println("Nhap phan tu thu " + (i+1) + ": ");
            name = sc.nextLine();
            linkedHashSet.add(name);
        }

        // linkedHashSet.add("Hello");
        // linkedHashSet.add("Hi");
        // linkedHashSet.add("Bye");
        // linkedHashSet.add("Goodbye");
        System.out.println("Cac phan tu co trong linkedHashSet:");
        for(String str : linkedHashSet){
            System.out.println(str);
        }
    }
}