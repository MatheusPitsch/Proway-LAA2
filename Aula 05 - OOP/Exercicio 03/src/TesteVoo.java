package src;

public class TesteVoo {
    
    public static void main(String[] args) {
        Voo voo = new Voo("13/05/2022", 1);
        voo.setCadeiraLivre();
        voo.setOcupaCadeira(1);
        voo.setVagas();
        voo.setMostraVoo();

    }
}
