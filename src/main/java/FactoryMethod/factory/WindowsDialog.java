package FactoryMethod.factory;

import FactoryMethod.buttons.Button;
import FactoryMethod.buttons.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
