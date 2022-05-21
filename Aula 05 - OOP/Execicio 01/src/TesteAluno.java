public class TesteAluno {
    
    public static void main(String[] args) {
        
        Aluno al1 = new Aluno(111, "Matheus");

        System.out.println(al1.getMatricula());
        System.out.println(al1.getNome());

        al1.setN1(5);
        al1.setN2(5);
        al1.setTrabalho((float) 5.5);

        System.out.println(al1.getMedia());
        al1.getSituacao();
        
    }
}
