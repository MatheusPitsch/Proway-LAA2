public class Aluno {
    
    private int matricula;
    private String nome;
    private double n1;
    private double n2;
    private double trabalho;

    

    public Aluno(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getN1(){
        return n1;
    }

    public void setN1(double n1){
        this.n1 = n1;
    }

    public double getN2(){
        return n2;
    }

    public void setN2(double n2){
        this.n2 = n2;
    }
    
    public double getTrabalho() {
        return trabalho;
    }

    public void setTrabalho(double trabalho) {
        this.trabalho = trabalho;
    }

    public double getMedia(){
        double media = (this.n1*3+this.n2*3+this.trabalho*2) / 8;
        return media;
    }

    public String getSituacao(){
        
        double media = this.getMedia();

        if (media <= 4.99) {
            return "Reprovado";
        } else if(media <= 6.99 ){
            return  "Recuperação";
        }else if(media <= 10){
            return"Aprovado";
        }else{
            return "Media invalida";
        }
    }
}

