import dio.gof.strategy.Carregamento;
import dio.gof.strategy.CarregamentoCalcario;
import dio.gof.strategy.CarregamentoCarvao;
import dio.gof.strategy.CarregamentoMinerios;
import dio.gof.strategy.Trem;

public class App {
    public static void main(String[] args) throws Exception {
        //Strategy
        Carregamento carregamentoCalcario = new CarregamentoCalcario();
        Carregamento carregamentoCarvao = new CarregamentoCarvao();
        Carregamento carregamentoMinerios = new CarregamentoMinerios();

        Trem trem = new Trem();
        trem.setCarregamento(carregamentoCarvao);
        trem.carregar();
        trem.setCarregamento(carregamentoCalcario);
        trem.carregar();
        trem.carregar();
        trem.setCarregamento(carregamentoMinerios);
        trem.carregar();
        trem.carregar();
        trem.carregar();
    }
}
