/*Viết chương trình thực hiện các công việc sau:​
Nhập liệu cho mảng A có n phần tử nguyên từ bàn phím. 
Sắp xếp mảng số đã nhập tăng dần theo giá trị của các phần tử có trong mảng.
In ra màn hình mảng số ban đầu và mảng đã sắp xếp theo thứ tự tăng dần.​*/
import java.util.Scanner;
public class AppBai11 {
    public static void main(String[] args){
        //khai bao
        int[] a;
        int n;
        Scanner input = new Scanner(System.in);

        //nhap n
        do{
            System.out.print("Nhap n = ");
            n = input.nextInt();
            if(n <= 0){
                System.out.println("Vui long nhap lai n !");
            }
        }while(n <= 0);

        //nhap mang
        System.out.println("Nhap mang:");
        a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = input.nextInt();
        }

        //in mang
        System.out.println("In mang: ");
        for(int i = 0; i < n; i++){
            System.out.print("\t" + a[i]);
        }

        //sap xep
        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j < n; j++)
                if(a[i] > a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
        }

        //in mang da sap xep
        System.out.println("\nIn mang da sap xep:");
        for(int i = 0; i < n; i++){
            System.out.print("\t" + a[i]);
        }
        input.close();
    }
}
