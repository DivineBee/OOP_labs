package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import javax.swing.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception,UnluckyException{
        Label laNumber1 = new Label("Number1:");
        TextField txtNumber1 = new TextField();

        Label laNumber2 = new Label("Number2:");
        TextField txtNumber2 = new TextField();

        Label laResult = new Label("Division");
        Button btn = new Button("Get Div");
        btn.setOnAction(event -> {
            //div operation
            try{
            float n1 =Float.parseFloat( txtNumber1.getText().toString());
            float n2 =Float.parseFloat( txtNumber2.getText().toString());
            float div = n1/n2;
            laResult.setText(String.valueOf("Result = "+div));
            if(n2==13) throw new UnluckyException("Your number is unlucky");
            if (div == Double.POSITIVE_INFINITY ||
                    div == Double.NEGATIVE_INFINITY)
                throw new ArithmeticException();
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Enter a valid number","Just Numbers",JOptionPane.INFORMATION_MESSAGE);
            }
            catch(ArithmeticException e) {
                JOptionPane.showMessageDialog(null,"Number can't be divided by 0","Enter valid operators",JOptionPane.INFORMATION_MESSAGE);
            }
            catch(UnluckyException e){
                JOptionPane.showMessageDialog(null,"Don't bring bad luck","Unlucky number",JOptionPane.INFORMATION_MESSAGE);
            }
        });

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25,25,25,25));
        //grid.setGridLinesVisible(true);
        grid.add(laNumber1,0,0);
        grid.add(txtNumber1,1,0);
        grid.add(laNumber2,0,1);
        grid.add(txtNumber2,1,1);
        grid.add(laResult,1,2);
        grid.add(btn,2,3);

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(grid, 400, 350));
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
