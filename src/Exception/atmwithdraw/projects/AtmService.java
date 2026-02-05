package Exception.atmwithdraw.projects;

class ATMService {

    private double balance = 10000;

    boolean withdraw(double amount) throws InsufficientBalanceException {

        boolean isValid = true;

        if (amount <= 0) {
            isValid = false;
            throw new IllegalArgumentException("Withdrawal amount must be greater than zero");
        }

        if (amount > balance) {
            isValid = false;
            throw new InsufficientBalanceException("Insufficient balance");
        }

        balance = balance - amount;
        System.out.println("Withdrawal Successful");
        System.out.println("Remaining Balance: " + balance);

        return isValid;
    }
}

