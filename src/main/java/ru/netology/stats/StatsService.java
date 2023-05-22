package ru.netology.stats;

public class StatsService {

    public int getAmountsOfSales(int[] incomes) {
        int sum = 0;
        for (int income : incomes) {
            sum += income;
        }
        return sum;
    }

    public double getMiddleValue(int[] incomes) {
        int sum = 0;
        for (int income : incomes) {
            sum += income;
        }
        return (double) sum / incomes.length;
    }

    public int getMaxAmount(int[] incomes) {
        int monthMaxValue = 0;
        for (int i = 0; i < incomes.length; i++) {
            if (incomes[i] >= incomes[monthMaxValue]) {
                monthMaxValue = i;
            }
        }
        return monthMaxValue + 1;
    }

    public int getMinAmount(int[] incomes) {
        int monthMinValue = 0;
        for (int i = 0; i < incomes.length; i++) {
            if (incomes[i] <= incomes[monthMinValue]) {
                monthMinValue = i;
            }
        }
        return monthMinValue + 1;
    }

    public int getLowIncome(int[] incomes) {
        int lowMonths = 0;
        for (int income : incomes) {
            if (income < getMiddleValue(incomes)) {
                lowMonths++;
            }
        }
        return lowMonths;
    }

    public int getHighIncome(int[] incomes) {
        int highMonths = 0;
        for (int income : incomes) {
            if (income > getMiddleValue(incomes)) {
                highMonths++;
            }
        }
        return highMonths;
    }
}