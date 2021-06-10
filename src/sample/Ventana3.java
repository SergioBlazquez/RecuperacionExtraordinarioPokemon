package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Ventana3 {
    @FXML
    Label label1;


    public void pasarString(String string){

        label1.setText(string);
    }
}
