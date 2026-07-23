package DesignPatterns_04.BehaviouralPattern_03.Command_Pattern_04;

public class TurnOnCommand_03 implements Command_01{
    private TV_02 tv;

    public TurnOnCommand_03(TV_02 _tv){
        tv = _tv;
    }

    @Override
    public void execute(){
        tv.TvOn();
    }
}
