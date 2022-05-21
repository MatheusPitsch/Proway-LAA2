package src;

public class Voo {

    private String cadeira;
    private int numeroVoo;
    private String data;
    private String[][] voo = new String[100][1];

    public Voo(String data, int numeroVoo) {
        this.setData(data);
        this.setNumeroVoo(numeroVoo);
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getCadeira() {
        return cadeira;
    }

    public void setCadeira(String cadeira) {
        this.cadeira = cadeira;
    }

    public int getNumeroVoo() {
        return numeroVoo;
    }

    public void setNumeroVoo(int numeroVoo) {
        this.numeroVoo = numeroVoo;
    }

    public void setCadeiraLivre() {
        for (int i = 0; i < voo.length; i++) {
            if (voo[i][0] == null) {
                System.out.printf("A proxima cadeira livre é %d. \n", i);
                break;
            }
        }
    }

    public void setVerificaCadeira(int posicao) {
        if (voo[posicao][0] == null) {
            voo[posicao][0] = "Ocupado";
            System.out.printf("Cadeira %d ocupada com sucesso. \n", posicao);
        } else {
            System.out.println("posição se encontra ocupada");
        }
    }

    

    public void setOcupaCadeira(int posicao) {
        setVerificaCadeira(posicao);
        
    }

    public void setVagas() {
        int vazio = 0;
        for (int i = 0; i < voo.length; i++) {
            if (voo[i][0] == null) {
                vazio++;
            }
        }
        System.out.printf("Tem %d cadeiras vazias. \n", vazio);
    }

    public void setMostraVoo() {
        for (int i = 0; i < voo.length; i++) {
            System.out.println(voo[i][0]);
        }
    }
}
