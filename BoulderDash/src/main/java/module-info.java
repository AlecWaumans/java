module com.example.boulderdash {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires org.junit.jupiter.api;
    requires java.desktop;
    requires jdk.accessibility;

    opens com.example.boulderdash to javafx.fxml;
    exports Main;
    opens Main to javafx.fxml;
    exports ViewConsole;
    opens ViewConsole to javafx.fxml;
    exports view.Maps;
    opens view.Maps to javafx.fxml;
}