package Chain;

public class TipoMissaoRankD implements TipoMissao {

    private static TipoMissaoRankD tipoMissaoRankD = new TipoMissaoRankD();

    private TipoMissaoRankD() {}

    public static TipoMissaoRankD getTipoMissaoRankD() {
        return tipoMissaoRankD;
    }
}