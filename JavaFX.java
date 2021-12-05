import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button regist = new Button();
        TextField tf1 = new TextField();
        TextField tf2 = new TextField();
        TextField tf3 = new TextField();
        TextField tf4 = new TextField();
        TextField tf5 = new TextField();
        TextField tf6 = new TextField();
        Label labelFn = new Label("First Name ");
        Label labelLn = new Label("Last Name ");
        Label labelEa = new Label("E-Mail Address ");
        Label labelCn = new Label("Contact No ");
        Label labelPw = new Label("Password ");
        Label labelCp = new Label("Confirm Password");
        
        tf1.setPrefWidth(300);
        tf1.setPrefHeight(30);
        
        tf2.setPrefWidth(300);
        tf2.setPrefHeight(30);
        
        tf3.setPrefWidth(300);
        tf3.setPrefHeight(30);                
        
        tf4.setPrefWidth(300);
        tf4.setPrefHeight(30);                
        
        tf5.setPrefWidth(300);
        tf5.setPrefHeight(30);                
        
        tf6.setPrefWidth(300);
        tf6.setPrefHeight(30);                
        
        regist.setText("Register");
        regist.setStyle("-fx-text-fill: #FFFFFF");
        regist.setStyle("-fx-background-color: #0000FF");
        
        Group root = new Group();
        HBox panel1 = new HBox();
        HBox panel2 = new HBox();
        HBox panel3 = new HBox();
        HBox panel4 = new HBox();
        HBox panel5 = new HBox();
        HBox panel6 = new HBox();
        TilePane reg = new TilePane();
        
        panel1.getChildren().add(labelFn);
        panel2.getChildren().add(labelLn);
        panel3.getChildren().add(labelEa);
        panel4.getChildren().add(labelCn);
        panel5.getChildren().add(labelPw);
        panel6.getChildren().add(labelCp);
        
        reg.getChildren().addAll(regist);
        
        panel1.setLayoutX(95);
        panel1.setLayoutY(50);
        
        panel2.setLayoutX(100);
        panel2.setLayoutY(100);
        
        panel3.setLayoutX(100);
        panel3.setLayoutY(150);
        
        panel4.setLayoutX(100);
        panel4.setLayoutY(200);
        
        panel5.setLayoutX(100);
        panel5.setLayoutY(250);
        
        panel6.setLayoutX(100);
        panel6.setLayoutY(300);
        
        tf1.setLayoutX(210);
        tf1.setLayoutY(50);
        
        tf2.setLayoutX(210);
        tf2.setLayoutY(100);
        
        tf3.setLayoutX(210);
        tf3.setLayoutY(150);
        
        tf4.setLayoutX(210);
        tf4.setLayoutY(200);
        
        tf5.setLayoutX(210);
        tf5.setLayoutY(250);
        
        tf6.setLayoutX(210);
        tf6.setLayoutY(300);
        
        reg.setLayoutX(300);
        reg.setLayoutY(350);
        
        root.getChildren().addAll(panel1,panel2,panel3,panel4,panel5,panel6,tf1,tf2,tf3,tf4,tf5,tf6,reg);
        
        Scene scene = new Scene(root, 640, 440);
        panel1.setPadding(new Insets(5,5,5,5));
        
        primaryStage.setTitle("Register");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
