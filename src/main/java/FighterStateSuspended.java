public class FighterStateSuspended implements FighterState{
    private FighterStateSuspended() {};
    private static FighterStateSuspended instance = new FighterStateSuspended();
    public static FighterStateSuspended getInstance(){
        return instance;
    }

    public String getState(){
        return "Lutador suspenso";
    }

    public String signedFightContract(Fighter fighter){
        fighter.setState(FighterStateTraining.getInstance());
        return "Lutador assinou o novo contrato de luta";
    }

    public String training(Fighter fighter){
        return "Lutador não pode iniciar treinamento";
    }

    public String suspended(Fighter fighter){
        return "Lutador não pode ser suspenso";
    }

    public String weightCut(Fighter fighter){
        return "Lutador não pode iniciar corte de peso";
    }

    public String readyToFight(Fighter fighter){
        return "Lutador não pode iniciar pronto para lutar";
    }
}