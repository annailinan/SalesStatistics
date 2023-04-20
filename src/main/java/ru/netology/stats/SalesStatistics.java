package ru.netology.stats;

public class SalesStatistics {
    //Месяц с минимальными продажами
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    //Месяц с максимальными продажами
    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        } // значит, в рассматриваемом месяце продаж больше

        return maxMonth + 1;
    }

    //сумма
    public long totalSalesYear(long[] sales) {

        int amount = 0;
        for (long sale : sales) {
            amount += sale;
        }
        return amount;
    }

    // средняя по году
    public long averageSalesYear(long[] sales) {

        return totalSalesYear(sales) / sales.length;
    }

    //Выше среднего
    public long aboveAverageSale(long[] sales) {
        int aboveAverage = 0;
        for (long sale : sales) {
            if (sale > averageSalesYear(sales)) {
                aboveAverage++;
            }
        }
        return aboveAverage;

    }

    // продажи ниже среднего за год
    public long belowAverageSale(long[] sales) {
        int belowAverage = 0;
        for (long sale : sales) {
            if (sale < averageSalesYear (sales)) {
                belowAverage += 1;
            }
        }
        return belowAverage;

    }
}
