package Cap14;

public class Executar {

    public static void main(String[] args) {

        OperacaoAritimetica soma = new Somar();
        System.out.println("A soma dos numeros é: " + soma.executar(10, 30));

        OperacaoAritimetica dividir = new Dividir();
        System.out.println("A divisão dos numeros é: " + dividir.executar(50, 50));

        OperacaoAritimetica multiplicar = new Multiplicar();
        System.out.println("A multiplicação dos numeros é: " + multiplicar.executar(10, 10));

        OperacaoAritimetica subtrair = new Subtrair();
        System.out.println("A subtração dos numeros é: " + subtrair.executar(50, 30));

        System.out.println("------------------------------------------------------------------------------");

        OperacaoAritimetica funcionalSoma = (parametro1, parametro2) -> parametro1 + parametro2;
        OperacaoAritimetica funcionlDividir = (parametro1, parametro2) -> parametro1 / parametro2;
        OperacaoAritimetica funcionalSubtrair = (parametro1, parametro2) -> parametro1 - parametro2;
        OperacaoAritimetica funcionalMultiplicar = (parametro1, parametro2) -> parametro1 * parametro2;

        System.out.println("A soma funcional: " + funcionalSoma.executar(10, 10));
        System.out.println("A dvisao funcional: " + funcionlDividir.executar(10, 10));
        System.out.println("A subtração funcional: " + funcionalSubtrair.executar(10, 10));
        System.out.println("A divisão funcional: " + funcionalMultiplicar.executar(10, 10));

        System.out.println("------------------------------------------------------------------------------");

        funcionalSoma.exibir(funcionalSoma.executar(10, 20));

        Produto produto = new Produto("Sabonete", 2);
        OperacaoAritimetica calculaNovoValor = produto::aumentarPreco;
        double valor = produto.aumentarPreco(50, 20);
        System.out.println(valor);
    }
}
