import ru.netology.stats.StatsService;

public class Main {


    public static void main(String[] args) {
        StatsService service = new StatsService();
        int[] incomes = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        System.out.println("Сумма продаж за год составила " + service.getAmountsOfSales(incomes) + " у.е.");
        System.out.println("Средняя сумма продаж в месяц составила " + service.getMiddleValue(incomes) + " у.е.");
        System.out.println("Пик продаж в этом году пришелся на " + service.getMaxAmount(incomes) + " месяц.");
        System.out.println("Спад продаж в этом году пришелся на " + service.getMinAmount(incomes) + " месяц.");
        System.out.println("Количество месяцев, когда продажи были ниже среднего, " + service.getLowIncome(incomes) + ".");
        System.out.println("Количество месяцев, когда продажи были выше среднего, " + service.getHighIncome(incomes) + ".");
    }
}
