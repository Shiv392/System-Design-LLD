package DesignPatterns_04.CreationalPattern_01.Abstract_Factory_04.Factories_02;

import DesignPatterns_04.CreationalPattern_01.Abstract_Factory_04.Interfaces_01.Button;
import DesignPatterns_04.CreationalPattern_01.Abstract_Factory_04.Interfaces_01.Checkbox;
import DesignPatterns_04.CreationalPattern_01.Abstract_Factory_04.Interfaces_01.GUIFactory;
import DesignPatterns_04.CreationalPattern_01.Abstract_Factory_04.Windows.WindowButton;
import DesignPatterns_04.CreationalPattern_01.Abstract_Factory_04.Windows.WindowsCheckbox;

public class WindowFactory implements GUIFactory {
    @Override
    public Button createButton(){
        return new WindowButton();
    }

    @Override
    public Checkbox createCheckbox(){
        return new WindowsCheckbox();
    }
}
