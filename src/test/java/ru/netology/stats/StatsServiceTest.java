package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void testAmountsOfSales() {
        StatsService service = new StatsService();

        int[] amounts = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 180;
        int actualSum = service.getAmountsOfSales(amounts);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void testMiddleValue() {
        StatsService service = new StatsService();

        int[] amounts = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        double expectedValue = 15.0;
        double actualValue = service.getMiddleValue(amounts);

        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testMaxAmount() {
        StatsService service = new StatsService();

        int[] amounts = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 8;
        int actualMonth = service.getMaxAmount(amounts);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void testMinAmount() {
        StatsService service = new StatsService();

        int[] amounts = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 9;
        int actualMonth = service.getMinAmount(amounts);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void testLowIncome() {
        StatsService service = new StatsService();

        int[] amounts = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedNumberOfMonths = 5;
        int actualNumberOfMonths = service.getLowIncome(amounts);

        Assertions.assertEquals(expectedNumberOfMonths, actualNumberOfMonths);
    }

    @Test
    public void testHighIncome() {
        StatsService service = new StatsService();

        int[] amounts = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedNumberOfMonths = 5;
        int actualNumberOfMonths = service.getHighIncome(amounts);

        Assertions.assertEquals(expectedNumberOfMonths, actualNumberOfMonths);
    }
}
