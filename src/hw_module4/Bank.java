package hw_module4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by dd on 20.12.2016.
 */
public class Bank {

    public static void main(String[] args) {
        Bank bank = new Bank("someBank");
        bank.addDeposit(new Deposit("firstClient", 100, 10));
        bank.addDeposit(new Deposit("secondClient", 200, 7));
        bank.addDeposit(new Deposit("thirdClient", 300, 15.5));
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
    private List<Deposit> depositList = new ArrayList<>();

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public void addDeposit(Deposit deposit) {
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
