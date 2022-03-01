/*Viết chương trình nhập vào 2 số nguyên dương a và b từ bàn phím. Tìm ước chung
lớn nhất của a,b*/
import java.util.Scanner;
public class App1 {
    public static void main(String[] args){
        //khai bao 
        int a, b;

        //khoi tao doi tuong input lop scanner
        Scanner input = new Scanner(System.in);

        //nhap a, b lon hon 0
        do{
            System.out.print("Nhap a, b: ");
            a = input.nextInt();
            b = input.nextInt();
            if(a <= 0 || b <= 0){
                System.out.println("Vui long nhap a, b lon hon 0 !");
            }
        }while(a <= 0 || b <= 0);

        //tim ucln cua a, b
        while(a != b){
            if (a > b){
                a -= b;
            }else{
                b -= a;
            }
        }

        //in ucln ra
        System.out.println("Ucln cua 2 so vua nhap la: " + a);
        input.close();
    }
}
