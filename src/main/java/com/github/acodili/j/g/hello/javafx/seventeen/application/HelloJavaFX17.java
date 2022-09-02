package com.github.acodili.j.g.hello.javafx.seventeen.application;

import static javafx.geometry.Pos.CENTER;
import static javafx.scene.layout.Region.USE_PREF_SIZE;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class HelloJavaFX17 extends Application {
	@Override
	public void start(final Stage stage) throws Exception {
		final var label = new Label();
		final var scene = new Scene(label);

		label.setAlignment(CENTER);
		label.setMinHeight(USE_PREF_SIZE);
		label.setMinWidth(USE_PREF_SIZE);
		label.setText("Hello, world!");

		stage.setHeight(400.0D);
		stage.setScene(scene);
		stage.setTitle("Hello JavaFX 17");
		stage.setWidth(600.0D);

		stage.centerOnScreen();
		stage.show();
	}
}
