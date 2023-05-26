package CollectionFramework;

import java.util.HashMap;

public class HashMapClass {
    public static void main(String[] args) {
        HashMap<String, String> set = new HashMap<String, String>();

        set.put("Boy", "Shivam");
        set.put(null, "Dev");
        set.put("male", "Chaturvedi");
        System.out.println(set);
    }
}
