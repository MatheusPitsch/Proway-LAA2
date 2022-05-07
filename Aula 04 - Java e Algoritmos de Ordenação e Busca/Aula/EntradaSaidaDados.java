package Aula;

import java.text.Format;
import java.util.Scanner;

public class EntradaSaidaDados {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = input.nextLine();
        System.out.printf("Seu nome é %s",nome);

        input = new Scanner(System.in); //REZETA O SCANNER

        System.out.println("Digite sua idade: ");
        int idade = input.nextInt();
        System.out.println(idade);

        System.out.println("Digite seu salario: ");
        double salario = input.nextDouble(); //DEVE SER USADO A VIRGULA
        System.out.println("O salário é " + salario); //PARA MOSTRAR UMA FRASE + VARIAVEL
    }
    
}
