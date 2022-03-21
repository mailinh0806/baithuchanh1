public static void main(String[] args) {
    
}
 
class HinhTron {
    final float PI = 3.14f;
    float r;
    float cv;
    float dt;

    void nhapBanKinh() {
        System.out.println("Hãy nhập vào Bán kính Hình tròn: ");
        Scanner scanner = new Scanner (System.in);
        r = scanner.nextFloat();
    }
    void tinhChuVi() {
        cv = 2 * PI * r;
    }
    void tinhDienTich() {
        dt = PI * r * r;
    }
     void inChuVi() {
        System.out.println("Chu vi Hình tròn: " + cv);
    }                                   
     void inDienTich() {
        System.out.println("Diện tích Hình tròn: " + dt);
    }
}