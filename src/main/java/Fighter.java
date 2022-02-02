public class Fighter {
    private String name;
    private FighterState state;

    public Fighter(){
        this.state = FighterStateSignedFightContract.getInstance();
    }

    public String getNameState(){
        return state.getState();
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public FighterState getState(){
        return state;
    }

    public void setState(FighterState state){
        this.state = state;
    }

    public String signedFightContract(){
        return state.signedFightContract(this);
    }

    public String training(){
        return state.training(this);
    }

    public String suspended(){
        return state.suspended(this);
    }

    public String weightCut(){
        return state.weightCut(this);
    }

    public String readyToFight(){
        return state.readyToFight(this);
    }
}