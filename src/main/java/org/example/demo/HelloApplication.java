package org.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    //这里创建了一个舞台，里面有一个场景，场景下面有不同的组件，scene graph
    public void start(Stage stage) throws IOException {
        VBox root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        //用VBox载入的方式去实现背景

        Scene scene = new Scene(root,1300, 650);
//        scene.getStylesheets().add(getClass().getResource("/css/background.css").toExternalForm());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}