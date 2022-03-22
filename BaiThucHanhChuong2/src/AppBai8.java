//Viết chương trình nhập vào một dãy số gồm n số nguyên từ bàn phím.
// Tính và in ra màn hình trung bình cộng của n số nguyên đã nhập​
import java.util.Scanner;
public class AppBai8 {
        public static void main(String[] args){
            //Khai bao
            int n;
            Scanner input = new Scanner(System.in);

            //Nhap so phan tu cua day
            do{
                System.out.print("So so nguyen cua day: ");
                n = input.nextInt();
                if(n <= 0){
                    System.out.println("Vui long nhap so lon 0 !");
                }
            }while(n <= 0);


            //Nhap day so va tinh tong
            System.out.println("Nhap day so");
            float sum = 0;
            int number;
            for(int i = 0; i < n; i++){
                number = input.nextInt();
                sum += number;
            }

            System.out.println("Trung binh cong cua " + n + " so nguyen da nhap la: " + (sum / n));
            input.close();
        }
}
