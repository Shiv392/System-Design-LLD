package DesignPatterns_04.BehaviouralPattern_03.State_Pattern_05;

public class MusicPlayer {
    private State_01 state;

    public MusicPlayer(){
        state = new StopState();
    }

    public void setState(State_01 _state){
        state = _state;
    }

    public void play(){
        state.play(this);
    }
    public void pause(){
        state.pause(this);
    }
    public void stop(){
        state.stop(this);
    }
}
