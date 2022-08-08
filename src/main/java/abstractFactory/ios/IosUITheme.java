package abstractFactory.ios;

import abstractFactory.base.*;

public class IosUITheme extends Theme {


    @Override
    public ThemeComponentFactory createThemeComponentFactory() {
        return new IosThemeComponentFactory();
    }

    @Override
    public boolean changePrimaryColor() {
        return false;
    }
}
