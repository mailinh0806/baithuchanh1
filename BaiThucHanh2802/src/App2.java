/*Nhập vào 3 số thực dùng làm số đo 3 cạnh của một tam giác, sau đó xác định xem
tam giác tương ứng có tính chất gì: đều, vuông cân, cân, vuông hay thường. */
import java.util.Scanner;
public class App2 {
    public static void main(String[] args){
        //khai bao a, b , c
        double a, b, c;

        //khoi tao doi tuong input lop scaner
        Scanner input = new Scanner(System.in);

        //Nhap vao 3 canh cua tam giac
        System.out.print("Nhap vao 3 canh cua tam giac: ");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        //Xac dinh tinh chat cua tam giac
        if(a == b && b == c && c == a){
            System.out.println("Tam giac deu");
        }else if(a == b || b == c || c == a){
            if(a*a == b*b + c*c || b*b == a*a + c*c || c*c == a*a + b*b){
                System.out.println("Tam giac vuong can");                
            }else{
                System.out.println("Tam giac can");                
            }
        }else{
            if(a*a == b*b + c*c || b*b == a*a + c*c || c*c == a*a + b*b){
                System.out.println("Tam giac vuong");                
            }else{
                System.out.println("Tam giac thuong");                
            }
        }
        input.close();
    }    
}
