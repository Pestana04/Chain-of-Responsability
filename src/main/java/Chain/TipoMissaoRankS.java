package Chain;

public class TipoMissaoRankS implements TipoMissao {

    private static TipoMissaoRankS tipoMissaoRankS = new TipoMissaoRankS();

    private TipoMissaoRankS() {}

    public static TipoMissaoRankS getTipoMissaoRankS() {
        return tipoMissaoRankS;
    }
}