/**Nhập vào các số thực cho đến khi gặp 0, đưa ra giá trị lớn nhất trong các số vừa
nhập. */
import java.util.Scanner;
public class App7 {
    public static void main(String[] args){
        //khai bao number
        double number, max = -999999999;

        //khoi tao doi tuong input thuoc lop Scanner
        Scanner input = new Scanner(System.in);

        //nhap cac so thuc den khi  gap 0
        do{
            System.out.print("Nhap so thuc: ");
            number = input.nextDouble();
            if(number > max && number != 0){
                max = number;
            }
        }while(number != 0);

        //in ra gia tri lon nhat
        if(max == -999999999){
            System.out.println("Khong co gia tri lon nhat");
        }else{
            System.out.println("Gia tri lon nhat la " + max);
        }
        input.close();
    }
}
