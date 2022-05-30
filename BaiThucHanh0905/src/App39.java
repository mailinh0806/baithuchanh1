import java.util.LinkedList;
import java.util.Scanner;


public class App39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Thang1");
        linkedList.add("Thang2");
        linkedList.add("Thang3");
        linkedList.add("Thang4");
        linkedList.add("Thang5");
        linkedList.add("Thang6");
        linkedList.add("Thang7");
        linkedList.add("Thang8");
        linkedList.add("Thang9");
        linkedList.add("Thang10");
        linkedList.add("Thang11");
        linkedList.add("Thang12");
        
        System.out.println("Nhap vao chi so cua phan tu can lay: ");
        int index = sc.nextInt();
        if((index < 0) || (index > (linkedList.size() -1))){
            System.out.println("Chi so can lay phai lay phai lon  0 va nho hon: " + (linkedList.size() -1));
        }else{
            String node = linkedList.get(index);
            System.out.println("Phan tu co chi so bang = " + index + "trong linkedList la " + node);
        }
        
        String firstNode = linkedList.getFirst();
        String lastNode = linkedList.getLast();
        
        System.out.println("\nPhan tu dau tien trong danh sach la " + firstNode + " ;Phan tu cuoi cung trong danh sach la " + lastNode);
    }
}