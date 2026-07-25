package DesignPatterns_04.BehaviouralPattern_03.State_Pattern_05;

public class PlayingState implements State_01 {
    @Override
    public void play(MusicPlayer musicPlayer){
        System.out.println("Already playing.........");
    }

    @Override
    public void pause(MusicPlayer musicPlayer){
        System.out.println("Paused.....");
        musicPlayer.setState(new PauseState());
    }

    @Override
    public void stop(MusicPlayer musicPlayer){
        System.out.println("Stop......");
        musicPlayer.setState(new StopState());
    }
}
