package DesignPatterns_04.CreationalPattern_01.Abstract_Factory_04.Windows;

import DesignPatterns_04.CreationalPattern_01.Abstract_Factory_04.Interfaces_01.Checkbox;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void render(){
        System.out.println("Window checkbox rendering........");
    }
}
