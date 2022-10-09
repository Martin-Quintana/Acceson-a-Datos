module com.example.proyecto_iago_maritn {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires eu.hansolo.tilesfx;
    requires com.fasterxml.jackson.annotation;
    requires com.fasterxml.jackson.databind;


    opens iesteis.javafxjacksoncocktails to javafx.fxml;
    exports iesteis.javafxjacksoncocktails;

    exports iesteis.javafxjacksoncocktails.controller;
    opens iesteis.javafxjacksoncocktails.controller to javafx.fxml;

    exports iesteis.javafxjacksoncocktails.model;
    opens iesteis.javafxjacksoncocktails.model;
}