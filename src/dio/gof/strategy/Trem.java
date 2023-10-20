package dio.gof.strategy;

public class Trem {
    private Carregamento carregamento;

    public void setCarregamento(Carregamento carregamento){
        this.carregamento = carregamento;
    }

    public void carregar(){
        carregamento.carregar();
    }
}
