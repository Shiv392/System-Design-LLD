package DesignPatterns_04.BehaviouralPattern_03.Command_Pattern_04;

public class Main {
    public static void main(String[] args) {
        TV_02 tv = new TV_02();

        Command_01 on = new TurnOnCommand_03(tv);
        Command_01 off = new TurnOffCommand_04(tv);

        Remote_05 remote = new Remote_05();
        remote.setCommand(on);
        remote.pressBtn();

        remote.setCommand(off);
        remote.pressBtn();
    }
}
