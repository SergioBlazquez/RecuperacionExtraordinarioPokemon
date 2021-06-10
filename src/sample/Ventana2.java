package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Ventana2 {

    private Controller controllerVentana1;

    @FXML
    Label label1;



    public void pasarString(String string){

        label1.setText(string);

    }

    public void onLabelClick(){
        pasarStringVentana2("Adios");
    }



    public void enviarController1(Controller ventana1Controller) {
        controllerVentana1 = ventana1Controller;
    }

    public void pasarStringVentana2(String string){
        controllerVentana1.recogerStringVentana2(string);
    }
}

