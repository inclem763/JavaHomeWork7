package ru.netology.javaqa.JavaHomeWork7.services;

public class StatsService {
    public int calculateSumSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int calculateFindAverage(int[] sales) {
        return calculateSumSales(sales) / sales.length;
    }

    public int findMaxSales(int[] sales) {
        int maxMonth = sales[0];
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int findMinSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int salesBelowAverage(int[] sales) {
        int counterBelow = 0;
        for (long sale : sales) {
            if (sale < calculateFindAverage(sales)) {
                counterBelow++;
            }
        }
        return counterBelow;
    }

    public int salesAboveAverage(int[] sales) {
        int counterBelow = 0;
        for (long sale : sales) {
            if (sale > calculateFindAverage(sales)) {
                counterBelow++;
            }
        }
        return counterBelow;
    }
}
