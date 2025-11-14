package DesignPattern.factory.example2;

public class Flutter {
    public void setTheme() {
        System.out.println("Flutter Theme is set.");
    }

    public void setRefreshRate() {
        System.out.println("Flutter Refresh Rate is set.");
    }

    public UIFactory createUIFactory(String platform) {
        return UIFactoryFactory.getUIFactory(platform);
    }
}
