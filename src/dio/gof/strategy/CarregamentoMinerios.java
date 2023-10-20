package dio.gof.strategy;

public class CarregamentoMinerios implements Carregamento{

    @Override
    public void carregar() {
        System.out.println("Carregando vagão com Minérios...");
    }
    
}
