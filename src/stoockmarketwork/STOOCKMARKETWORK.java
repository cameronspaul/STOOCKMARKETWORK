package stoockmarketwork;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class STOOCKMARKETWORK extends Application implements EventHandler<ActionEvent>{

    Button button;
    
    public static void main(String[] args) {
        
        launch(args);
        
        
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
       
        primaryStage.setTitle("monkey");
        
        button = new Button("money for free");
        button.setOnAction(this);
        
        
        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        
        
        Scene scene = new Scene(layout,1600,900);
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }

    @Override
    public void handle(ActionEvent event) {
        if (event.getSource()==button) {
            System.out.println("poo");
        }
        //https://www.youtube.com/watch?v=S_JN7zO12H4&list=PL6gx4Cwl9DGBzfXLWLSYVy8EbTdpGbUIG&index=2
    
    }
    
    
}
