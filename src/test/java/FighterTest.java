import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FighterTest {
    Fighter fighter;

    @BeforeEach
    public void setUp(){
        fighter = new Fighter();
    }

    @Test
    public void deveRetornarNaoPodeAssinarContratoEstadoContratoAssinado(){
        fighter.setState(FighterStateSignedFightContract.getInstance());
        assertEquals("Lutador nao pode assinar contrato", fighter.signedFightContract());
    }

    @Test
    public void deveRetornarTreinamentoIniciadoEstadoContratoAssinado(){
        fighter.setState(FighterStateSignedFightContract.getInstance());
        assertEquals("Treinamento para luta iniciado", fighter.training());
    }

    @Test
    public void deveRetornarSuspensaoAtivadaEstadoContratoAssinado(){
        fighter.setState(FighterStateSignedFightContract.getInstance());
        assertEquals("Suspensão do lutador ativada", fighter.suspended());
    }

    @Test
    public void deveRetornarCortedePesoIniciadoEstadoContratoAssinado(){
        fighter.setState(FighterStateSignedFightContract.getInstance());
        assertEquals("Corte de peso iniciado", fighter.weightCut());
    }

    @Test
    public void deveRetornarProntopLutarIniciadoEstadoContratoAssinado(){
        fighter.setState(FighterStateSignedFightContract.getInstance());
        assertEquals("Lutador pronto para lutar iniciado", fighter.readyToFight());
    }



    @Test
    public void deveRetornarNaoPodeAssinarContratoEstadoTreinando(){
        fighter.setState(FighterStateTraining.getInstance());
        assertEquals("Lutador nao pode assinar contrato", fighter.signedFightContract());
    }

    @Test
    public void deveRetornarNaoPodeIniciarTreinamentoEstadoTreinando(){
        fighter.setState(FighterStateTraining.getInstance());
        assertEquals("Lutador não pode iniciar treinamento", fighter.training());
    }

    @Test
    public void deveRetornarSuspensaoAtivadaEstadoTreinando(){
        fighter.setState(FighterStateTraining.getInstance());
        assertEquals("Suspensão do lutador ativada", fighter.suspended());
    }

    @Test
    public void deveRetornarCortedePesoIniciadoEstadoTreinando(){
        fighter.setState(FighterStateTraining.getInstance());
        assertEquals("Corte de peso iniciado", fighter.weightCut());
    }

    @Test
    public void deveRetornarNaoEstaProntopLutarEstadoTreinando(){
        fighter.setState(FighterStateTraining.getInstance());
        assertEquals("Lutador não pode iniciar pronto para lutar", fighter.readyToFight());
    }



    @Test
    public void deveRetornarNaoPodeAssinarContratoEstadoCortedePeso(){
        fighter.setState(FighterStateWeightCut.getInstance());
        assertEquals("Lutador nao pode assinar contrato", fighter.signedFightContract());
    }

    @Test
    public void deveRetornarNaoPodeIniciarTreinamentoEstadoCortedePeso(){
        fighter.setState(FighterStateWeightCut.getInstance());
        assertEquals("Lutador não pode iniciar treinamento", fighter.training());
    }

    @Test
    public void deveRetornarSuspensaoAtivadaEstadoCortedePeso(){
        fighter.setState(FighterStateWeightCut.getInstance());
        assertEquals("Suspensão do lutador ativada", fighter.suspended());
    }

    @Test
    public void deveRetornarNaoPodeIniciarCortedePesoEstadoCortedePeso(){
        fighter.setState(FighterStateWeightCut.getInstance());
        assertEquals("Lutador não pode iniciar corte de peso", fighter.weightCut());
    }

    @Test
    public void deveRetornarProntopLutarEstadoCortedePeso(){
        fighter.setState(FighterStateWeightCut.getInstance());
        assertEquals("Lutador pronto para lutar iniciado", fighter.readyToFight());
    }



    @Test
    public void deveRetornarNaoPodeAssinarContratoEstadoSuspenso(){
        fighter.setState(FighterStateSuspended.getInstance());
        assertEquals("Lutador assinou o novo contrato de luta", fighter.signedFightContract());
    }

    @Test
    public void deveRetornarNaoPodeIniciarTreinamentoEstadoSuspenso(){
        fighter.setState(FighterStateSuspended.getInstance());
        assertEquals("Lutador não pode iniciar treinamento", fighter.training());
    }

    @Test
    public void deveRetornarNaoPodeSerSuspensoEstadoSuspenso(){
        fighter.setState(FighterStateSuspended.getInstance());
        assertEquals("Lutador não pode ser suspenso", fighter.suspended());
    }

    @Test
    public void deveRetornarNaoPodeIniciarCortedePesoEstadoSuspenso(){
        fighter.setState(FighterStateSuspended.getInstance());
        assertEquals("Lutador não pode iniciar corte de peso", fighter.weightCut());
    }

    @Test
    public void deveRetornarNaoEstaProntopLutarEstadoSuspenso(){
        fighter.setState(FighterStateSuspended.getInstance());
        assertEquals("Lutador não pode iniciar pronto para lutar", fighter.readyToFight());
    }



    @Test
    public void deveRetornarNaoPodeAssinarContratoEstadoProntoPLutar(){
        fighter.setState(FighterStateReadyToFight.getInstance());
        assertEquals("Lutador nao pode assinar contrato", fighter.signedFightContract());
    }

    @Test
    public void deveRetornarNaoPodeIniciarTreinamentoEstadoProntoPLutar(){
        fighter.setState(FighterStateReadyToFight.getInstance());
        assertEquals("Lutador não pode iniciar treinamento", fighter.training());
    }

    @Test
    public void deveRetornarNaoPodeSerSuspensoEstadoProntoPLutar(){
        fighter.setState(FighterStateReadyToFight.getInstance());
        assertEquals("Lutador não pode ser suspenso", fighter.suspended());
    }

    @Test
    public void deveRetornarNaoPodeIniciarCortedePesoEstadoProntoPLutar(){
        fighter.setState(FighterStateReadyToFight.getInstance());
        assertEquals("Lutador não pode iniciar corte de peso", fighter.weightCut());
    }

    @Test
    public void deveRetornarNaoPodeIniciarProntopLutarEstadoProntoPLutar(){
        fighter.setState(FighterStateReadyToFight.getInstance());
        assertEquals("Lutador não pode iniciar pronto para lutar", fighter.readyToFight());
    }

}