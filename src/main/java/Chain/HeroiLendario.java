package Chain;

public class HeroiLendario extends Aventureiro {

    public HeroiLendario(Aventureiro superior) {
        listaMissoes.add(TipoMissaoRankS.getTipoMissaoRankS());
        setAventureiroSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Herói Lendário";
    }
}