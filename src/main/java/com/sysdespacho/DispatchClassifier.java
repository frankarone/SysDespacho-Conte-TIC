package com.sysdespacho;

import java.time.Duration;
import java.time.LocalDateTime;

public class DispatchClassifier {

    public static DispatchStatus classify(LocalDateTime scheduledTime, LocalDateTime currentTime) {

        long minutes = Duration.between(currentTime, scheduledTime).toMinutes();

        if (minutes > 30) {
            return DispatchStatus.A_TIEMPO;
        } else if (minutes >= 0) {
            return DispatchStatus.PROXIMO;
        } else {
            return DispatchStatus.RETRASADO;
        }
    }
}