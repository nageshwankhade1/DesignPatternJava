package abstractFactory.base;

import abstractFactory.ios.IosUITheme;
import abstractFactory.material.MeterilUITheme;

public class ThemeFactory {

    public static Theme createTheme(String themeName){
        if(themeName.equals("ios")){
            return new IosUITheme();
        }else{
            return new MeterilUITheme();
        }
    }
}
