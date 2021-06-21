package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Ventana2 {

    private Controller controllerVentana1;
    Pokemon pokemon;

    @FXML
    Label label1, labelPS, labelAtaque, labelDefensa, labelAtcEsp, labelDefEsp, labelVeloc, labelHabilidad, labelNivel, labelObjeto;

    @FXML
    TextField textFieldNombre;

    @FXML
    ImageView imageViewPokemon,imageViewGenero;




    @FXML
    public void onLabelClick(){
        pasarStringVentana2("Adios");
    }

    @FXML
    public void onNombreCambiado(){

            controllerVentana1.actualizarNombrePokemon(textFieldNombre.getText(),pokemon);
    }


    public void pasarPokemonVentana2(Pokemon pokemon){

        this.pokemon=pokemon;
        System.out.println("Nombre pokemon: "+this.pokemon.nombre);
        System.out.println("Ataque pokemon: "+this.pokemon.ataque);

        //Estadisticas pokemon
        labelPS.setText(this.pokemon.vidaActual+"/"+this.pokemon.psMax);
        labelAtaque.setText(String.valueOf(this.pokemon.ataque));
        labelDefensa.setText(String.valueOf(this.pokemon.defensa));
        labelAtcEsp.setText(String.valueOf(this.pokemon.atcEsp));
        labelDefEsp.setText(String.valueOf(this.pokemon.defEsp));
        labelVeloc.setText(String.valueOf(this.pokemon.velocidad));

        //Caracteristicas Pokemon
        labelHabilidad.setText(this.pokemon.habilidad);
        textFieldNombre.setText(this.pokemon.nombre);
        labelNivel.setText("Nv."+this.pokemon.nivel);
        labelObjeto.setText(this.pokemon.objeto);




    }

    public void pasarImagesVentana2(Image imagen1, Image imagen2){

        imageViewPokemon.setImage(imagen1);
        imageViewGenero.setImage(imagen2);


    }


    public void enviarController1(Controller ventana1Controller) {
        controllerVentana1 = ventana1Controller;
    }



    public void pasarStringVentana2(String string){
        controllerVentana1.recogerStringVentana2(string);
    }
}

