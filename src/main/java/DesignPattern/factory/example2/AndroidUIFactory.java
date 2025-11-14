package DesignPattern.factory.example2;

public class AndroidUIFactory implements UIFactory {
    public Button createButton() {
        return new AndroidButton();
    }

    public TextBox createTextBox() {
        return new AndroidTextBox();
    }
}
