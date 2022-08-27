package Cap15;

public class MainGenerico {

    public static void main(String[] args) {

        ClasseGenerica classeGenerica = new ClasseGenerica<>();

        classeGenerica.setValor("Nome");
        System.out.println(classeGenerica.getValor());
        classeGenerica.setValor(10);
        System.out.println(classeGenerica.getValor());
        classeGenerica.setValor(new Funcionario());
        System.out.println(classeGenerica.getValor());


    }

}
