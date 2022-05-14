package aula;

import java.util.Scanner;

//Clase sempre começa com letra maiuscula/nome do arquivo
public class Exercicios {

    public static void main(String[] args) {
        // Todo o codigo devera estar dentro de MAIN
        String[][] funcionarios = new String[5][11];
        Scanner input = new Scanner(System.in);

        String Desenvolvedor_Jr = "2.000";  
        String Desenvolvedor_Pleno = "3.200";  
        String Desenvolvedor_Sênior = "5.000"; 
        String DBA = "7.000";
        String Arquiteto_de_Software = "8.500";

        while (true) {

            System.out.println(
                    "Escolha uma opção:\n1)Cadastrar Funcionário\n2)Listar Funcionário\n3)Listar Funcionário pelo nome\n4)Remover Funcionário\n5)Finalizar sistema");
            int opcao = input.nextInt();

            boolean sair = false;

            switch (opcao) {
                case 0:
                    sair = true;
                    break;
                case 1:
                    System.out.println("Digite o nome do colaborador: ");
                    String nome = input.nextLine();

                    System.out.println("Digite o cargo do colaborador: ");
                    String cargo = input.nextLine();

                    System.out.println("Digite a quantidade de horas extras: ");
                    int horasExtras = input.nextInt();

                    System.out.println("Digite a quantidade de faltas: ");
                    int faltas = input.nextInt();

                    System.out.println("O colaborador usa Plano de saude?n\n 1)Sim \n2)Não");
                    String planoDeSaude = input.nextLine();

                    if (cargo == Desenvolvedor_Jr) {
                        int Salario_Bruto = (int) 2.000;
                        int Desconto_Alimentação = 360;
                    } ;
                    if (cargo == Desenvolvedor_Pleno ); {
                        int Salario_Bruto = (int) 3.200;
                        int Desconto_Alimentação = 420;
                    };
                    if (cargo == Desenvolvedor_Sênior); {
                        int Salario_Bruto = (int)5.000;
                        int Desconto_Alimentação = 500;
                    };

                    if (cargo == DBA);{
                        int Salario_Bruto = (int)7.000;
                        int Desconto_Alimentação = 635;
                    };
                    
                    if (cargo == Arquiteto_de_Software); {
                        int Salario_Bruto = (int)8.500;
                        int Desconto_Alimentação = 765;
                    };

                    if (faltas == 0){
                        int Salario_Bruto += 100;
                    };
                    
                    

                    break;
                case 2:
                    // Listar funcionários
                    break;
                case 3:
                    // Listar funcionário pelo nome
                    break;
                case 4:
                    // Remover um funcionário
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

            if (sair) {
                break;
            }

        }
    }

    private static void elif() {
    }
}