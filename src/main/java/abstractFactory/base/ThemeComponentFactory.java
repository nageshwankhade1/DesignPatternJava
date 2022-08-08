package abstractFactory.base;

public interface ThemeComponentFactory {
    Button createButton();
    Menu createMenu();
    DropDown createDropDown();
}
