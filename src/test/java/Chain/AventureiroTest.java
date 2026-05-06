package Chain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AventureiroTest {

    @Test
    void deveRetornarAventureiroNovatoParaMissaoRankD() {
        Aventureiro heroi = new HeroiLendario(null);
        Aventureiro elite = new AventureiroElite(heroi);
        Aventureiro veterano = new AventureiroVeterano(elite);
        Aventureiro novato = new AventureiroNovato(veterano);

        Missao missao = new Missao(TipoMissaoRankD.getTipoMissaoRankD());

        assertEquals("Aventureiro Novato", novato.aceitarMissao(missao));
    }

    @Test
    void deveRetornarAventureiroVeteranoParaMissaoRankC() {
        Aventureiro heroi = new HeroiLendario(null);
        Aventureiro elite = new AventureiroElite(heroi);
        Aventureiro veterano = new AventureiroVeterano(elite);
        Aventureiro novato = new AventureiroNovato(veterano);

        Missao missao = new Missao(TipoMissaoRankC.getTipoMissaoRankC());

        assertEquals("Aventureiro Veterano", novato.aceitarMissao(missao));
    }

    @Test
    void deveRetornarAventureiroVeteranoParaMissaoRankB() {
        Aventureiro heroi = new HeroiLendario(null);
        Aventureiro elite = new AventureiroElite(heroi);
        Aventureiro veterano = new AventureiroVeterano(elite);
        Aventureiro novato = new AventureiroNovato(veterano);

        Missao missao = new Missao(TipoMissaoRankB.getTipoMissaoRankB());

        assertEquals("Aventureiro Veterano", novato.aceitarMissao(missao));
    }

    @Test
    void deveRetornarAventureiroEliteParaMissaoRankA() {
        Aventureiro heroi = new HeroiLendario(null);
        Aventureiro elite = new AventureiroElite(heroi);
        Aventureiro veterano = new AventureiroVeterano(elite);
        Aventureiro novato = new AventureiroNovato(veterano);

        Missao missao = new Missao(TipoMissaoRankA.getTipoMissaoRankA());

        assertEquals("Aventureiro de Elite", novato.aceitarMissao(missao));
    }

    @Test
    void deveRetornarHeroiLendarioParaMissaoRankS() {
        Aventureiro heroi = new HeroiLendario(null);
        Aventureiro elite = new AventureiroElite(heroi);
        Aventureiro veterano = new AventureiroVeterano(elite);
        Aventureiro novato = new AventureiroNovato(veterano);

        Missao missao = new Missao(TipoMissaoRankS.getTipoMissaoRankS());

        assertEquals("Herói Lendário", novato.aceitarMissao(missao));
    }
}