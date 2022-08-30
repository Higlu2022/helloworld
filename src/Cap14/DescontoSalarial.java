package Cap14;

public class DescontoSalarial {

    public static void main(String[] args) {

    double[] salariosBrutos = {
            1_350.00,
            4_320.15,
            8_235.25,
            2_500.55,
            1_830.00,
            850.26,
            3_614.29,
            12_500.00};

    double[] salariosLiquidos = DoubleArrayUtils.transformaValores(salariosBrutos, s -> s * 0.9);

    DoubleArrayUtils.processaValores(salariosLiquidos, s -> System.out.println(s));




    }
}
