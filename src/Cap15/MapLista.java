package Cap15;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class MapLista {
    public static void main(String[] args) {

        Map<String, String> mapLista = new TreeMap<>();
        mapLista.put("47157105870", "Pedro");
        mapLista.put("41521542154", "Higor");
        mapLista.put("47858745878", "Manuel");
        mapLista.put("96852587891", "Jorge");
        mapLista.put("47858969858", "Rafael");
        mapLista.put("25635795185", "Diego");

        String nome = mapLista.get("47157105870");
//        System.out.println(nome);

        mapLista.put("47157105870", "Felipe");

        nome = mapLista.get("47157105870");
//        System.out.println(nome);
//-------------------------------------------------------------------------------------

        Map<String, Carro> mapListaCarro = new TreeMap<>();

        Carro carro1 = new Carro("Uno", "Azul", "Fiat");

        mapListaCarro.put("DOR1848", carro1);
        mapListaCarro.put("DNS4875", new Carro("Lancer", "Verde", "Mitsubishi"));

//        System.out.println(mapListaCarro.get("DOR1848"));

        mapListaCarro.entrySet().forEach(
                stringCarroEntry -> System.out.println(stringCarroEntry));


    }
}
