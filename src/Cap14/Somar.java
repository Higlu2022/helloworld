package Cap14;

public class Somar implements OperacaoAritimetica{

    @Override
    public double executar(double valor1, double valor2) {
        return valor1 + valor2;
    }
}
