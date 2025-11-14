package DesignPattern.factory.example2;

public class IOSUIFactory implements UIFactory {
    public Button createButton() {
        return new IOSButton();
    }

    public TextBox createTextBox() {
        return new IOSTextBox();
    }
}
