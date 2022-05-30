import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class App112 {

    static void display(LinkedList<String> linkedList) {
        linkedList.forEach((t) -> {
            System.out.println(t);
        });
    }
    
    static void DanhSachTHILai(LinkedList<String> linkedList
            ,LinkedList<String> dsThiLai, float diem,
            String arrThongTin[]){
        for(int i = 0; i < linkedList.size(); i++){
            String sv = linkedList.get(i);
            arrThongTin = sv.split(" ");
            float point = Float.parseFloat(arrThongTin[1]);
            if(point <= 5){
                dsThiLai.add(sv);
            }
        }
        System.out.println("So sinh vien thi lai la : " + (dsThiLai.size()));
        System.out.println("Ten va diem sinh vien thi lai: ");
        Iterator<String> iterator = dsThiLai.iterator();
        while (iterator.hasNext()) {            
            System.out.println(iterator.next());
        }
    }
    public static void main(String[] args) {
        String name, infor;
        float diem = 0;
        String arrThongTin[] = null;
        Scanner sc = new Scanner(System.in);
        LinkedList<String> linkedList = new LinkedList<>();
        
        do {
            System.out.println("Nhap ten snh vien: ");
            name = sc.nextLine();
            if (!name.isEmpty()) {
                System.out.println("Nhap Diem sinh vien:");
                diem = Float.parseFloat(sc.nextLine());
                infor = name + ", " + diem;
                linkedList.add(infor);
            }
        } while (!name.isEmpty());
        
        LinkedList<String> dsThiLai = new LinkedList<>();
        DanhSachTHILai(linkedList, dsThiLai, diem, arrThongTin);
    }
}