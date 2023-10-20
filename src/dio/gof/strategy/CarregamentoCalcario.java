package dio.gof.strategy;

public class CarregamentoCalcario implements Carregamento{
    @Override
    public void carregar(){
        System.out.println("Carregando vagão com Calcário...");
    }
}