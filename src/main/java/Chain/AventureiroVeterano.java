package Chain;

public class AventureiroVeterano extends Aventureiro {

    public AventureiroVeterano(Aventureiro superior) {
        listaMissoes.add(TipoMissaoRankC.getTipoMissaoRankC());
        listaMissoes.add(TipoMissaoRankB.getTipoMissaoRankB());
        setAventureiroSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Aventureiro Veterano";
    }
}