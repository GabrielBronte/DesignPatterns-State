public class FighterStateWeightCut implements FighterState{
    private FighterStateWeightCut() {};
    private static FighterStateWeightCut instance = new FighterStateWeightCut();
    public static FighterStateWeightCut getInstance(){
        return instance;
    }

    public String getState(){
        return "Lutador perdendo peso para luta";
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
        return "Lutador não pode iniciar corte de peso";
    }

    public String readyToFight(Fighter fighter){
        fighter.setState(FighterStateReadyToFight.getInstance());
        return "Lutador pronto para lutar iniciado";
    }
}