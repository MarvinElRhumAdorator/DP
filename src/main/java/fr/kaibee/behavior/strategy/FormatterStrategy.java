package fr.kaibee.behavior.strategy;

import java.time.Instant;

public interface FormatterStrategy {
    String format(Instant whenResult);
}


