import java.util.Scanner;

public class exercicios {

    public static void main(String[] args) {
        
        public Void cadastro(); {
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
       
        public static void cadastro() {
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
        
        while (true) {

            if (opcao = 1) {
                cadastro();
            }

            if (opcao = 2) {
                mostraCadastro();
            }

            if (opcao = 3) {
                alteraCadastro();
            }

            if (opcao = 0) {
                break;
            }

        }
    }
}