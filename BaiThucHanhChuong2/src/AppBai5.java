//Viết chương trình nhập vào các số nguyên và tính tổng các số đó, 
//nếu tổng lớn hơn > 100 thì kết thúc vòng lặp và hiển thị thông báo tổng của các số đã nhập.​
import java.util.Scanner;
public class AppBai5 {
    public static void main(String[] args){
        //khai bao
        int number;
        Scanner input = new Scanner(System.in);

        //Nhap so nguyen va tinh tong
        int sum = 0;
        while(sum <= 100){
            System.out.print("Nhap so nguyen : ");
            number = input.nextInt();
            sum += number;
        }

        //in ket qua ra man hinh
        System.out.println("Tong = " + sum);
        input.close();
    }
}
