package sample;

import javafx.fxml.FXML;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class Controller{
    Boolean print=false;

    @FXML
    private TextField search;

    @FXML
    private Button searchButton;

    @FXML
    private Label noSearched;

    @FXML
    public void initialize(){
        Pizza pizza = new Pizza();
        Sushi sushi = new Sushi();
        searchButton.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                System.out.println(search.getText().equals(""));
                System.out.println(search.getText());




                if(search.getText().equals("express_pizza") == true){
                    try { pizza.express_pizza(); }
                    catch (IOException e) { e.printStackTrace(); }
                }
                if(search.getText().equals("la_ua_pizza") == true){
                    try { pizza.la_ua_pizza(); }
                    catch (IOException e) { e.printStackTrace(); }
                }
                if(search.getText().equals("prontop_pizza") == true){
                    try { pizza.prontop_pizza(); }
                    catch (IOException e) { e.printStackTrace(); }
                }
                if(search.getText().equals("wok_sushi") == true){
                    try { sushi.wok_sushi(); }
                    catch (IOException e) { e.printStackTrace(); }
                }
                
            }
        });
    }

}
