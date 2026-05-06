package Chain;

public class AventureiroNovato extends Aventureiro {

    public AventureiroNovato(Aventureiro superior) {
        listaMissoes.add(TipoMissaoRankD.getTipoMissaoRankD());
        setAventureiroSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Aventureiro Novato";
    }
}