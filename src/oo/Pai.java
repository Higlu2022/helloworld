package oo;


public abstract class Pai {
    /**
     * é uma super classe abstrata
     * Não é possivel instanciar uma classe abstrata
     *
     * @see java.lang.Object
     * @author Higor Santos
     */

    //Atributos private, somente a própria classe tem acesso
    private String contasNoExterior;

    //Atributos protect, somente as classe que herdam ou no proprio pacote possuem acesso
    protected long saldoHeranca;

    //Atributos default somente as classes no mesmo pacote tem acesso
    String carro;

    //Atributos public, qualquer classe tem acesso
    public String nome;

    //Contrutor com todos os parâmetros, quando ele é criado o Default deixa de existir
    public Pai(String contasNoExterior, Long saldoHeranca, String carro, String nome) {
        this.contasNoExterior = contasNoExterior;
        this.saldoHeranca = saldoHeranca;
        this.carro = carro;
        this.nome = nome;
    }

    //Método abstrato que obriga a implementação nos filhos
    public abstract long pegarMetodoHeranca();

    //Método abstrato que obriga a implementação nos filhos (Sobrecarga de métodos possuem o mesmo nome, porém com assinaturas diferentes)
    public abstract long pegarMetodoHeranca(long valor);

    //Método que não obriga implementação
    public void pegarCarro() {
        System.out.println("Peguei o carro");
    }

    //Não é possivel sobreescrever
    protected final long pegarSaldoHeranca(){
        return saldoHeranca;

    }

}
