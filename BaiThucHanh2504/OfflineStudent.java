package packBaiTap;

public class OfflineStudent extends Person {
    private String coMat;
    public OfflineStudent(String name, int age, String coMat){
        super(name, age);
        this.coMat = coMat;
    }
    public void setDiemDanh(String conMat){
        this.coMat = coMat;
    }
    public String getDiemDanh(){
        return coMat;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Diem danh: " + coMat);
    }
}