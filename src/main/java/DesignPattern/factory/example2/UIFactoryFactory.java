package DesignPattern.factory.example2;

public class UIFactoryFactory {
    IOSUIFactory iosFactory;
    AndroidUIFactory androidFactory;
    public static UIFactory getUIFactory(String osType) {
        if (osType.equalsIgnoreCase("iOS")) {
            return new IOSUIFactory();
        } else if (osType.equalsIgnoreCase("Android")) {
            return new AndroidUIFactory();
        }
        throw new IllegalArgumentException("Unknown OS Type");
    }
}
