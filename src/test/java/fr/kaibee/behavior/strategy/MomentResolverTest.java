package fr.kaibee.behavior.strategy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.time.Period;

class MomentResolverTest {
    @Test
    void someDates() {
        MomentResolver momentResolver = new MomentResolver();

        Instant from = Instant.parse("2020-11-14T12:00:00Z");
        String displayWithDayMonthYear = momentResolver.when(
                from,
                Period.ofDays(2),
                new DayMonthYearFormatter());

        String displayWithMonthDay = momentResolver.when(
                from,
                Period.ofDays(2),
                new MonthDayFormatter());

        Assertions.assertEquals("12-11-2020", displayWithDayMonthYear);
        Assertions.assertEquals("11-12", displayWithMonthDay);


    }
}
