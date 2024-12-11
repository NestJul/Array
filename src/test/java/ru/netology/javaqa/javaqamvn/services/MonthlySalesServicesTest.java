package ru.netology.javaqa.javaqamvn.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class MonthlySalesServicesTest {

@Test
   public void shouldFindMinSales()
{
    MonthlySalesServices services = new MonthlySalesServices();
    long[] sales = {5, 11, 9, 66, 7, 4, 7, 99, 999, 1, 80, 38};
    int expected = 10;
    int actual = services.minSales(sales);
    Assertions.assertEquals(expected,actual);
}
@Test
public void ShouldBeSumm(){
MonthlySalesServices services = new MonthlySalesServices();
    long[] sales = {500, 1100, 900, 660, 700, 400, 700, 909, 999, 100, 800, 308};
    int expected = 8076;
    int actual = services.sumSales(sales);
    Assertions.assertEquals(expected,actual);
}
@Test
    public void ShouldBeAvgSales(){
    MonthlySalesServices services = new MonthlySalesServices();
    long[] sales = {500, 1100, 900, 660, 700, 400, 700, 909, 999, 100, 800, 308};
    int expected = 673;
    int actual = services.avgSales(sales);
    Assertions.assertEquals(expected,actual);
}
@Test
    public void ShouldBeMaxSales() {
    MonthlySalesServices services = new MonthlySalesServices();
    long[] sales = {500, 1100, 900, 660, 700, 400, 700, 909, 999, 100, 800, 308};
    int expected = 2;
    int actual = services.numMaxSales(sales);
    Assertions.assertEquals(expected,actual);
}
@Test
    public void ShouldBeNumAvgMinSales() {
    MonthlySalesServices services = new MonthlySalesServices();
    long[] sales = {500, 1100, 900, 660, 700, 400, 700, 909, 999, 100, 800, 308};
    int expected = 7;
    int actual = services.numAvgMinSales(sales);
    Assertions.assertEquals(expected,actual);
}
@Test
public void ShouldBeNumAvgMaxSales() {
    MonthlySalesServices services = new MonthlySalesServices();
        long[] sales = {500, 1100, 900, 660, 700, 400, 700, 909, 999, 100, 800, 308};
        int expected = 7;
        int actual = services.numAvgMinSales(sales);
        Assertions.assertEquals(expected,actual);
    }
}





