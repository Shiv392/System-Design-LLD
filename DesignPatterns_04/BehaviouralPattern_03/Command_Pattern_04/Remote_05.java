package DesignPatterns_04.BehaviouralPattern_03.Command_Pattern_04;

public class Remote_05 {
    private Command_01 command;

    public void setCommand(Command_01 _command){
        command = _command;
    }
    public void pressBtn(){
        command.execute();
    }
}
