package Cap14;

public class MaioresSalarios {
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

        double[] salariosTop = DoubleArrayUtils.filtraValores(salariosBrutos, s -> s >= 7000);

        DoubleArrayUtils.processaValores(salariosTop, System.out::println);
    }
}
