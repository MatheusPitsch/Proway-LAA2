import javax.print.attribute.standard.Media;

public class TesteAluno {
    

    public static void main(String[] args) {
        
        
        Aluno aluno = new Aluno(111,"Matheus");
        
        aluno.setN1(8);
        aluno.setN2(9);
        aluno.setTrabalho(8.5);

        System.out.println(aluno.getMedia(6, 9, 8.5));
    }
    

}
