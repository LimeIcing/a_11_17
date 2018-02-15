import java.util.HashMap;
import java.util.Map;

public class Main17 {

    /*
    Write a method called subMap that accepts two maps from strings to strings as its parameters and returns true if
    every key in the first map is also contained in the second map and maps to the same value in the second map. For
    example, {Smith=949–0504, Marty=206–9024} is a submap of
    {Marty=206–9024, Hawking=123–4567, Smith=949–0504, Newton=123–4567} . The empty map is a submap of every map.
     */

    public static void main(String[] args) {
        HashMap<String, String> a = new HashMap<>();
        a.put("Smith","949-0504");
        a.put("Marty","206-9024");
        HashMap<String, String> b = new HashMap<>();
        b.put("Marty","206-9024");
        b.put("Hawking","123-4567");
        b.put("Smith","949-0504");
        b.put("Newton","123-4567");
        HashMap<String, String> c = new HashMap<>();
        System.out.println(subMap(a, b));
        System.out.println(subMap(b, a));
        System.out.println(subMap(c, b));
    }

    public static boolean subMap(Map<String, String> m, Map<String, String> n) {
        return n.entrySet().containsAll(m.entrySet());
    }
}
