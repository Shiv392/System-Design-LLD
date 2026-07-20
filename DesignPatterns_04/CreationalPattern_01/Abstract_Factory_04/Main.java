package DesignPatterns_04.CreationalPattern_01.Abstract_Factory_04;

import DesignPatterns_04.CreationalPattern_01.Abstract_Factory_04.Factories_02.MacFactory;
import DesignPatterns_04.CreationalPattern_01.Abstract_Factory_04.Factories_02.WindowFactory;
import DesignPatterns_04.CreationalPattern_01.Abstract_Factory_04.Interfaces_01.Button;
import DesignPatterns_04.CreationalPattern_01.Abstract_Factory_04.Interfaces_01.Checkbox;
import DesignPatterns_04.CreationalPattern_01.Abstract_Factory_04.Interfaces_01.GUIFactory;

public class Main {
    public static void main(String[] args) {
        GUIFactory windowFactory = new WindowFactory();
        Button windowButton = windowFactory.createButton();
        Checkbox windowCheckbox = windowFactory.createCheckbox();

        windowButton.render();
        windowCheckbox.render();

        GUIFactory macFactory = new MacFactory();
        Button macButton = macFactory.createButton();
        Checkbox macCheckbox = macFactory.createCheckbox();

        macButton.render();
        macCheckbox.render();
    }
}
