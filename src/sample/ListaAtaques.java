package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import java.util.ArrayList;

public class ListaAtaques {

    ArrayList<Ataques> listaAtaques = new ArrayList<>();
    @FXML
    VBox vBox;

    @FXML
    public void initialize(){

        Ataques ataque1= new Ataques("Ataque 1",15,15);
        listaAtaques.add(ataque1);
        Ataques ataque2= new Ataques("Ataque 2",10,10);
        listaAtaques.add(ataque2);


        for (int i = 0; i < listaAtaques.size(); i++){

            Label lb1 = new Label(listaAtaques.get(i).ataque);
            Label lb2= new Label(listaAtaques.get(i).ppAcutal+"/"+listaAtaques.get(i).ppMax);
            VBox vb= new VBox(lb1,lb2);
            vBox.getChildren().add(vb);
        }
    }
}
