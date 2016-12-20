package hw_module4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by dd on 20.12.2016.
 */
public class Bank1 {

    public static void main(String[] args) {
        Bank1 bank = new Bank1("someBank");
        bank.addDeposit(new Deposit1("First Client", 100, 10));
        bank.addDeposit(new Deposit1("Second Client", 200, 7));
        bank.addDeposit(new Deposit1("Third Client", 300, 15.5));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Years count?");
        int years = 0;
        while (years == 0) {
            try {
                years = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Integer please..");
            }
        }
        System.out.printf("Amount over " + years + " years: $%.2f", bank.calcSum(years));
    }

    private static int countDeposits = 0;
    private String bankName;
    private List<Deposit1> depositList = new ArrayList<>();

    public Bank1(String bankName) {
        this.bankName = bankName;
    }

    public void addDeposit(Deposit1 deposit) {
        if (countDeposits < 10) {
            depositList.add(deposit);
            countDeposits++;
        }
    }

    public double calcSum(int years) {
        double sum = 0;
        for (int i = 0; i < depositList.size(); i++) {
            sum += depositList.get(i).calcProfit(years);
        }
        return sum;
    }
}
