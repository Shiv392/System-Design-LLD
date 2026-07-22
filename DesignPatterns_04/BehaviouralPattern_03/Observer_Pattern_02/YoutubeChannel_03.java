package DesignPatterns_04.BehaviouralPattern_03.Observer_Pattern_02;

import java.util.ArrayList;
import java.util.List;

import DesignPatterns_04.BehaviouralPattern_03.Observer_Pattern_02.Interfaces_01.Subscriber;
import DesignPatterns_04.BehaviouralPattern_03.Observer_Pattern_02.Interfaces_01.Channel;

public class YoutubeChannel_03 implements Channel {
    private List<Subscriber>subscribers = new ArrayList<>();
    private String video;

    @Override
    public void Subscribe(Subscriber s){ //add subscriber
        subscribers.add(s);
    }

    @Override
    public void Unsubscribe(Subscriber s){ //remove subscriber
        subscribers.remove(s);
    }

    @Override
    public void NotifySubscriber(){ //notifiy all subscriber
        for(Subscriber s : subscribers){
            s.update(video);
        }
    }

    public void uploadVideo(String video){
        this.video = video;
        NotifySubscriber();
    }
}
