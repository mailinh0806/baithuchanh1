package Map;

import java.util.HashMap;
import java.util.Set;

public class App85 {
    public static void main(String[]agrs){
        HashMap<String , String> hashMap = new HashMap<>();
        hashMap.put("CSLT", "Co so lap trinh" );
        hashMap.put("C++", "C++");
        hashMap.put("C#", "C sharp" );
        hashMap.put("PhP","PHP");
        hashMap.put("Java", "Java");
        
        Set<HashMap.Entry<String , String>> setHashMap =  hashMap.entrySet();
        System.out.println("CaC entry co trong setHashMap");
        System.out.println(setHashMap);
    }
    
}