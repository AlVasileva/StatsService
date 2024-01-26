package ru.netology.stats;

import java.sql.Array;
import java.util.Arrays;

public class StatsService {
    public int allSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int avgSales(int[] sales) {
        int avgSales = allSales(sales) / 12;

        return avgSales;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1;
    }


    public int lowerThanAvgSales(int[] sales) {
        int countMonthLowerThanAvg = 0;
        for (int sale : sales) {

            if (sale < avgSales(sales)) {
                countMonthLowerThanAvg = countMonthLowerThanAvg + 1;
            }
        }

        return countMonthLowerThanAvg;
    }

    public int countMonthHigherThanAvgThanAvgSales(int[] sales) {
        int countMonthHigherThanAvg = 0;
        for (int sale : sales) {

            if (sale >= avgSales(sales)) {
                countMonthHigherThanAvg = countMonthHigherThanAvg + 1;
            }
        }

        return countMonthHigherThanAvg;
    }
}

