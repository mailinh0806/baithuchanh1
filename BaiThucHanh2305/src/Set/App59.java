package Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class App59 {
    public static void main(String[] args) {
         Set<String> linkedHashSet = new LinkedHashSet<>();
         linkedHashSet.add("Java");
         linkedHashSet.add("C++");
         linkedHashSet.add("Java");
         linkedHashSet.add("PhP");
         for (String sc : linkedHashSet) {
             System.out.println(sc);
        }
    }
}