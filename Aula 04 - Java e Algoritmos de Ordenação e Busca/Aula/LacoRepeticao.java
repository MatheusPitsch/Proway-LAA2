package Aula;

public class LacoRepeticao {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){ //I COMEÇA VALENDO 0, IRA RODAR ENQUANTO I FOR MENOR QUE 10, I== SERVE PARA ADICIONAR 1 AO I
        System.out.println(i);
        }

        int i = 0;
        while (true) {
            
            i++;
            
            System.out.println(i);

            if (i == 10){
                break;
            }
        }
    }
}
