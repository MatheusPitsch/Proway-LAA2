package Aula; // PASTA EM QUE ESTA SEU ARQUIVO
class TiposDados {
    public static void main(String[] args) {
        //SAIDA DE DADOS
        System.out.println("Hello World");
        
        //TIPOS PRIMITIVOS
        int inteiro = 2;
        float decimal = 3.4f;
        double decimalMaior = 24.2;
        char caracter = 'A';
        boolean booleano = true;
        String texto = "Um texto";

        //ARRAYS
        String nomes [] = {"João","Maria","Pedro"};
        System.out.println(nomes[0]);

        int [] numeros = new int[100];
        numeros[99] = 12;
        System.out.println(numeros[99]);
        
        //MATRIZ
        String [][] matriz = new String[3][3]; 

        // TYPE CASTING
        int valorEmInteiro = 10;
        String valorString = String.valueOf(valorEmInteiro); //INTEIRO PARA STRING
        System.out.println(valorString);
        valorEmInteiro = Integer.parseInt(valorString); //STRING PARA INTEIRO
        System.out.println(valorEmInteiro);

        double valorDecimal = 11.2;
        int valorInteiro = (int) valorDecimal;
        System.out.println(valorInteiro);

    }
}
