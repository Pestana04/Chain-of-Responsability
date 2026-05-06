package Chain;

public class TipoMissaoRankC implements TipoMissao {

    private static TipoMissaoRankC tipoMissaoRankC = new TipoMissaoRankC();

    private TipoMissaoRankC() {}

    public static TipoMissaoRankC getTipoMissaoRankC() {
        return tipoMissaoRankC;
    }
}