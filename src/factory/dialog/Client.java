package factory.dialog;

import factory.dialog.dialoges.Dialog;
import factory.dialog.factory.DialogFactory;
import factory.dialog.factory.DialogType;

public class Client {
    public static void main(String[] args) {
        DialogFactory factory = new DialogFactory();

        Dialog dialog = factory.createDialog(DialogType.CONFIRMATION);
        dialog.show();
    }
}
