public class Aluno {
    private int matricula;
    private String nome;
    private double n1;
    private double n2;
    private double trabalho;

    public Aluno(int matricula, String nome){
        this.matricula = matricula;
        this.setNome(nome);
    }

    public int getMatricula(){
        return matricula;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getN1(){
        return n1;
    }

    public void setN1(double n1){
        this.n1 = n1;

        if(n1 >= 11){
            System.out.println("Nota invalida.");
        }
    }

    public double getN2(){
        return n2;
    }
    
    public void setN2(double n2){
        this.n2 = n2;
        if(n1 >= 11){
            System.out.println("Nota invalida.");
        }
    }
    
    public double getTrabalho() {
        return trabalho;
    }

    public void setTrabalho(double trabalho) {
        this.trabalho = trabalho;
        if(n1 >= 11){
            System.out.println("Nota invalida.");
        }
    }
     
    public static double getMedia(double n1,double n2, double trabalho){
        double media = (n1*3+n2*3+trabalho*2) / 8;
        return media;
    }

    public static Double getSituacao(double media){
        
        if(media < 5){
            return "Aluno Reprovado";
        }
        if (media < 7) {
            return "Aluno em recuperação";
        }
        if (media <= 10) {
            return "Aluno Aprovado";
        }
        

    }

}
