package com.mycompany.extra_credit_v2;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class PrimaryController {

    @FXML
    private Circle c1;
    @FXML
    private Circle c2;

   

    @FXML
    private void movement(MouseEvent event) { 
        Node n = (Node)event.getSource();
        n.setTranslateX(n.getTranslateX()+ event.getX());
        n.setTranslateY(n.getTranslateY()+ event.getY());
        
        if(n.getTranslateX()<0 && n.getTranslateY() < 100){
            c2.setFill(Color.RED);
        }
        else if(n.getTranslateX()>150 && n.getTranslateY()>150){
            c2.setFill(Color.GREEN);
        }else
        {
            c2.setFill(Color.BLUE);
        }

        
    }
}
