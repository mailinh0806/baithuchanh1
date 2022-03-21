import java.util.Scanner;

public class sinhvien {

    String msv = new String("msv");
    String hoten = new String("hoten");
    String diachi = new String("diachi");
    boolean gioitinh = true;
    String ngaysinh = new String("01/01/1890");

    public void nhapttsv() {
        Scanner sc = new Scanner(System.in);

        System.out.print("masv: ");
        this.msv = sc.nextLine();

        System.out.print("hoten: ");
        this.hoten = sc.nextLine();

        System.out.print("sinh vien nam?: ");
        this.gioitinh = sc.hasNext();

        System.out.print("nam sinh ");
        sc.nextLine();
        this.ngaysinh = sc.nextLine();

        System.out.print("diachi: ");
        this.diachi = sc.nextLine();

        sc.close();

    }

    public void xuatttsv() {
        System.out.println("masv: " + msv);
        System.out.println("hoten: " + hoten);
        if (gioitinh == true)
            System.out.println("gioi tinh: nam");
        if (gioitinh == false)
            System.out.print("gioi tinh: nu");
        System.out.println("nam sinh " + ngaysinh);
        System.out.println("diachi: " + diachi);
    }

}