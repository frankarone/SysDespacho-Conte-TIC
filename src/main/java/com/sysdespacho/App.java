package com.sysdespacho;

import java.time.LocalDateTime;

public class App {

    public static void main(String[] args) {
        System.out.println("=== Sistema de Control de Despacho de Contenedores ===");
        System.out.println("AgriDispatch - Agroindustrias Huaral");

        LocalDateTime currentTime = LocalDateTime.now();

        ContainerDispatch[] dispatches = {
            new ContainerDispatch(
                    "CONT-001",
                    "Cliente Agroindustrial A",
                    "Puerto del Callao",
                    currentTime.plusMinutes(60)
            ),
            new ContainerDispatch(
                    "CONT-002",
                    "Cliente Agroindustrial B",
                    "Puerto de Paita",
                    currentTime.plusMinutes(15)
            ),
            new ContainerDispatch(
                    "CONT-003",
                    "Cliente Agroindustrial C",
                    "Puerto de Chancay",
                    currentTime.minusMinutes(20)
            )
        };

        for (ContainerDispatch dispatch : dispatches) {
            mostrarResultado(dispatch, currentTime);
        }
    }

    private static void mostrarResultado(
            ContainerDispatch dispatch,
            LocalDateTime currentTime
    ) {
        DispatchStatus status = DispatchClassifier.classify(
                dispatch.getScheduledTime(),
                currentTime
        );

        System.out.println();
        System.out.println("------------------------------");
        System.out.println("Contenedor: " + dispatch.getContainerNumber());
        System.out.println("Cliente: " + dispatch.getClient());
        System.out.println("Destino: " + dispatch.getDestination());
        System.out.println("Hora programada: " + dispatch.getScheduledTime());
        System.out.println("Estado calculado: " + status);
    }
}