package Cap15;

import java.util.ArrayList;

public class Cap15_Lab2 {
    public static void main(String[] args) {

        ArrayList<Estudante> estudanteList = new ArrayList<>();


        estudanteList.add(new Estudante("Joana", 8.5, 8.5));
        estudanteList.add(new Estudante("Antônio", 6.0, 9.0));
        estudanteList.add(new Estudante("Mariana", 7.5, 9.0));
        estudanteList.add(new Estudante("Ricardo", 7.0, 6.0));
        estudanteList.add(new Estudante("Gustavo", 9.5, 10.0));

        estudanteList.forEach(estudante ->
                estudante.setMedia(
                        (estudante.getNotaMatematica() + estudante.getNotaPortugues()) / 2));

        estudanteList.forEach(estudante ->
                System.out.println(
                        estudante.getNome() + " Média: " + estudante.getMedia()));


    }

}
