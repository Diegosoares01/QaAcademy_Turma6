module com.example.exerciciosnivelmedium {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exerciciosnivelmedium to javafx.fxml;
    exports com.example.exerciciosnivelmedium;
}