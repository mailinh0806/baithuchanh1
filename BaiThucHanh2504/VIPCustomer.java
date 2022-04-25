package packBaiTap;

public class VIPCustomer extends Person {
    private int balance;
    private double discount;
    public VIPCustomer(String name, int age, int balance, double discount){
        super(name, age);
        this.balance = balance;
        this.discount = discount;
    }
    public void setBalance(int balance){
        this.balance = balance;
    }
    public int getBalance(){
        return balance;
    }
    public void setDiscount(double discount ){
        this.discount = discount;
    }
    public double getDiscount(){
        return discount;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Discount: " +  discount + "%");
        System.out.println("Balance: " + (balance - (balance * discount / 100)));

    }

}