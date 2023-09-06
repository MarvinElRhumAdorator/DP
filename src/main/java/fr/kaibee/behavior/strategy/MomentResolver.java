package fr.kaibee.behavior.strategy;

import java.time.Instant;
import java.time.temporal.TemporalAmount;

public class MomentResolver {
    public String when(Instant from, TemporalAmount timeAgo, FormatterStrategy formatterStrategy) {
        Instant whenResult = from.minus(timeAgo);
        return formatterStrategy.format(whenResult);
    }
}
