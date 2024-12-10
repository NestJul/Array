package ru.netology.javaqa.javaqamvn.services;

public class MonthlySalesServices {
    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }
        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int sumSales(long[] sales) {
        int sumSales = 0;

        for (long sale : sales) {
            sumSales += sale;
        }

        return sumSales;
    }

    public int avgSales(long[] sales) {
        int sumSales = sumSales(sales);

        return sumSales / sales.length;
    }

    public int numMaxSales(long[] sales) {
        int maxSumSales = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxSumSales]) {
                maxSumSales = i;
            }
        }
        return maxSumSales + 1;
    }

    public int numAvgMinSales(long[] sales) {
        int numMinSales = 0;
        int avgSales = avgSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (avgSales < sales[i]) {
                numMinSales++;
            }
        }
        return numMinSales;
    }

    public int numAvgMaxSales(long[] sales) {
        int numAvgMaxSales = 0;
        int avgSales = avgSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (avgSales > sales[i]) {
                numAvgMaxSales++;
            }
        }
        return numAvgMaxSales;
    }

}