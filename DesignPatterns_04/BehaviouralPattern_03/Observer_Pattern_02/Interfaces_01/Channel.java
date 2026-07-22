package DesignPatterns_04.BehaviouralPattern_03.Observer_Pattern_02.Interfaces_01;

public interface Channel {
    void Subscribe(Subscriber subscriber);
    void Unsubscribe(Subscriber subscriber);
    void NotifySubscriber();
}
