package ru.netology.stats;

public class StatsService {

    public int sumSales(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int arvSales(long[] sales) {
        return sumSales(sales) / sales.length;
    }


    public int maxSales(long[] sales) {

        int month = 0;
        int maxMonth = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }


    public int minSales(long[] sales) {
        int month = 0;
        int minMonth = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;

    }


    public int lowArvSales(long[] sales) {
        int count = 0;
        long arv = arvSales(sales);
        for (long sale : sales) {
            if (sale < arv) {
                count++;
            }
        }
        return count;
    }

    public int highArvSales(long[] sales) {
        int count = 0;
        long arv = arvSales(sales);
        for (long sale : sales) {
            if (sale > arv) {
                count++;
            }
        }
        return count;
    }
}