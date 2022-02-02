public interface FighterState {

    String getState();

    String signedFightContract(Fighter fighter);

    String training(Fighter fighter);

    String suspended(Fighter fighter);

    String weightCut(Fighter fighter);

    String readyToFight(Fighter fighter);

}