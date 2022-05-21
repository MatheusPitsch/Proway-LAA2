package src;

public class Calculadora {
    public double n1;
    public double n2;

    public static int soma(int n1, int n2){
        int soma = n1 + n2;
        return soma;
    }

    public static int subtracao(int n1, int n2){
        int subtracao = n1 -n2;
        return subtracao;
    }

    public static double multiplicacao(double n1, double n2){
        double multiplicacao = n1 * n2;
        return multiplicacao;
    }

    public static double divisao(double n1, double n2){
        double divisao = n1 / n2;
        return divisao;
    }
}
