package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        int n1=1,n2=1;

        for(int i = 0; i < n1; i++) {
            for(int k = 0; k < n2; k++) {
                Pane frame = new Pane();
                frame.setPrefSize(100,200);
                frame.setLayoutX(0);
                frame.setLayoutX(0);
                frame.setStyle("-fx-background-color: #65dbd3;");
            }
        }

        /*Pizza pizza = new Pizza();
        pizza.express_pizza();
        pizza.la_ua_pizza();
        pizza.prontop_pizza();

        Sushi sushi = new Sushi();
        sushi.wok_sushi();*/


        primaryStage.setTitle("program");
        primaryStage.setScene(new Scene(root, 720, 480));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
