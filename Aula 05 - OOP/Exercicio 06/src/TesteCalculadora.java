package src;

public class TesteCalculadora {
    public static void main(String[] args) {
        new Calculadora();
        
        System.out.println("SOMA = " + Calculadora.soma(10 ,11 ));
        System.out.println("SUBTRAÇÃO = " + Calculadora.subtracao(5, 10));
        System.out.println("MULTIPLICAÇÃO = " + Calculadora.multiplicacao(10, 2));
        System.out.println("DIVISÃO = " + Calculadora.divisao(15, 2));
    }
}
