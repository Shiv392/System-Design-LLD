package DesignPatterns_04.BehaviouralPattern_03.State_Pattern_05;

public class Main {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();
        player.play();
        player.play();

        player.pause();

        player.play();

        player.stop();
    }
}
