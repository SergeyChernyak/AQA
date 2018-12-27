package collection;

import java.util.*;

public class Collection {

    public void collHash () {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(0, "zero");
        hashMap.put(1, "one");
        hashMap.put(2, "two");

        /*
        for (Map.Entry<Integer, String> entry: hashMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }*/

        for (Integer key: hashMap.keySet()
             ) {
            System.out.println(hashMap.get(key));
        }
    }


    public void collSet () {
        Set<String> set = new HashSet<>();

        set.add("one");
        set.add("one");
        set.add("two");
        set.add("two");

        for (Iterator<String> it = set.iterator(); it.hasNext(); ) {
            String value = it.next();
            System.out.println("value = " + value);
        }
    }

}
