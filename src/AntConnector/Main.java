package AntConnector;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    /**
     * this method starts the gui
     *
     * @param primaryStage no idea what this is
     * @throws Exception general exception you need to catch this if you implement this method which intellij did for me when i made this
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        GetAnt();
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();

    }

    /**
     * This is the method that runs first in this code. all it does is start the GUI
     *
     * @param args an array of string arguments you can pass to this code when you start it, we will probubly not use this
     */
    public static void main(String[] args) {
        if (CheckForUsb.IsUsbConnected()) { //currently this is always true
            launch(args);
        } else {
            System.out.println("The usb is not connected");//This line will print its contents to the console when it is executed useful for debugging
        }
    }

    /**
     * This method is called from start because i dont want it to be static.
     * This method is used to connect to create a UsbParer Object which will
     * 1) connect to the usb
     * 2) get the information from the ant
     * 3) store said information the way that we want it to
     */
    private void GetAnt() {
        UsbParser parser = new UsbParser();
        parser.getInfo();
        Object obj = new Object();// this is nothing, an object is the most abstract thing in java, i just want the bare bones thing i am doing to not error
        parser.storeInfo(obj);
    }
}
