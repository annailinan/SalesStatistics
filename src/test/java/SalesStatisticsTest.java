import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.SalesStatistics;

public class SalesStatisticsTest {
    @Test
    void resultMinSalesTest() {
        SalesStatistics service = new SalesStatistics();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.minSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void resultMaxSalesTest() {
        SalesStatistics service = new SalesStatistics();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.maxSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void resultTotalSalesYearTest() {
        SalesStatistics serviсe = new SalesStatistics();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long actual = serviсe.totalSalesYear(sales);
        Assertions.assertEquals(expected, actual);


    }

    @Test
    void resultAverageSalesYearTest() {
        SalesStatistics serviсe = new SalesStatistics();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;

        long actual = serviсe.averageSalesYear(sales);
        Assertions.assertEquals(expected, actual);


    }

    @Test
    void resultAboveAverageTest() {
        SalesStatistics serviсe = new SalesStatistics();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = serviсe.aboveAverageSale(sales);
        Assertions.assertEquals(expected, actual);


    }

    @Test
    void resultBelowAverageSaleTest() {
        SalesStatistics serviсe = new SalesStatistics();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = serviсe.belowAverageSale(sales);
        Assertions.assertEquals(expected, actual);


    }
}