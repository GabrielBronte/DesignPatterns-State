public class FighterStateTraining implements FighterState{
    private FighterStateTraining() {};
    private static FighterStateTraining instance = new FighterStateTraining();
    public static FighterStateTraining getInstance(){
        return instance;
    }

    public String getState(){
        return "Lutador treinando para lutar";
    }

    public String signedFightContract(Fighter fighter){
        return "Lutador nao pode assinar contrato";
    }

    public String training(Fighter fighter){
        return "Lutador não pode iniciar treinamento";
    }

    public String suspended(Fighter fighter){
        fighter.setState(FighterStateSuspended.getInstance());
        return "Suspensão do lutador ativada";
    }

    public String weightCut(Fighter fighter){
        fighter.setState(FighterStateWeightCut.getInstance());
        return "Corte de peso iniciado";
    }
    public String readyToFight(Fighter fighter){
        return "Lutador não pode iniciar pronto para lutar";
    }
}