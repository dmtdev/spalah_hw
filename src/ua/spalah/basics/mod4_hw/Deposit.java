package ua.spalah.basics.mod4_hw;

/**
 * Created by dd on 21.12.2016.
 */
public class Deposit {
    private String clientName;
    private double firstSum;
    private double percent;

    public Deposit(String clientName, double firstSum, double percent) {
        this.clientName = clientName;
        this.firstSum = firstSum;
        this.percent = percent;
    }

    public double calcProfit(int years) {
        double profit = this.firstSum;
        for (int i = 0; i < years; i++) {
            profit = profit + (profit / 100 * this.percent);
        }
        return profit - this.firstSum;
    }
}

