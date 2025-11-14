package DesignPattern.factory.example2;

public class client {
    public static void main(String[] args) {
        Flutter f = new Flutter();
        UIFactory uiFactory = f.createUIFactory("iOS");
        Button button = uiFactory.createButton();
        button.Click();

    }
}


/*
Flutter {
    create Button() {
        if(platform == "iOS") {
            return new iOSButton();
        } else if(platform == "Android") {
            return new AndroidButton();
        }
    }
}

Flutter
setTheme()
setRefreshRate()
createUIFactory()


UIFactory
createButton --- Button
createCheckbox --- Checkbox
createDropdown --- Dropdown

 */