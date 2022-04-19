package shapes;

import java.util.Scanner;

public class HinhVuong extends HinhChuNhat{
    public HinhVuong(){
        ten = "Hinh Vuong";
    }
    public void nhapCanh(){
        System.out.println("Nhap Canh = ");
        Scanner input = new Scanner(System.in);
        chieuDai = chieuRong = input.nextFloat();
        input.close();
    }
}
