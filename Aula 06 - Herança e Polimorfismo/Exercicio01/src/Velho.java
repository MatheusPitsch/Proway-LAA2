package Exercicio01.src;

public class Velho extends Imovel {

    public Velho(String endereco, double valor) {
        super(endereco, valor);
    }
    
    private double getAtributo(){
        double atributo = this.valor - .15;
        return atributo;
    }

    public double getCauculaTotal(){
        this.getAtributo();
        double valorFinal = this.valor + this.getAtributo();
        return valorFinal;
    }

    
}
