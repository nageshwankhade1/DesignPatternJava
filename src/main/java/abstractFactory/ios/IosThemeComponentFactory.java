package abstractFactory.ios;

import abstractFactory.base.Button;
import abstractFactory.base.DropDown;
import abstractFactory.base.Menu;
import abstractFactory.base.ThemeComponentFactory;

public class IosThemeComponentFactory implements ThemeComponentFactory {
    @Override
    public Button createButton() {
        return new IosUIButton();
    }

    @Override
    public Menu createMenu() {
        return new IosUIMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new IosUIDropDown();
    }
}
