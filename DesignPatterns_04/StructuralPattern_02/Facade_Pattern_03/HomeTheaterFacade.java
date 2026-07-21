package DesignPatterns_04.StructuralPattern_02.Facade_Pattern_03;

public class HomeTheaterFacade {
        private DVDPlayer dvd;
    private Projector projector;
    private Speaker speaker;
    private Lights lights;

    HomeTheaterFacade(){
        dvd = new DVDPlayer();
        projector = new Projector();
        speaker = new Speaker();
        lights = new Lights();
    }

    void watchMovie(){
        lights.off();
        projector.on();
        speaker.on();
        speaker.setVolume();
        dvd.on();
        dvd.play();
    }
}
