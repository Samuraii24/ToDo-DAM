package com.example.ToDo.presentacion;

import com.example.ToDo.ToDoApplication;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import javafx.scene.image.Image;

public class SistemasTareasFx extends Application {

    private ConfigurableApplicationContext applicationContext;

    @Override
    public void init() {
        this.applicationContext = new SpringApplicationBuilder(ToDoApplication.class).run();
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader =
                new FXMLLoader(ToDoApplication.class.getResource("/templates/index.fxml"));
        loader.setControllerFactory(applicationContext::getBean);
        Scene escena = new Scene(loader.load());

        // Establecer propiedades de la ventana
        stage.setScene(escena);
        stage.setTitle("Sistema de Tareas"); // Opcional, establecer título
        stage.setResizable(false); // No permitir redimensionar

        // Establecer dimensiones fijas
        stage.setWidth(600);
        stage.setHeight(400);

        // Establecer el icono
//        stage.getIcons().add(new Image(ToDoApplication.class.getResourceAsStream("/ruta/a/tu/icono.png")));

        stage.show();
    }

    @Override
    public void stop() {
        applicationContext.close();
        Platform.exit();
    }
}
