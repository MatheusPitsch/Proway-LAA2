public class Aluno {
    
    private int matricula;
    private String nome;
    private float n1;
    private float n2;
    private float trabalho;

    

    public Aluno(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public float getN1(){
        return n1;
    }

    public void setN1(float n1){
        this.n1 = n1;
    }

    public float getN2(){
        return n2;
    }

    public void setN2(float n2){
        this.n2 = n2;
    }
    
    public float getTrabalho() {
        return trabalho;
    }

    public void setTrabalho(Float trabalho) {
        this.trabalho = trabalho;
    }

    public float getMedia(){
        float media = (n1*3+n2*3+trabalho*2) / 8;
        return media;
    }

    public void getSituacao(float media){
        if (media <= 4.99) {
            System.out.println("Reprovado");
        } else if(media <= 6.99 ){
            System.out.println("Recuperação");
        }else if(media <= 10){
            System.out.println("Aprovado");
        }
    }
}

