import javax.print.attribute.standard.Media;

public class TesteAluno {
    

    public static void main(String[] args) {
        
        
        Aluno aluno = new Aluno(111,"Matheus");
        
        aluno.setN1(8);
        aluno.setN2(9);
        aluno.setTrabalho(8.5);

        System.out.println(Aluno.getMedia(9,9,8.5));

        System.out.println(Aluno.getSituacao(8.75));
    }
    

}
