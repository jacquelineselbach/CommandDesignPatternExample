import java.util.ArrayList;
import java.util.List;

public class PlayWithRemote {


    public static void main(String[] args) {

        // returns a Television = see in TVRemote.java
        ElectronicDevice newDevice = TVRemote.getDevice();

        TurnTVOn onCommand = new TurnTVOn(newDevice);
        DeviceButton onPressed = new DeviceButton(onCommand);

        onPressed.press(); // calls the on method on new devices

        //--------------------------------------------------------

        TurnTVOff offCommand = new TurnTVOff(newDevice);

        onPressed = new DeviceButton(offCommand);

        onPressed.press(); // calls the off method on new devices

        //--------------------------------------------------------

        TurnVolumeUp upCommand = new TurnVolumeUp(newDevice);

        onPressed = new DeviceButton(upCommand);

        onPressed.press();
        onPressed.press();

        //--------------------------------------------------------

        TurnVolumeDown downCommand = new TurnVolumeDown(newDevice);

        onPressed = new DeviceButton(downCommand);

        onPressed.press();
        onPressed.press();

        //--------------------------------------------------------

        Television tv = new Television();
        Radio radio = new Radio();

        List<ElectronicDevice> allDevices = new ArrayList<ElectronicDevice>();

        allDevices.add(tv);
        allDevices.add(radio);

        TurnItAllOff turnOff = new TurnItAllOff(allDevices);
        DeviceButton turnAllOff = new DeviceButton(turnOff);

        turnAllOff.press(); // press the actual button

        //--------------------------------------------------------

        turnAllOff.pressUndo(); // undoes the last command



    }
}
