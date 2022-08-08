package abstractFactory.material;

import abstractFactory.base.Button;
import abstractFactory.base.DropDown;
import abstractFactory.base.Menu;
import abstractFactory.base.ThemeComponentFactory;

public class MaterialThemeComponentFactory implements ThemeComponentFactory {
    @Override
    public Button createButton() {
        return new MatUIButton();
    }

    @Override
    public Menu createMenu() {
        return new MatUIMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new MatUIDropDown();
    }
}
