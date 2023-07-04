package ru.netology.javaqa.JavaHomeWork7.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    void SumSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 180;
        int actualSum = service.calculateSumSales(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    void findAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 15;
        int actualSum = service.calculateFindAverage(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    void maxSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 8;
        int actualSum = service.findMaxSales(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    void minSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 9;
        int actualSum = service.findMinSales(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    void belowAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 5;
        int actualSum = service.salesBelowAverage(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    void AboveAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 5;
        int actualSum = service.salesAboveAverage(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }
}
