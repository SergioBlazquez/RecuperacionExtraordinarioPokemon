package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class Ventana3 {



    static final int MAXPPMOV1= 5;
    static final int MAXPPMOV2= 20;
    static final int MAXPPMOV3= 10;
    static final int MAXPPMOV4= 10;


    int ppMov1=MAXPPMOV1;
    int ppMov2=MAXPPMOV2;
    int ppMov3=MAXPPMOV3;
    int ppMov4=MAXPPMOV4;

    @FXML
    AnchorPane anchorPane1, anchorPane2, anchorPane3, anchorPane4;
    @FXML
    Label label1, label2, label3, label4;
    @FXML
    Button boton, botonSalir;

    @FXML
    public void onClickAnchorPane1(){

        if(ppMov1>0) {
            ppMov1 -= 1;
            label1.setText(ppMov1 + "/" + MAXPPMOV1);

        }
    }

    @FXML
    public void onClickAnchorPane2(){

        if(ppMov2>0){
            ppMov2-=1;
            label2.setText(ppMov2+"/"+MAXPPMOV2);
        }

    }

    @FXML
    public void onClickAnchorPane3(){

        if(ppMov3>0){
            ppMov3-=1;
            label3.setText(ppMov3+"/"+MAXPPMOV3);
        }

    }

    @FXML
    public void onClickAnchorPane4(){

        if(ppMov4>0){
            ppMov4-=1;
            label4.setText(ppMov4+"/"+MAXPPMOV4);
        }

    }

    @FXML
    public void onClickMasPP(){

        ppMov1=MAXPPMOV1;
        ppMov2=MAXPPMOV2;
        ppMov3=MAXPPMOV3;
        ppMov4=MAXPPMOV4;
        label1.setText(ppMov1+"/"+MAXPPMOV1);
        label2.setText(ppMov2+"/"+MAXPPMOV2);
        label3.setText(ppMov3+"/"+MAXPPMOV3);
        label4.setText(ppMov4+"/"+MAXPPMOV4);
    }
    @FXML
    public void onClickBotonSalir(){

        Stage stage = (Stage) botonSalir.getScene().getWindow();
        stage.close();
    }




}
