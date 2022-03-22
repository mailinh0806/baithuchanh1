//Viết chương trình nhập vào các phần tử cho một ma trận 2 chiều,
//sau đó tìm và hiển thị phần tử có giá trị lớn nhất trong ma trận đó.​
import java.util.Scanner;

class App81 {
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
        scanner.close();
    }
}   