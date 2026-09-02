package com.sysdespacho;

import java.time.LocalDateTime;

public class ContainerDispatch {

    private String containerNumber;
    private String client;
    private String destination;
    private LocalDateTime scheduledTime;

    public ContainerDispatch(String containerNumber, String client, String destination, LocalDateTime scheduledTime) {
        this.containerNumber = containerNumber;
        this.client = client;
        this.destination = destination;
        this.scheduledTime = scheduledTime;
    }

    public String getContainerNumber() {
        return containerNumber;
    }

    public String getClient() {
        return client;
    }

    public String getDestination() {
        return destination;
    }

    public LocalDateTime getScheduledTime() {
        return scheduledTime;
    }
}