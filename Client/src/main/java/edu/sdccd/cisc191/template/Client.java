package edu.sdccd.cisc191.template;


import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/* v.1.0.3 update: This JavaFX on Client allows user to interact in the way of inputting, pressing
 * and the output. We are going to import a lot of javafx stuff
 */

public class Client extends Application{ // extend application is how JavaFX starts always

    private Parent createContent(){
        VBox root = new VBox();
        root.setPrefSize(500,500);

        TextField input=new TextField();
        input.setFont(Font.font(18));

        Text output = new Text();
        output.setFont(Font.font(18));

        Button button= new Button ("Start here");

        button.setOnAction(e-> { output.setText(input.getText());});
        root.getChildren().addAll( input, button, output);

        return root;
    }

    @Override

    public void start(Stage stage) throws Exception{
        stage.setScene(new Scene(createContent()));
        stage.show();
    }

    public static void main(String[] args){
        launch (args);
    }

} //end class Client

