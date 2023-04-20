package ru.netology.stats;

public class Main {
    public static void main(String[] args) {
        SalesStatistics servise = new SalesStatistics();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int resultMin = servise.minSales(sales);
        int resultMax = servise.maxSales(sales);
        long totalSalesYear = servise.totalSalesYear(sales);
        long averageSalesYear = servise.averageSalesYear(sales);
        long aboveAverageSale = servise.aboveAverageSale(sales);
        long belowAverageSale = servise.belowAverageSale(sales);


        System.out.println(resultMin);
        System.out.println(resultMax);
        System.out.println(totalSalesYear);
        System.out.println(averageSalesYear);
        System.out.println(aboveAverageSale);
        System.out.println(belowAverageSale);
        ;

    }
}