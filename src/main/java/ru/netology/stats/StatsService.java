package ru.netology.stats;

import java.sql.Array;
import java.util.Arrays;

public class StatsService {
    public long allSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long avgSales(long[] sales) {
        long avgSales = allSales(sales) / 12;

        return avgSales;
    }

    public long maxSales(long[] sales) {
        long maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[(int) maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1;
    }


    public long lowerThanAvgSales(long[] sales) {
        long countMonthLowerThanAvg = 0;
        for (long sale : sales) {
            long x = avgSales(sales);

            if (sale < x) {
                countMonthLowerThanAvg = countMonthLowerThanAvg + 1;
            }
        }

        return countMonthLowerThanAvg;
    }

    public long countMonthHigherThanAvgSales(long[] sales) {
        long countMonthHigherThanAvg = 0;

        for (long sale : sales) {
            long x = avgSales(sales);

            if (sale >= x) {
                countMonthHigherThanAvg = countMonthHigherThanAvg + 1;
            }

        }

        return countMonthHigherThanAvg;
    }
}

