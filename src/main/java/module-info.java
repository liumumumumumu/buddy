module pers.liulin.buddy {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens pers.liulin.buddy to javafx.fxml;
    exports pers.liulin.buddy;
}