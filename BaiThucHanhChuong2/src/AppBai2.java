//Viết chương trình kiểm tra số vừa nhập vào là số chẵn hay lẻ.
import java.util.Scanner;
public class AppBai2 {
    public static void main(String[] args){
        //khai bao
        int a;
        Scanner input = new Scanner(System.in);

        //Nhap n
        System.out.print("Nhap n = ");
        a = input.nextInt();

        //Kiem tra chan le
        if(a % 2 == 0){
            System.out.println("So chan");
        }
        else{
            System.out.println("So le");
        }
        input.close();
    }
}
