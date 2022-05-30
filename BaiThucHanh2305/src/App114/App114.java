package App114;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class App114 {
    public static void main(String[] args) {
        Scanner dc = new Scanner(System.in);
        System.out.println("Nhap N Sinh vien:");
        int n = dc.nextInt();
        SinhVien sv = new SinhVien();
        HashMap<Integer, SinhVien> hashMap = new HashMap<>();  
        
        for(int i = 0; i < n;i++){
            System.out.println("Nhap sinh vien thu" + (i+1) +": ");
            sv.input();
            hashMap.put(i, sv);
        }

        System.out.println("Nhap ten lop can tim: ");
         String Lop = dc.next();
        System.out.println("Cac sinh vien thuoc " + Lop + " la: ");
        System.out.println("Nhap ma sinh vien can tim: ");
        String masv = dc.next();
        System.out.println("Thong tin sinh vien co ma sinh vien " + masv + " la:");
        for(Map.Entry<Integer, SinhVien> item : hashMap.entrySet()) {
            if(item.getValue().getMaSV() == masv) {
                System.out.println(item.getValue());
            }
        }
    }
}