package InheritanceTasks.variant_B.task_16;

import java.util.ArrayList;
import java.util.Collections;

class Client implements ClientInterface{
    private String fullName;
    private ArrayList<Account> accountsList;

    public Client(String fullName, ArrayList<Account> accountsList) {
        this.fullName = fullName;
        this.accountsList = accountsList;
    }
    @Override
    public ArrayList<Account> getAccountsList() {
        return accountsList;
    }
    @Override
    public void addAccountToAccountList(Account accountsList) {
        this.accountsList.add(accountsList);
    }
    @Override
    public boolean findByAccountNumber(int accountNumber) {
        for (Account account : accountsList) {
            if (account.getAccountNumber() == accountNumber) {
                return true;
            }
        }
        return false;
    }
    @Override
    public ArrayList<Account> sortByAmount() {
        Collections.sort(accountsList);
        return accountsList;
    }
    @Override
    public double overallAmount() {
        double sum = 0;
        for(Account account : accountsList) {
            sum += account.getAccountBalance();
        }
        return sum;
    }
    @Override
    public double overallAmountForNegative() {
        double overall = 0;
        for(Account account: accountsList) {
            overall += Math.abs(account.getAccountBalance());
        }
        return overall;
    }
    @Override
    public double overallAmountForPositive() {
        double overall = 0;
        for(Account account : accountsList) {
            overall += account.getAccountBalance();
        }
        return overall;
    }

}
