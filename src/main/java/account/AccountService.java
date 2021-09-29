package account;

import main.ApplicationLogger;

public class AccountService {

    public void withdraw(String accountNumber, double amount) {
        if(amount>0 && AccountNumberValidator.validate(accountNumber)) {
//            System.out.println(amount + " has been withdraw from " + accountNumber);
            ApplicationLogger applicationLogger = ApplicationLogger.getInstance();
            applicationLogger.getMessage(amount + " has been withdraw from" + accountNumber);
        }
    }

    public void deposit(String accountNumber, double amount) {
        if(amount>0 && AccountNumberValidator.validate(accountNumber)) {
//            System.out.println(amount + " has been deposit into " + accountNumber);
            ApplicationLogger applicationLogger = ApplicationLogger.getInstance();
            applicationLogger.getMessage(amount + " has been deposit into " + accountNumber);
        }
    }
}
