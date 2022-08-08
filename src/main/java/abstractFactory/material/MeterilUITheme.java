package abstractFactory.material;

import abstractFactory.base.*;

public class MeterilUITheme extends Theme {


    @Override
    public ThemeComponentFactory createThemeComponentFactory() {
        return new MaterialThemeComponentFactory();
    }

    @Override
    public boolean changePrimaryColor() {
        return false;
    }
}
