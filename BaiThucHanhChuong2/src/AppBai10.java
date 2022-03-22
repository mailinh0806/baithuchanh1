//Viết chương trình nhập từ bàn phím một chuỗi không quá 80 ký tự và một ký tự bất kỳ.
//Đếm và in ra màn hình số lần xuất hiện của ký tự đó trong chuỗi vừa nhập.​
import java.util.Scanner;
public class AppBai10 {
    public static void main(String[] args){
        //khai bao
        String chuoi;
        char kytu, check;
        Scanner input = new Scanner(System.in);
        
        //Nhap chuoi va ki tu
        do{
            System.out.println("Nhap chuoi: ");
            chuoi = input.nextLine();
            System.out.println("Nhap ky tu: ");
            kytu = input.next().charAt(0);
        }while(chuoi.length() > 80);


        int dem = 0;
        for(int i = 0; i < chuoi.length(); i++){
            check = chuoi.charAt(i);
            if(check == kytu){
                dem++;
            }
        }
        System.out.println("So lan xuat hien "+ kytu +" trong chuoi "+ chuoi +" la: " + dem);
        input.close();
    }
}
