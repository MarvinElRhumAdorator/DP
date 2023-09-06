package fr.kaibee.behavior.strategy;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class MonthDayFormatter implements FormatterStrategy {

    private static final String PATTERN_FORMAT = "MM-dd";

    @Override
    public String format(Instant whenResult) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(PATTERN_FORMAT)
                .withZone(ZoneId.systemDefault());
        return formatter.format(whenResult);
    }
}
