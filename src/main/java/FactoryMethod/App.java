package FactoryMethod;

import FactoryMethod.factory.Dialog;
import FactoryMethod.factory.HtmlDialog;
import FactoryMethod.factory.WindowsDialog;

public class App {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void configure() {
        if (System.getProperty("os.name").equals("Window 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
