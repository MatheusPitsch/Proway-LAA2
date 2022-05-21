public class Agenda {
    
    private String nome;
    private String telefone;
    private String[][] agenda = new String[10][2];
    
    public Agenda(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
        agenda[0][0] = this.nome;
        agenda[0][1] = this.telefone;
    }
   
    public void setNome(String nome){
         this.nome = nome;
    }

    public String getNome(){
         return this.nome;
    }

    public void setTelefone(String telefone){
         this.telefone = telefone;
    }
    
    public String getTelefone(){
         return this.telefone;
    }

    public void setArmanezaPessoa(String nome,String telefone){

        for(int i = 0; i < agenda.length; i++){
            if (agenda[i][1] == null) {
                agenda[i][0] = nome;
                agenda[i][1] = telefone;
                System.out.println("Contato Criado com sucesso");
                break;
            }
        }
    }
    public void setImprimirAgenda(){
        for (int i = 0; i < agenda.length; i++) {
            String nome = agenda[i][0];
            String telefone = agenda[i][1];
            System.out.println("______________________");
            System.out.println("Nome: " + nome);
            System.out.println("Telefone: " + telefone);
    }   }

    public void setRemoverPessoa(String nome){
        for (int i = 0; i < agenda.length; i++)
            if (nome == agenda[i][0]) {
                agenda[i][0] = null;
                agenda[i][1] = null;
                System.out.println("Pessoa Removida com sucesso.");
            }
    }

    public void setBuscarPessoa(String nome){
        for (int i = 0; i <agenda.length; i++){
            if (nome == agenda[i][0]) {
                System.out.println("Nome: " + agenda[i][0]);
                System.out.println("Telefone: " + agenda[i][1]);
                break;
            }
        }
    }
}
