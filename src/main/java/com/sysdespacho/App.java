package com.sysdespacho;

import java.time.LocalDateTime;

public class App {

    public static void main(String[] args) {
        System.out.println("=== Sistema de Control de Despacho de Contenedores ===");
        System.out.println("AgriDispatch - Agroindustrias Huaral");

        LocalDateTime currentTime = LocalDateTime.now();

        ContainerDispatch dispatch = new ContainerDispatch(
                "CONT-001",
                "Cliente Agroindustrial",
                "Puerto del Callao",
                currentTime.plusMinutes(15)
        );

        DispatchStatus status = DispatchClassifier.classify(
                dispatch.getScheduledTime(),
                currentTime
        );

        System.out.println("Contenedor: " + dispatch.getContainerNumber());
        System.out.println("Cliente: " + dispatch.getClient());
        System.out.println("Destino: " + dispatch.getDestination());
        System.out.println("Estado: " + status);
    }
}