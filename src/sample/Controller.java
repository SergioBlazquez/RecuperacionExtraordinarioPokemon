package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Controller {

    Ventana2 controllerVentana2=null;

    @FXML
    Button boton1;

    @FXML
    Label label;

    @FXML
    public void onClickBoton1(){
        pasarString("Hola");
    }


    private void pasarString(String string) {

        try {
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Ventana2.fxml"));
            AnchorPane root = (AnchorPane) loader.load();
            Scene scene = new Scene(root,400,300);
            stage.setScene(scene);
            stage.show();

            Ventana2 controller = loader.getController();
            controller.pasarString(string);


            controllerVentana2 = loader.getController();
            controllerVentana2.enviarController1(this);


            Stage stage2 = new Stage();
            FXMLLoader loader2 = new FXMLLoader(getClass().getResource("Ventana3.fxml"));
            AnchorPane root2 = (AnchorPane) loader2.load();
            Scene scene2 = new Scene(root2,400,300);
            stage2.setScene(scene2);
            stage2.show();

            Ventana3 controller2 = loader2.getController();
            controller2.pasarString(string);


        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void recogerStringVentana2(String string){
        label.setText(string);
    }

}
