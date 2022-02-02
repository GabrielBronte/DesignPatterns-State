public class FighterStateSignedFightContract implements FighterState{

    private FighterStateSignedFightContract() {};
    private static FighterStateSignedFightContract instance = new FighterStateSignedFightContract();
    public static FighterStateSignedFightContract getInstance(){
        return instance;
    }

    public String getState(){
        return "Lutador com contrato de luta assinado";
    }

    public String signedFightContract(Fighter fighter){
        return "Lutador nao pode assinar contrato";
    }

    public String training(Fighter fighter){
        fighter.setState(FighterStateTraining.getInstance());
        return "Treinamento para luta iniciado";
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
        fighter.setState(FighterStateReadyToFight.getInstance());
        return "Lutador pronto para lutar iniciado";
    }
}