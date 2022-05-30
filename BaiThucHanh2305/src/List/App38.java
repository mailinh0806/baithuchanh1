package List;

import java.util.LinkedList;

public class App38 {
    public static void ShowList(LinkedList<String> list){
        for (String string : list) {
            System.out.println("\t" + string + ", ");
        }
    }
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Java");
        list.add("C++");
        list.add("PHP");
        list.add("Java");
        System.out.println("Vi du su dung phuong thuc addAll()");
        System.out.println("---------------");
        
        LinkedList<String> listA = new LinkedList<String>();
        listA.addAll(list);
        System.out.println("listA:");
        ShowList(listA);
    }
}