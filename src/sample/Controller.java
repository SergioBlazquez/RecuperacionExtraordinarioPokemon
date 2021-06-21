package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Border;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.File;
import java.util.ArrayList;

public class Controller {

    Ventana2 controllerVentana2;

    Pokemon pokemon1 = new Pokemon("Charmander",14,35,54,'f',"Intimidar","Baya Frambu",45, 35, 56, 23, 40);
    Pokemon pokemon2 = new Pokemon("Cyndaquil",10,50,65,'m',"Absorbe Fuego","Baya Zidra",42, 32, 60, 25, 42);
    Pokemon pokemon3 = new Pokemon("Torchic",13,62,70,'f',"Presion","Baya Aranja",42, 35, 31, 40, 54);
    Pokemon pokemon4 = new Pokemon("Chimchar",12,65,65,'m',"Mar Llamas","Baya Grana",51, 54, 56, 42, 51);
    Pokemon pokemon5 = new Pokemon("Tepig",11,52,54,'m',"Rastro","Baya Tamate",38, 24, 45, 41, 20);
    Pokemon pokemon6 = new Pokemon("Fennekin",14,12,60,'m',"Sequia","Baya Aslac",40, 40, 41, 20, 30);


    File file1 = new File("src/images/charmander.png");
    Image imagenCharmander = new Image(file1.toURI().toString());

    File file2 = new File("src/images/cyndaquill.png");
    Image imagenCyndaquill = new Image(file2.toURI().toString());

    File file3 = new File("src/images/torchiq.png");
    Image imagenTorchic = new Image(file3.toURI().toString());

    File file4 = new File("src/images/chimchar.png");
    Image imagenChimchar = new Image(file4.toURI().toString());

    File file5 = new File("src/images/tepig.png");
    Image imagenTepig = new Image(file5.toURI().toString());

    File file6 = new File("src/images/fennekin.png");
    Image imagenFennekin = new Image(file6.toURI().toString());

    File file7 = new File("src/images/femenino.png");
    Image imagenFemenino = new Image(file7.toURI().toString());

    File file8 = new File("src/images/masculino.png");
    Image imagenMasculino = new Image(file8.toURI().toString());

    @FXML
    public void initialize(){

        actualizarNombres();
    }

    @FXML
    Button boton1;

    @FXML
    Label label, labelNombre1, labelNombre2, labelNombre3, labelNombre4, labelNombre5, labelNombre6;
    @FXML
    AnchorPane anchorPane1, anchorPane2, anchorPane3, anchorPane4, anchorPane5, anchorPane6;

    @FXML
    public void onClickBoton1(){

        Stage stage = (Stage) boton1.getScene().getWindow();
        stage.close();
    }


    @FXML
    public void onClickAnchorPane1(){

        abrirVentana2(pokemon1, imagenCharmander,imagenFemenino);


    }

    @FXML
    public void onClickAnchorPane2(){

        abrirVentana2(pokemon2,imagenCyndaquill,imagenMasculino);


    }

    @FXML
    public void onClickAnchorPane3(){

        abrirVentana2(pokemon3,imagenTorchic,imagenFemenino);


    }

    @FXML
    public void onClickAnchorPane4(){

        abrirVentana2(pokemon4,imagenChimchar,imagenMasculino);


    }

    @FXML
    public void onClickAnchorPane5(){

        abrirVentana2(pokemon5,imagenTepig,imagenMasculino);


    }

    @FXML
    public void onClickAnchorPane6(){

        abrirVentana2(pokemon6,imagenFennekin,imagenFemenino);


    }



    public void recogerStringVentana2(String string){
        label.setText(string);
    }


    public void actualizarNombrePokemon(String string, Pokemon pokemon){

        pokemon.nombre=string;
        actualizarNombres();

    }


    public void abrirVentana2(Pokemon pokemon, Image imagen1, Image imagen2){

        try{
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Ventana2.fxml"));
            AnchorPane root = (AnchorPane) loader.load();
            Scene scene = new Scene(root,400,300);
            stage.setScene(scene);
            stage.show();

            Ventana2 controller = loader.getController();



            controllerVentana2 = loader.getController();
            controllerVentana2.enviarController1(this);
            controllerVentana2.pasarPokemonVentana2(pokemon);
            controllerVentana2.pasarImagesVentana2(imagen1,imagen2);



            Stage stage2 = new Stage();
            FXMLLoader loader2 = new FXMLLoader(getClass().getResource("Ventana3.fxml"));
            AnchorPane root2 = (AnchorPane) loader2.load();
            Scene scene2 = new Scene(root2,400,300);
            stage2.setScene(scene2);
            stage2.show();
            Ventana3 controller2 = loader2.getController();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void actualizarNombres(){

        labelNombre1.setText(pokemon1.nombre);
        labelNombre2.setText(pokemon2.nombre);
        labelNombre3.setText(pokemon3.nombre);
        labelNombre4.setText(pokemon4.nombre);
        labelNombre5.setText(pokemon5.nombre);
        labelNombre6.setText(pokemon6.nombre);

    }



}
