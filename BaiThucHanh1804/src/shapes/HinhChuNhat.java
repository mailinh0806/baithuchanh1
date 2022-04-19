package shapes;

import java.util.Scanner;

public class HinhChuNhat extends HinhHoc {
    public float chieuDai;
    public float chieuRong;

    public HinhChuNhat(){
        ten = "Hinh Chu Nhat";
    }

    public void nhapChieuDai(){
        System.out.println("Chieu Dai = ");
        Scanner input = new Scanner(System.in);
        chieuDai = input.nextFloat();
        input.close();
    }

    public void nhapChieuRong(){
        System.out.println("Chieu Rong = ");
        Scanner input = new Scanner(System.in);
        chieuRong = input.nextFloat();
        input.close();
    }

    public void tinhChuVi(){
        chuVi = 2 * (chieuDai + chieuRong);
    }

    public void tinhDienTich(){
        dienTich = chieuDai * chieuRong;
    }
}
