package Chain;

public class AventureiroElite extends Aventureiro {

    public AventureiroElite(Aventureiro superior) {
        listaMissoes.add(TipoMissaoRankA.getTipoMissaoRankA());
        setAventureiroSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Aventureiro de Elite";
    }
}