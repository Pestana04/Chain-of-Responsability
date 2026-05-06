package Chain;

public class TipoMissaoRankB implements TipoMissao {

    private static TipoMissaoRankB tipoMissaoRankB = new TipoMissaoRankB();

    private TipoMissaoRankB() {}

    public static TipoMissaoRankB getTipoMissaoRankB() {
        return tipoMissaoRankB;
    }
}