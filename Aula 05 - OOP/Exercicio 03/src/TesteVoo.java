package src;

public class TesteVoo {
    
    public static void main(String[] args) {
        Voo voo = new Voo("13/05/2022", 1);
        voo.setCadeiraLivre();
        voo.setOcupaCadeira(1);
        voo.setVagas();
        voo.setMostraVoo();
        voo.setOcupaCadeira(2);
        voo.setOcupaCadeira(3);
        voo.setOcupaCadeira(4);
        voo.setOcupaCadeira(5);
        voo.setOcupaCadeira(6);
        voo.setOcupaCadeira(7);
        voo.setOcupaCadeira(8);
        voo.setOcupaCadeira(9);
        voo.setOcupaCadeira(0);
        voo.setOcupaCadeira(10);
        voo.setCadeiraLivre();

    }
}
