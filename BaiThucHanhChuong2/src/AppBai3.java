//Viết chương trình nhập vào tên và một số tương ứng là năm. Sau đó xuất ra nhóm tuổi của người đó như sau:​
//Nếu tuổi người đó < 16 thì hiện thông báo "Bạn [Tên] ở độ tuổi vị thành niên". ​
//Nếu tuổi người đó >= 16 và nhỏ hơn 18 thì hiện thông báo "Bạn [Tên] ở độ tuổi trưởng thành". ​
//Nếu tuổi người đó >= 18 thì hiện thông báo "Bạn [Tên] đã già".
import java.util.Scanner;
public class AppBai3 {
    public static void main(String[] args){
        //khai bao
        String ten;
        int nam, namnay;
        Scanner input = new Scanner(System.in);

        //Nhap 
        System.out.print("Nhap Ten: ");
        ten = input.nextLine();
        System.out.print("Nhap nam hien tai: ");
        namnay = input.nextInt();
        System.out.print("Nhap nam: ");
        nam = input.nextInt();

        //in ra man hinh
        if((namnay - nam) < 16){
            System.out.println("Ban " + ten + " o do tuoi vi thanh nien");
        }else if((namnay - nam) >= 16 && (namnay - nam) < 18){
            System.out.println("Ban " + ten + " o do tuoi truong thanh");
        }else if((namnay - nam) >= 18){
            System.out.println("Ban " + ten + " da gia");
        }
        input.close();
    }
}
