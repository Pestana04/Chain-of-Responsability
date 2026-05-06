package Chain;

public class TipoMissaoRankA implements TipoMissao {

    private static TipoMissaoRankA tipoMissaoRankA = new TipoMissaoRankA();

    private TipoMissaoRankA() {}

    public static TipoMissaoRankA getTipoMissaoRankA() {
        return tipoMissaoRankA;
    }
}