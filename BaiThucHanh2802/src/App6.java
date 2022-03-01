/**Nhập vào 1 số nguyên dương n, liệt kê các số hoàn thiện nhỏ hơn n. */
import java.util.Scanner;
public class App6 {
    public static void main(String[] args){
        //khai bao n
        int n;

        //khoi tao doi tuong input thuoc lop Scanner
        Scanner input = new Scanner(System.in);

        //Nhap so nguyen n
        do{
            System.out.print("Nhap so nguyen duong n: ");
            n = input.nextInt();
            if(n <= 0){
                System.out.println("Vui long nhap lai !");
            }
        }while(n <= 0);

        //liet ke so hoan thien nho hon n
        System.out.println("So hoan thien nho hon n:");
        while(n > 0){
            int sum = 0;
            for(int i = 1; i < n; i++){
                if(n % i == 0){
                    sum += i;
                }
            }
            if(sum == n){
                System.out.print(n +"\t");
            }
            n--;
        }
        input.close();
    }
}
