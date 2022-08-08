package abstractFactory.base;

public abstract class Theme {

    String authorName;
    String primaryColor;
    int lastUpdateDate;
    String name;


    public abstract ThemeComponentFactory createThemeComponentFactory();

    public abstract boolean changePrimaryColor();

}
