public class Pessoa {
    private static final String[][] Agenda = null;
    private String nome;
    private String telefone;
    private String cadastro;

    // Contructor definir as propiedades obrigatorias do objeto
    public Pessoa(String nome, String telefone) {
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

    public void setCadastro(String nome, String telefone){
        Agenda[0][0] = nome;
        Agenda[0][1] = telefone;
    }

    public String getAgenda(Agenda){
        System.out.println(Agenda);
    }
}
