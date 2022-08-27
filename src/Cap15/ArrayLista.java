package Cap15;

import java.util.ArrayList;
import java.util.List;

public class ArrayLista {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>(100);

        list.add("Alex");
        list.add("Fernando");
        list.add("Felipe");

        list2.add(10);
        list2.add(20);
        list2.add(30);

        for (String listando : list) {
            System.out.println(listando);
        }

        for (Integer listandoNumeros : list2) {
            System.out.println(listandoNumeros);
        }

        list.remove(2);
        System.out.println(list);

    }

}
