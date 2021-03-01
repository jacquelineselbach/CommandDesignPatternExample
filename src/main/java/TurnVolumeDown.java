public class TurnVolumeDown implements Command {

    ElectronicDevice theDevice;

    public TurnVolumeDown(ElectronicDevice newDevice) {
        theDevice = newDevice;
    }


    public void execute() {

        theDevice.volumeDown();
    }

    @Override
    public void undo() {

        theDevice.volumeUp();
    }
}