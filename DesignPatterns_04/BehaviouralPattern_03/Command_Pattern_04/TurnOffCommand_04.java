package DesignPatterns_04.BehaviouralPattern_03.Command_Pattern_04;

public class TurnOffCommand_04 implements Command_01{
    private TV_02 tv;

    TurnOffCommand_04(TV_02 _tv){
        tv = _tv;
    }

    @Override
    public void execute(){
        tv.TvOf();
    }
}
