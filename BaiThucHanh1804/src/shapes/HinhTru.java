package shapes;

import java.util.Scanner;

public class HinhTru extends HinhTron {
    public float chieuCao;

    public HinhTru(){
        ten = "Hinh Tru";
    }

    public void nhapChieuCao(){
        nhapBanKinh();

        System.out.println("Chieu Cao = ");
        Scanner input = new Scanner(System.in);
        chieuCao = input.nextFloat();
        input.close();
    }

    public void tinhTheTich(){
        tinhDienTich();
        theTich = dienTich * chieuCao;
    }
}
