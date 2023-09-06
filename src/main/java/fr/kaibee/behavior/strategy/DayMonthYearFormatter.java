package fr.kaibee.behavior.strategy;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DayMonthYearFormatter implements FormatterStrategy {

    private static final String PATTERN_FORMAT = "dd-MM-yyyy";

    @Override
    public String format(Instant whenResult) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(PATTERN_FORMAT)
                .withZone(ZoneId.systemDefault());
        return formatter.format(whenResult);
    }
}
