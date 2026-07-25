package DesignPatterns_04.BehaviouralPattern_03.State_Pattern_05;

public class StopState implements State_01 {
    @Override
    public void play(MusicPlayer musicPlayer){
        System.out.println("Start........");
        musicPlayer.setState(new PlayingState());
    }

    @Override
    public void pause(MusicPlayer musicPlayer){
        System.out.println("Cant' paused.......");
    }

    @Override
    public void stop(MusicPlayer musicPlayer){
        System.out.println("Already stopped");
    }
}
