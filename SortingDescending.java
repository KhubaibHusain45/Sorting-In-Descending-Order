package Questions.Question90;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Khubaib", "Huzaifa", "Salman","Zubair","Ahmad");
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }

    public static void SortInDescending(List<String> list) {
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.isEmpty() || o2.isEmpty()) {
                    return 0;

                } else if (o1.charAt(0) < o2.charAt(0)) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
    }
}
