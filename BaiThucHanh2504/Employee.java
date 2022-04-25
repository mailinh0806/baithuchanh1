package packBaiTap;
public class Employee extends Person {
    private int id;

    public Employee(String name, int age, int id){
        super(name, age);
        this.id = id;
    }
    public void setId(int id){
        this.id =id;
    }
    public int getId(){
        return id;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("ID: " + id);
    }
}