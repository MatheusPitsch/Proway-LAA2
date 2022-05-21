package src;

public class Funcionario {
    private int matricula;
    private String nome;
    private double salario;
    
    public Funcionario(int matricula, String nome, Double salario) {
        this.setMatricula(matricula);
        this.setNome(nome);
        this.setSalario(salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
