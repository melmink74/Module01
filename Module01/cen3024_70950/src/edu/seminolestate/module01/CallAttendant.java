package edu.seminolestate.module01;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
/*
 * Author: Melissa Mink
 * Date: September 2018
 * Implement the back-end in Java, and create a simple test UI that uses it. 
 * The test UI doesn't have to be graphical... it's just a command-line 
 * application that uses the back-end
 */

public class CallAttendant extends Application {
	@Override 
	public void start(Stage primaryStage) throws Exception {
		HBox pane = new HBox(10);
		pane.setAlignment(Pos.CENTER);
		Button btOff = new Button("Off");
		OffHandlerClass handler = new OffHandlerClass();
		btOff.setOnAction(handler);
		pane.getChildren().addAll(btOff);
		
		Scene scene = new Scene(pane);
		primaryStage.setTitle("CallAttendant");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	class OffHandlerClass implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent e) {
			System.out.println("All Lights Off");
		}
	}

}
