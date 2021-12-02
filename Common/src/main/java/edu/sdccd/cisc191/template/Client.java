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

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/* v.1.0.3 update: This JavaFX on Client allows user to interact in the way of inputting, pressing
 * and the output. We are going to import a lot of javafx stuff.
 *  It is for the beginning of the project where the user first interacts with the app.
 */

public class Client extends Application{ // extend application is how JavaFX starts always

    private Parent createContent(){ //how to create a "parent" to set the GUI

        VBox root = new VBox(); //sets and defines the children which will lay it out vertically
        root.setPrefSize(500,500); //its size

        TextField input=new TextField(); //set store and define the input text
        input.setFont(Font.font(20)); //set the font of the user input

        Text output = new Text(); //set store and define the output which will be just printin gout the input
        output.setFont(Font.font(20)); //set the font of the output

        Button button= new Button ("Start here"); //button for the user to press after typing

        button.setOnAction(e-> { output.setText(input.getText());}); //after the  press this makes sure that output will be whatever the input
        root.getChildren().addAll( input, button, output); //type input, press button, output emerges

        return root;
    }

    @Override //method override

    public void start(Stage stage) throws Exception{
        stage.setScene(new Scene(createContent()));
        stage.show();
        //start setup of stage for the GUI
    }

    public static void main(String[] args){
        launch (args);
        //launch
    }

} //end class Client

