public class App {
    public static void main(String[] args) throws Exception {
        //Instancia = Criar
        Conta primeiraConta = new Conta(100,101101);
        primeiraConta.titular = "Matheus";
        primeiraConta.deposita(2);
        
        Conta segundaConta = new Conta(111,101101);
        segundaConta.titular = "Matheus";
        segundaConta.deposita(2);

        // System.out.println(primeiraConta);

        // boolean conseguiuSacar = primeiraConta.sacar(2);

        // if (conseguiuSacar) {
        //     System.out.println("Saque efetuado com sucesso");
        // }else{
        //     System.out.println("Não consegiu sacar");
        // }
        // System.out.println(primeiraConta.saldo);

        // System.out.println(primeiraConta.getsaldo());
        // primeiraConta.deposita(100);
        // System.out.println(primeiraConta.getsaldo());
    
        // primeiraConta.transferir(50, segundaConta);

        // System.out.println(primeiraConta.getsaldo());
        // System.out.println(segundaConta.getsaldo());

    }

}
