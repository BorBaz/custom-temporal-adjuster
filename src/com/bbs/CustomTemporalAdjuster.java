package com.bbs;

import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

/**
 * Snippet de un Temporal Adjuster que suma 15 dias a una fecha
 */
public class CustomTemporalAdjuster implements TemporalAdjuster {

    @Override
    public Temporal adjustInto(Temporal temporal) {
        return temporal.plus(15, ChronoUnit.DAYS);
    }
}
