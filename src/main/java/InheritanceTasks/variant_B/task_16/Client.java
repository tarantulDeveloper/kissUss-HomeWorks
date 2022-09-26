package InheritanceTasks.variant_B.task_16;

import java.util.ArrayList;
import java.util.Collections;

class Client {
    private String fullName;
    private ArrayList<Account> accountsList;

    public Client(String fullName, ArrayList<Account> accountsList) {
        this.fullName = fullName;
        this.accountsList = accountsList;
    }

    public ArrayList<Account> getAccountsList() {
        return accountsList;
    }

    void addAccountToAccountList(Account accountsList) {
        this.accountsList.add(accountsList);
    }

    boolean findByAccountNumber(int accountNumber) {
        for (Account account : accountsList) {
            if (account.getAccountNumber() == accountNumber) {
                return true;
            }
        }
        return false;
    }

    ArrayList<Account> sortByAmount() {
        Collections.sort(accountsList);
        return accountsList;
    }

    double overallAmount() {
        double sum = 0;
        for(Account account : accountsList) {
            sum += account.getAccountBalance();
        }
        return sum;
    }

    double overallAmountForNegative() {
        double overall = 0;
        for(Account account: accountsList) {
            overall += Math.abs(account.getAccountBalance());
        }
        return overall;
    }

    double overallAmountForPositive() {
        double overall = 0;
        for(Account account : accountsList) {
            overall += account.getAccountBalance();
        }
        return overall;
    }

}
