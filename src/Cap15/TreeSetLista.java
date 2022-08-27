package Cap15;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetLista {

    public static void main(String[] args) {

        Set<String> treeSetLista = new TreeSet<>();

        treeSetLista.add("Maria");
        treeSetLista.add("Alex");
        treeSetLista.add("Joao");

        for (String cadaElemento : treeSetLista) {
//            System.out.println(cadaElemento);
        }
// -----------------------------------------------------------------------------------
        Set<Integer> treeSetListaMegaSena = new TreeSet<>();

        treeSetListaMegaSena.add(05);
        treeSetListaMegaSena.add(60);
        treeSetListaMegaSena.add(34);
        treeSetListaMegaSena.add(28);
        treeSetListaMegaSena.add(19);
        treeSetListaMegaSena.add(03);


        for (Integer cadaElemento : treeSetListaMegaSena) {
//            System.out.println(cadaElemento);
        }
// -----------------------------------------------------------------------------------

        treeSetListaMegaSena.clear();
        Random random = new Random();

        while (treeSetListaMegaSena.size() <= 5) {
            treeSetListaMegaSena.add(random.nextInt(60) + 1);
        }

//        treeSetListaMegaSena.forEach(cadaElemento -> System.out.println(cadaElemento));



    }
}
