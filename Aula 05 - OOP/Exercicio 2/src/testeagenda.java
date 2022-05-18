public class testeagenda {
    
    public static void main(String[] args) {
        Agenda ag1 = new Agenda("Matheus", "(47) 9 9999-9999");


        ag1.setArmanezaPessoa("João", "(46) 8 8888-8888");
        // ag1.setImprimirAgenda();
        // ag1.setRemoverPessoa("João");
        // ag1.setImprimirAgenda();
        ag1.setBuscarPessoa("João");
    }
}
