public class TurnVolumeUp implements Command {

    ElectronicDevice theDevice;

    public TurnVolumeUp(ElectronicDevice newDevice) {
        theDevice = newDevice;
    }


    public void execute() {

        theDevice.volumeUp();
    }

    @Override
    public void undo() {

        theDevice.volumeDown();

    }
}