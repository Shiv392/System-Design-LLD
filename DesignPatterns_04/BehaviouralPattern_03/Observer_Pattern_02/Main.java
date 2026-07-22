package DesignPatterns_04.BehaviouralPattern_03.Observer_Pattern_02;

import DesignPatterns_04.BehaviouralPattern_03.Observer_Pattern_02.Interfaces_01.Subscriber;

public class Main {
    public static void main(String[] args) {
        YoutubeChannel_03 youtubeChannel = new YoutubeChannel_03();
        Subscriber s1=new User_02("Shiv");
        Subscriber s2=new User_02("Rahul");
        Subscriber s3=new User_02("Aman");

        youtubeChannel.Subscribe(s1);
        youtubeChannel.Subscribe(s2);
        youtubeChannel.Subscribe(s3);

        youtubeChannel.uploadVideo("Dooms Days......");
    }
}
