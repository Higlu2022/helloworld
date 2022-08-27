package Cap15;

public class Carro {

    private String modelo;
    private String cor;
    private String marca;

    public Carro(String modelo, String cor, String marca) {
        this.modelo = modelo;
        this.cor = cor;
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
