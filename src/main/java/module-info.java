module sm.app_calcu {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires com.almasb.fxgl.all;

    opens sm.app_calcu to javafx.fxml;
    exports sm.app_calcu;
}