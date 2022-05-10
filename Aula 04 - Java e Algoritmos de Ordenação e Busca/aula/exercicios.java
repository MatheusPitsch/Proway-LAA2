import java.util.Scanner;

public class exercicios {
    public static void dados() {
        Scanner dados = new Scanner(System.in);

        System.out.println("Digite o nome do colaborador: ");
        String nome = dados.nextLine();

        System.out.println("Digite o cargo do colaborador: ");
        String cargo = dados.nextLine();
        
        System.out.println("Digite a quantidade de horas extras: ");
        int horasExtras = dados.nextInt();

        System.out.println("Digite a quantidade de faltas: ");
        int faltas = dados.nextInt();

        System.out.println("O colaborador usa Plano de saude? ");
        String planoDeSaude = dados.next();

    }
    public static void main(String[] args) {
        
    }
    }

}
