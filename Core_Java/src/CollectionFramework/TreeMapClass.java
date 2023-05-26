package CollectionFramework;

import java.util.TreeMap;

public class TreeMapClass {
    public static void main(String[] args) {
        TreeMap<String, String> set = new TreeMap<>();

        set.put("Boy", "Shivam");
        set.put(null, "Dev");
        set.put("male", "Chaturvedi");
        System.out.println(set);
    }
}
