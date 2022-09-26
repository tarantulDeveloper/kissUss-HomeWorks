package InheritanceTasks.variant_B.task_16;

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        Account account = new Account(7898,454654,true);
        Account account1 = new Account(5656,79,false);
        ArrayList<Account> accountsList = new ArrayList<>();
        accountsList.add(account);
        accountsList.add(account1);

        Client client = new Client("Park Hyung-Sik",accountsList);
        //blocking account
        client.getAccountsList().get(0).blockAccount();

        //searching account by accountNumber
        System.out.println(client.findByAccountNumber(78));

        //sorting accounts
        System.out.println(client.sortByAmount());

        //Overall amount of money
        System.out.println("Overall amount of money: " + client.overallAmount());

    }
}
