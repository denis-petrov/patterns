package FactoryMethod.factory;

import FactoryMethod.buttons.Button;
import FactoryMethod.buttons.HtmlButton;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
