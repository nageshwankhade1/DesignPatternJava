package abstractFactory;

import abstractFactory.base.Theme;
import abstractFactory.base.ThemeComponentFactory;
import abstractFactory.base.ThemeFactory;

public class Client {
    private static final String THEME="ios";
    public static void main(String[] args) {
        Theme theme = ThemeFactory.createTheme(THEME);
        ThemeComponentFactory themeComponentFactory = theme.createThemeComponentFactory();
        themeComponentFactory.createButton();
        themeComponentFactory.createDropDown();
        themeComponentFactory.createMenu();

    }
}
