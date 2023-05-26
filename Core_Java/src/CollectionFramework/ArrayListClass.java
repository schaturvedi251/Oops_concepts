package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();

        list.add(2);
        list.add(3);
        System.out.println(list);
        list.add(0, 5);
        System.out.println(list);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

//        for (Object l : list) {
//            System.out.println(l);
//        }
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(8);
        list1.add(3);

        list.addAll(1, list1);

        System.out.println(list);


        System.out.println(list.indexOf(2));

    }
}
