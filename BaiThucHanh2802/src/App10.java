/**Nhập vào 1 số nguyên dương, hãy cho biết số đó có bao nhiêu chữ số. */
import java.util.Scanner;
public class App10 {
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

        //dem so chu so
        int dem = 0;
        while(number > 0){
            number /= 10;
            dem++;
        }
        System.out.println("So do co " + dem + " chu so");
        input.close();
    }
}
