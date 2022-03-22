//Nhập vào 2 số bất kỳ từ bàn phím và thực hiện các yêu cầu sau:​
//1. Tính tổng, hiệu, tích, thương, chia lấy dư của 2 số đó.​
//2. Sử dụng các toán tử so sánh đã học để so sánh 2 số đó.​
import java.util.Scanner;
public class AppBai1 {
    public static void main(String[] args){
        //khai bao
        int a, b;
        Scanner input = new Scanner(System.in);

        //nhap 2 so tu ban phim
        System.out.print("Nhap so thu nhat: ");
        a = input.nextInt();
        System.out.print("Nhap so thu hai: ");
        b = input.nextInt();

        //Thuc hien yeu cau so 1
        System.out.println("Tong : " + (a + b));
        System.out.println("Hieu : " + (a - b));
        System.out.println("Tich : " + (a * b));
        System.out.println("Thuong : " + (a / b));
        System.out.println("Chia du : " + (a % b));

        //Thuc hien yeu cau so 2
        System.out.println("a == b :" + (a == b));
        System.out.println("a == b :" + (a == b));
        System.out.println("a > b :" + (a > b));
        System.out.println("a < b :" + (a < b));
        System.out.println("a >= b :" + (a >= b));
        System.out.println("a <= b :" + (a <= b));
        
        input.close();
    }
}
