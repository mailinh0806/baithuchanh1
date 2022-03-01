/**Nhập vào các số nguyên cho đến khi gặp 0, đưa ra giá trị lớn nhất trong các số chia
hết cho 5 vừa nhập được. */
import java.util.Scanner;
public class App8 {
    public static void main(String[] args){
        //khai bao number
        int number, max = -999999999;

        //khoi tao doi tuong input thuoc lop Scanner
        Scanner input = new Scanner(System.in);

        //nhap so nguyen
        do{
            System.out.print("Nhap so nguyen: ");
            number = input.nextInt();
            if(number > max && number != 0 && number % 5 == 0){
                max = number;
            }
        }while(number != 0);

        //in ra gia tri lon nhat
        if(max == -999999999){
            System.out.println("Khong co gia tri lon nhat");
        }else{
            System.out.println("Gia tri lon nhat chia het cho 5 la: " + max);
        }
        input.close();
    }
}
