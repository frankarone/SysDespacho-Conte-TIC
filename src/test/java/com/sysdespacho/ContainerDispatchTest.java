package com.sysdespacho;

import java.time.LocalDateTime;

import junit.framework.TestCase;

public class ContainerDispatchTest extends TestCase {

    public void testDebeConservarLosDatosDelDespacho() {
        LocalDateTime scheduledTime =
                LocalDateTime.of(2026, 9, 2, 10, 0);

        ContainerDispatch dispatch = new ContainerDispatch(
                "CONT-001",
                "Cliente Agroindustrial",
                "Puerto del Callao",
                scheduledTime
        );

        assertEquals("CONT-001", dispatch.getContainerNumber());
        assertEquals("Cliente Agroindustrial", dispatch.getClient());
        assertEquals("Puerto del Callao", dispatch.getDestination());
        assertEquals(scheduledTime, dispatch.getScheduledTime());
    }
}