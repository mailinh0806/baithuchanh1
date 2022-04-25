package packBaiTap;

public class PartTimeEmployee extends Employee {
    private int gioLam;
    private int paymentPerHour;

    public PartTimeEmployee(String name, int age, int id, int gioLam, int paymentPerHour){
        super(name, age, id);
        this.gioLam = gioLam;
        this.paymentPerHour = paymentPerHour;
    }
    public void setGioLam(int gioLamThem){
        this.gioLam = gioLam;
    }
    public int getGioLam(){
        return gioLam;
    }
    public void setPayMentPerHour(int paymentPerHour){
        this.paymentPerHour = paymentPerHour;
    }
    public int getPayMentPerHour(){
        return paymentPerHour;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Gio lam: " + gioLam);
        System.out.println("Tien luong: " +  gioLam * paymentPerHour + " VND");
    }
}