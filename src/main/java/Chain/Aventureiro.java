package Chain;

import java.util.ArrayList;

public abstract class Aventureiro {

    protected ArrayList<TipoMissao> listaMissoes = new ArrayList<>();
    private Aventureiro aventureiroSuperior;

    public Aventureiro getAventureiroSuperior() {
        return aventureiroSuperior;
    }

    public void setAventureiroSuperior(Aventureiro aventureiroSuperior) {
        this.aventureiroSuperior = aventureiroSuperior;
    }

    public abstract String getDescricaoCargo();

    public String aceitarMissao(Missao missao) {
        if (listaMissoes.contains(missao.getTipoMissao())) {
            return getDescricaoCargo();
        } else {
            if (aventureiroSuperior != null) {
                return aventureiroSuperior.aceitarMissao(missao);
            } else {
                return "Missão sem aventureiro disponível";
            }
        }
    }
}