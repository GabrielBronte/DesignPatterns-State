public class FighterStateReadyToFight implements FighterState{

    private FighterStateReadyToFight() {};
    private static FighterStateReadyToFight instance = new FighterStateReadyToFight();
    public static FighterStateReadyToFight getInstance(){
        return instance;
    }

    public String getState(){
        return "Lutador pronto para lutar";
    }

    public String signedFightContract(Fighter fighter){
        return "Lutador nao pode assinar contrato";
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