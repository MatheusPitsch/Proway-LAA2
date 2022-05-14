class Conta {
    private double saldo; //Propriedade
    private int agencia;
    int numero;
    String titular;

    //SETTERS -> Metodo utilizado para definir os valores das propiedades privadas
    public void setAgencia(int agencia){
    this.agencia = agencia;
    }
    public double getsaldo (){
        return this.saldo;
    }
    // public double getagencia (){
    //     return this.agencia;
    // }
    //Contrutor Metodo que é chamado quando instaciamos um objeto da classe
    public Conta(int agencia, int numero){
        this.agencia =  agencia;
        this.numero = numero;
        System.out.println("Conta Criada");
    }
    
    //public é utilizado para tornaros métodos/classes/atributos visíveis em outros pacotes.
    private boolean sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }
    public void deposita(double valor){
        //this faz referencia ao objeto
        if (valor > 0){
            this.saldo += valor;
        }else{
            System.out.println("Valor invalido");
        }
        
    }

    public boolean transferir (double valor, Conta destino) {
        if (this.sacar(valor)){
            destino.saldo += valor;
            return true;
        }else{
            return false;
        }
    }
}