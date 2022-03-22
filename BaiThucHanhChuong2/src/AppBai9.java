//Viết chương trình nhập vào một chuỗi bất kỳ bao gồm cả số, ký tự thường và ký tự hoa từ bàn phím.
// Sau đó đếm và in ra số ký tự thường và ký tự hoa và số có trong chuỗi đó.​
import java.util.Scanner;
public class AppBai9 {
    public static void main(String[] args){
        //khai bao
        String chuoi;   
        char kytu;
        int thuong = 0, hoa = 0, so = 0;
        Scanner input = new Scanner(System.in);

        //Nhap chuoi
        System.out.print("Nhap chuoi: ");
        chuoi = input.nextLine();

        //xet chuoi
        for(int i = 0; i < chuoi.length(); i++){
            kytu = chuoi.charAt(i);
            if(kytu >= 'a' && kytu <= 'z'){
                thuong++;
            }
            else if(kytu >= 'A' && kytu <= 'Z'){
                hoa++;
            }
            else if(kytu >= '0' && kytu <= '9'){
                so++;
            }
        }

        //in ket qua
        System.out.println("So ki tu thuong: " + thuong);
        System.out.println("So ki tu hoa: " + hoa);
        System.out.println("So ki tu so: " + so);
        input.close();
    }
}
