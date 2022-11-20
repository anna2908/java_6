package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StatsServiceTest {
    @Test
    public void sumSalesTest() {
        StatsService service = new StatsService();
        long[] temps = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedDay = 180;
        int actualDay = service.sumSales(temps);

        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void arvSalesTest() {
        StatsService service = new StatsService();
        long[] temps = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedDay = 15;
        int actualDay = service.arvSales(temps);

        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void maxSalesTest() {
        StatsService service = new StatsService();
        long[] temps = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedDay = 8;
        int actualDay = service.maxSales(temps);

        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void minSalesTest() {
        StatsService service = new StatsService();
        long[] temps = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedDay = 9;
        int actualDay = service.minSales(temps);

        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void lowArvSalesTest() {
        StatsService service = new StatsService();
        long[] temps = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedDay = 5;
        int actualDay = service.lowArvSales(temps);

        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void highArvSalesTest() {
        StatsService service = new StatsService();
        long[] temps = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedDay = 5;
        int actualDay = service.highArvSales(temps);

        Assertions.assertEquals(expectedDay, actualDay);
    }
}
