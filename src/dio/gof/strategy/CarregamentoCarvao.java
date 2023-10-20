package dio.gof.strategy;

public class CarregamentoCarvao implements Carregamento{
    @Override
    public void carregar() {
        System.out.println("Carregando vagão com Carvão Mineral...");
    }
}
