/**Nhập vào 1 số nguyên dương, in ra số theo thứ tự ngược lại. */
import java.util.Scanner;
public class App9 {
    public static void main(String[] args){
        //khai bao number
        int number;

        //khoi tao doi tuong input thuoc lop Scanner
        Scanner input = new Scanner(System.in);

        //Nhap so nguyen duong
        do{
            System.out.print("Nhap vao so nguyen duong: ");
            number = input.nextInt();
            if(number <= 0){
                System.out.println("Vui long nhap lai !");
            }
        }while(number <= 0);

        //in ra so theo thu tu nguoc lai
        int socuoi;
        int nghichdao = number % 10;
        while(number >= 10){
            number /= 10;
            socuoi = number % 10;
            nghichdao = (nghichdao * 10) + socuoi;   
        }
        System.out.println(nghichdao);
        input.close();
    }
}
