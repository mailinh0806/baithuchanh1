/**Nhập vào 1 số nguyên dương n, liệt kê các số nguyên tố nhỏ hơn n. */
import java.util.Scanner;
public class App4 {
    public static void main(String[] args){
        //Khai bao n
        int n;

        //khoi tao doi tuong input thuoc lop Scanner
        Scanner input = new Scanner(System.in);

        //Nhap so nguyen duong n
        do{
            System.out.print("Nhap so nguyen duong n: ");
            n = input.nextInt();
            if(n <= 0){
                System.out.println("Vui long nhap lai n !");
            }
        }while(n <= 0);

        //liet ke cac so nguyen to nho hon n
        System.out.println("Cac so nguyen to nho hon n la:");
        while(n > 1){
            boolean kt = false;
            for(int i = 2; i < n; i++){
                if(n % i == 0){
                    kt = true;
                    break;
                }
            }
            if(kt == false){
                System.out.print(n + "\t");
            }
            n--;
        }
        input.close();
    }
}
