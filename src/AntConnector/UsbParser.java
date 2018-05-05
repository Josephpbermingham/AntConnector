package AntConnector;

class UsbParser {
    /**
     * This is the constructor for this method it will connect you to the usb device and allow you to parse through it  with its other methods
     */
    public UsbParser() {
        //todo create constructor
        //the constructor will connect to the usb
        if (connectToUsb()) {
            //todo bind this to a class variable
        }
    }

    /**
     * This method will be called by the constructor and connect you to the usb device
     *
     * @return tru if you have an established connection false if you can not establish the connection
     * im not sure how we will connect and hold said connection yet
     * todo figure that out ^
     */
    private boolean connectToUsb() {
        //todo this will establish our usb connection
        return false;
    }

    /**
     * This method will pull information off of the connection that this object has. (and might store it)(we might also need to parse it so that it isn't in binary)
     */
    void getInfo() {
        //todo the method description
    }

    /**
     * This is a method we might user to hold information
     *
     * @param TempHolder this is a placeholder for a more specific object when we decide how we want to store stuff
     *                   and if we want to store in this method or when we get it
     */
    void storeInfo(Object TempHolder) {
        //before we use this we need to decide how we want to store stuff
        //todo decide how we want to store stuff
    }
}
