package AntConnector;

public class CheckForUsb {
    /**
     * This whole class will be checking that we actually have the usb device that we want connected
     *
     * @return true if the usb device we want is connected false if it is not
     * This is static because we want to be able to access it without creating a checkforUsb object.
     */
    protected static Boolean IsUsbConnected() {
        if (true) {
            return true;
            //todo change the if block to check for the connected usb device
        }
        return false;
    }
}
