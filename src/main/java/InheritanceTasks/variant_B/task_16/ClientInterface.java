package InheritanceTasks.variant_B.task_16;

import java.util.ArrayList;

public interface ClientInterface {
    ArrayList<Account> getAccountsList();
    void addAccountToAccountList(Account accountsList);
    boolean findByAccountNumber(int accountNumber);
    ArrayList<Account> sortByAmount();
    double overallAmount();
    double overallAmountForNegative();
    double overallAmountForPositive();
}
