import ru.netology.javaqa.javaqamvn.services.MonthlySalesServices;

public class Main {
    public static void main (String[] args) {
        MonthlySalesServices service = new MonthlySalesServices();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int minSales = service.minSales(sales);
        int sumSales = service.sumSales(sales);
        int avgSales = service.avgSales(sales);
        int maxSumSales = service.numMaxSales(sales);
        int numMinSales = service.numAvgMinSales(sales);
        int numMaxSales = service.numAvgMaxSales(sales);

        System.out.println("Минимальные продажи: " + minSales);
        System.out.println("Сумма продаж: " + sumSales);
        System.out.println("Средняя сумма продаж: " + avgSales);
        System.out.println("Месяц с максимальными продажами: " + maxSumSales);
        System.out.println( "Количество месяцев с минимальными продажами: " + numMinSales);
        System.out.println( "Количество месяцев с максимальными продажами: " +numMaxSales);
    }
}
