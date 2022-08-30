package Cap14;

@FunctionalInterface
public interface OperacaoAritimetica {

    double executar(double valor1, double valor2);


     default int exibir(double valor) {

        System.out.println(valor) ;

         return 0;
     }

}
