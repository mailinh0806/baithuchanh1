/**Nhập vào 1 số nguyên dương , kiểm tra xem số đó có phải là số hòan thiện không?
(số hòan thiện là số có giá trị bằng tổng tất cả các ước của nó không tính bản thân
nó, ví dụ: 6 = 1+2+3). */
import java.util.Scanner;
public class App5 {
    public static void main(String[] args){
        //khai bao number
        int number;

        //khoi tao doi tuong input thuoc lop Scanner
        Scanner input = new Scanner(System.in);

        //Nhap so nguyen duong
        do{
            System.out.print("Nhap so nguyen duong: ");
            number = input.nextInt();
            if(number <= 0){
                System.out.println("Vui long nhap lai so nguyen duong !");
            }
        }while(number <= 0);
        
        //kt so hoan thien
        int sum = 0;
        for(int i = 1; i < number; i++){
            if(number % i == 0){
                sum += i;
            }
        }
        if(sum == number){
            System.out.println(number + " la so hoan thien");
        }else{
            System.out.println(number + " khong la so hoan thien");
        }
        input.close();
    }
}
