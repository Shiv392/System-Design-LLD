package DesignPatterns_04.CreationalPattern_01.Abstract_Factory_04.Mac;

import DesignPatterns_04.CreationalPattern_01.Abstract_Factory_04.Interfaces_01.Checkbox;

public class MacCheckbox implements Checkbox {
    @Override
    public void render(){
        System.out.println("Mac Checking Rendering........");
    }
}
