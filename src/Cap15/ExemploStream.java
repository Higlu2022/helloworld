package Cap15;

import java.util.ArrayList;
import java.util.List;

public class ExemploStream {
    public static void main(String[] args) {

        List<Funcionario> lista = new ArrayList<>();

        lista.add(new Funcionario(1025, "Higor", "Qa", 5.100));
        lista.add(new Funcionario(1026, "Felipe", "Desenvolvedor", 6.100));
        lista.add(new Funcionario(1027, "João", "ProductOwner", 7.100));
        lista.add(new Funcionario(1028, "André", "Qa", 8.100));
        lista.add(new Funcionario(1029, "Maria", "ProductOwner", 9.100));
        lista.add(new Funcionario(1030, "Diego", "Qa", 10.100));
        lista.add(new Funcionario(1031, "Jão", "Qa", 4.100));
        lista.add(new Funcionario(1032, "Sandro", "ProductOwner", 3.100));
        lista.add(new Funcionario(1033, "Pedro", "Qa", 2.100));
        lista.add(new Funcionario(1034, "Caio", "Desenvolvedor", 1.100));
        lista.add(new Funcionario(1050, "Abner", "Qa", 100.20));

        lista.forEach(funcionario ->
                System.out.println(funcionario));

        System.out.println("--------------------------------- Mostrando apenas os Qa ordenado ---------------------------------");

        lista.stream().filter(cargo ->
                        cargo.getCargo().equals("Qa"))
                .sorted((o1, o2) -> o1.getNome().compareTo(o2.getNome()))
                .forEach(funcionario -> System.out.println(funcionario));

        System.out.println("--------------------------------- Mostrando apenas os com salário acima de 9k ---------------------------------");

        lista.stream().filter(salario ->
                        salario.getSalario() > 9.000)
                .forEach(funcionario -> System.out.println(funcionario));




    }
}
