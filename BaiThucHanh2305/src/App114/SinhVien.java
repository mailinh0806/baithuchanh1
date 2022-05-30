package App114;

import java.util.Scanner;

public class SinhVien {
    String MaSV;
    String hoTen ;
    String lop;

    public SinhVien() {
    }
    
    public SinhVien(String MaSV, String hoTen, String lop) {
        this.MaSV = MaSV;
        this.hoTen = hoTen;
        this.lop = lop;
    }
    
    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap MaSV: ");
        MaSV = sc.nextLine();
        System.out.println("Nhap ho va ten: ");
        hoTen = sc.nextLine();
        System.out.println("Nhap lop:");
        lop = sc.nextLine();
        
    }

    @Override
    public String toString() {
        return "SinhVien{" + "MaSV=" + MaSV + ", hoTen=" + hoTen + ", lop=" + lop + '}';
    }
    
}