package InheritanceTasks.variant_B.task_16;

class Account implements Comparable<Account>{
    private int accountNumber;
    private double accountBalance;
    private boolean isEnabled;

    public Account(int accountNumber, double accountBalance, boolean isEnabled) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.isEnabled = isEnabled;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }


    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String blockAccount(){
        this.isEnabled = false;
        return "Blocked";
    }

    public String unblockAccount() {
        this.isEnabled = true;
        return "Unblocked";
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", accountBalance=" + accountBalance +
                ", isEnabled=" + isEnabled +
                '}';
    }

    @Override
    public int compareTo(Account o) {
        return Double.compare(accountBalance,o.accountBalance);
    }
}
