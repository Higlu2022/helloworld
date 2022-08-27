package Cap15;

public class Funcionario {

    private long matricula;
    private String nome;
    private  String Cargo;
    private double salario;

    public Funcionario(long matricula, String nome, String cargo, double salario) {
        this.matricula = matricula;
        this.nome = nome;
        Cargo = cargo;
        this.salario = salario;
    }

    public Funcionario() {
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String cargo) {
        Cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "matricula=" + matricula +
                ", nome='" + nome + '\'' +
                ", Cargo='" + Cargo + '\'' +
                ", salario=" + salario +
                '}';
    }
}
