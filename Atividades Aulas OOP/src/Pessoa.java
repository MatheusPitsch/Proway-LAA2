public class Pessoa {
    private String nome;
    private String telefone;

    //Contructor definir as propiedades obrigatorias do objeto
    public Pessoa(String nome,String telefone){
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
