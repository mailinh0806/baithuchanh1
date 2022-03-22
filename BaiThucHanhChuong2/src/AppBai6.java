//Viết chương trình nhập vào 1 số nguyên dương bất kỳ từ bàn phím. Sau đó tính và in ra giai thừa của số đó.​
import java.util.Scanner;
public class AppBai6 {
    public static void main(String[] args){
        //Khai bao
        int number;
        Scanner input = new Scanner(System.in);

        //Nhap so nguyen duong bat ki
        do{
            System.out.print("Nhap so nguyen duong : ");
            number = input.nextInt();
            if(number <= 0){
            System.out.println("Ban da nhap sai !");
            }
        }while(number <= 0);

        //tinh giai thua
        int sum = number;
        do {
            --number;
            sum *= number;
        } while (number == 1);

        //in ket qua ra man hinh
        System.out.println("Giai thua = " + sum);
        input.close();
    }
}
