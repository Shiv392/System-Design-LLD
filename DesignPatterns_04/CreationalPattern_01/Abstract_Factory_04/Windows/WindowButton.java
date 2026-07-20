package DesignPatterns_04.CreationalPattern_01.Abstract_Factory_04.Windows;

import DesignPatterns_04.CreationalPattern_01.Abstract_Factory_04.Interfaces_01.Button;

public class WindowButton implements Button {
    @Override
    public void render(){
        System.out.println("Window button rendering..........");
    }
}
