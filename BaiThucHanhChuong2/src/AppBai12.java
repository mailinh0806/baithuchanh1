<<<<<<< HEAD
/*Viết chương trình nhập vào các phần tử cho một ma trận 2 chiều, 
sau đó tìm và hiển thị phần tử có giá trị lớn nhất trong ma trận đó.*/
import java.util.Scanner;
public class AppBai12 {
    public static void main(String[] args) {
        //Khai bao so dong va so cot cua ma tran​
        int m, n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so dong: ");
        m = scanner.nextInt();
        System.out.println("Nhap so cot: ");
        n = scanner.nextInt();
        
        //nhap ma tran
        int A[][] = new int[m][n];
        System.out.println("Nhap cac phan tu: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
            System.out.print("A[" + i + "]["+ j + "]= ");
            A[i][j] = scanner.nextInt();
            }
        }
        //so sanh cac phan tu trong ma tran
        int max = A[0][0];
        for(int i = 0; i < m ;i++){
            for (int j = 0; j < n; j++) {
                if (max < A[i][j]) {
                    max = A[i][j];
                }
            }
        }
        //in phan tu lon nhat trong ma tran
        System.out.println("Phan tu lon nhat trong ma tran = "+max);

        //duyet mang de in ra vi tri cac phan tu co gia tri bang gia tri max
        System.out.println("Vi tri cua phan tu lon nhat:");
        for(int i = 0; i < m ;i++){
            for (int j = 0; j < n; j++) {
                if (max == A[i][j]) {
                    System.out.print("A[" + i + "]["+ j + "]\n");
                }
            }
        }
        scanner.close();
    }
}   
=======
/*Viết chương trình nhập vào các phần tử cho một ma trận 2 chiều, 
sau đó tìm và hiển thị phần tử có giá trị lớn nhất trong ma trận đó.*/
import java.util.Scanner;
public class AppBai12 {
    public static void main(String[] args) {
        //Khai bao so dong va so cot cua ma tran​
        int m, n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so dong: ");
        m = scanner.nextInt();
        System.out.println("Nhap so cot: ");
        n = scanner.nextInt();
        
        //nhap ma tran
        int A[][] = new int[m][n];
        System.out.println("Nhap cac phan tu: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
            System.out.print("A[" + i + "]["+ j + "]= ");
            A[i][j] = scanner.nextInt();
            }
        }
        //so sanh cac phan tu trong ma tran
        int max = A[0][0];
        for(int i = 0; i < m ;i++){
            for (int j = 0; j < n; j++) {
                if (max < A[i][j]) {
                    max = A[i][j];
                }
            }
        }
        //in phan tu lon nhat trong ma tran
        System.out.println("Phan tu lon nhat trong ma tran = "+max);

        //duyet mang de in ra vi tri cac phan tu co gia tri bang gia tri max
        System.out.println("Vi tri cua phan tu lon nhat:");
        for(int i = 0; i < m ;i++){
            for (int j = 0; j < n; j++) {
                if (max == A[i][j]) {
                    System.out.print("A[" + i + "]["+ j + "]\n");
                }
            }
        }
        scanner.close();
    }
}   
>>>>>>> 6253c83 (del)
