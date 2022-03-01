/**Nhập vào 1 số nguyên dương, kiểm tra xem nó có phải nguyên tố không ? (số nguyên
tố sẽ không chia hết cho tất cả các số từ 2 đến số tự nhiên đi trước số đó). */

import java.util.Scanner;
public class App3 {
    public static void main(String[] args){
        // khai bao number thuoc lop int
        int number;

        //khoi tao doi tuong input thuoc lop Scanner
        Scanner input = new Scanner(System.in);

        //Nhap so nguyen duong
        do{
            System.out.print("Nhap so nguyen duong: ");
            number = input.nextInt();
            if(number <= 0){
                System.out.println("Vui long nhap so nguyen duong !");
            }
        }while(number <= 0);

        //Kiem tra so nguyen to
        boolean kt = false;
        for(int i = 2; i < number; i++){
            if(number % i == 0){
                kt = true;
                break;
            }
        }
        if (kt == true) {
            System.out.println(number + " khong la so nguyen to");            
        } else {
            System.out.println(number + " la so nguyen to");            
        }
        input.close();
    }
}