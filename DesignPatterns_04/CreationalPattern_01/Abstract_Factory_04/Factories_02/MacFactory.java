package DesignPatterns_04.CreationalPattern_01.Abstract_Factory_04.Factories_02;

import DesignPatterns_04.CreationalPattern_01.Abstract_Factory_04.Interfaces_01.Button;
import DesignPatterns_04.CreationalPattern_01.Abstract_Factory_04.Interfaces_01.Checkbox;
import DesignPatterns_04.CreationalPattern_01.Abstract_Factory_04.Interfaces_01.GUIFactory;
import DesignPatterns_04.CreationalPattern_01.Abstract_Factory_04.Mac.MacButton;
import DesignPatterns_04.CreationalPattern_01.Abstract_Factory_04.Mac.MacCheckbox;

public class MacFactory implements GUIFactory {
    @Override
    public Button createButton(){
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox(){
        return new MacCheckbox();
    }
}
