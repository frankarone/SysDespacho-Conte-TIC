package com.sysdespacho;

import java.time.LocalDateTime;

import junit.framework.TestCase;

public class DispatchClassifierTest extends TestCase {

    public void testDebeClasificarATiempo() {
        LocalDateTime scheduledTime = LocalDateTime.of(2026, 9, 2, 10, 0);
        LocalDateTime currentTime = LocalDateTime.of(2026, 9, 2, 9, 0);

        assertEquals(
                DispatchStatus.SALIR,
                DispatchClassifier.classify(scheduledTime, currentTime)
        );
    }

    public void testDebeClasificarProximo() {
        LocalDateTime scheduledTime = LocalDateTime.of(2026, 9, 2, 10, 0);
        LocalDateTime currentTime = LocalDateTime.of(2026, 9, 2, 9, 45);

        assertEquals(
                DispatchStatus.PROXIMO,
                DispatchClassifier.classify(scheduledTime, currentTime)
        );
    }

    public void testDebeClasificarRetrasado() {
        LocalDateTime scheduledTime = LocalDateTime.of(2026, 9, 2, 10, 0);
        LocalDateTime currentTime = LocalDateTime.of(2026, 9, 2, 10, 20);

        assertEquals(
                DispatchStatus.RETRASADO,
                DispatchClassifier.classify(scheduledTime, currentTime)
        );
    }
}
