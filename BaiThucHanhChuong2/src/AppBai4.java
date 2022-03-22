
//Viết chương trình nhập vào một số nguyên từ 1 - 12 từ bàn phím và hiển thị ra 
//tháng tương ứng với số đó (nhập vào số 1 thì sẽ hiển thị ra là "Tháng 1“).​
import java.util.Scanner;

public class AppBai4 {
    public static void main(String[] args) {
        // khai bao
        int a;
        Scanner input = new Scanner(System.in);

        // Nhap so nguyen
        System.out.print("Nhap so nguyen : ");
        a = input.nextInt();

        //in ra man hinh ket qua
        switch (a) {
            case 1:
                System.out.println("Thang 1");
                break;

            case 2:
                System.out.println("Thang 2");
                break;

            case 3:
                System.out.println("Thang 3");
                break;

            case 4:
                System.out.println("Thang 4");
                break;

            case 5:
                System.out.println("Thang 5");
                break;

            case 6:
                System.out.println("Thang 6");
                break;

            case 7:
                System.out.println("Thang 7");
                break;

            case 8:
                System.out.println("Thang 8");
                break;

            case 9:
                System.out.println("Thang 9");
                break;

            case 10:
                System.out.println("Thang 10");
                break;

            case 11:
                System.out.println("Thang 11");
                break;

            case 12:
                System.out.println("Thang 12");
                break;

            default:
                System.out.println("Ban da nhap sai !");
        }
        input.close();
    }
}
