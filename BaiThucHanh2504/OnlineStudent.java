package packBaiTap;

public class OnlineStudent extends Person {
    private String hocOnl;
    public OnlineStudent(String name, int age, String hocOnl){
        super(name, age);
        this.hocOnl = hocOnl;
    }
    public void setHocOnl(String hocOnl){
        this.hocOnl = hocOnl;
    }
    public String getHocOnl() {
        return hocOnl;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Diem danh hoc Onl:" + hocOnl);

    }
}