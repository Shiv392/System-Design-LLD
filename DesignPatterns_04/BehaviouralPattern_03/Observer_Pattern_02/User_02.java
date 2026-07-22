package DesignPatterns_04.BehaviouralPattern_03.Observer_Pattern_02;

import DesignPatterns_04.BehaviouralPattern_03.Observer_Pattern_02.Interfaces_01.Subscriber;

public class User_02 implements Subscriber {
    private String name;

    public User_02(String name){
        this.name = name;
    }

    @Override
    public void update(String video){
        System.out.println(name+" "+ "has recieved video "+video);
    }
}
