package Cap15;

public class MainHash {

    public static void main(String[] args) {

        Funcionario funcionario =
                new Funcionario(1025, "Higor", "Qa", 100.00);

        Funcionario funcionario2 =
                new Funcionario(1025, "Higor", "Qa", 100.00);

        ;
        System.out.println(funcionario == funcionario2);
        System.out.println(funcionario.equals(funcionario2));

        funcionario2 = funcionario;

        System.out.println(funcionario.getNome().equals(funcionario2.getNome()));



    }
}
