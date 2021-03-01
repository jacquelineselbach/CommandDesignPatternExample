public class DeviceButton {

    /* INVOKER = The Invoker (AKA SENDER) Device Button knows nothing, it doesn't know what Device or Command is being used */

    Command theCommand;

    public DeviceButton(Command newCommand) {

        theCommand = newCommand;

    }

    public void press() {

        theCommand.execute();

    }

    public void pressUndo() {

        theCommand.undo();

    }
}
