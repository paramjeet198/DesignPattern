package factory.dialog.factory;

import factory.dialog.dialoges.ConfirmationDialog;
import factory.dialog.dialoges.Dialog;
import factory.dialog.dialoges.ErrorDialog;
import factory.dialog.dialoges.InformationDialog;

public class DialogFactory {

    public Dialog createDialog(DialogType type) {
        return switch (type) {
            case INFORMATION -> new InformationDialog();
            case CONFIRMATION -> new ConfirmationDialog();
            case ERROR -> new ErrorDialog();
        };

    }
}
