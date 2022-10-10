public class SavingAccount {
    int accountNumber;
    String accountHolderName;
    int accountBalance;
    String accountStatus;
    int amountAfterWithdraw;
    int remainingBalance;

    SavingAccount(int accountNumber, String accountHolderName, int accountBalance, String accountStatus) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.accountStatus = accountStatus;

    }

    void withdrawCash(int withdrawAmount) {
        if (accountBalance > withdrawAmount)
            remainingBalance = accountBalance - withdrawAmount;
        System.out.println("Withdraw Amount :-  " + withdrawAmount);
        System.out.println("Balance After Withdraw:- " + remainingBalance);

    }
    void depositCash(int depositAmount) {
        remainingBalance = remainingBalance + depositAmount;
        System.out.println("Deposit Amount:-  " + depositAmount);
        System.out.println("Balance After Deposit :-  " + remainingBalance);
    }
    void fundTransfer(int transferAmount) {
        int min = 10000000;
        int max = 999999999;
        int accountNumberTransfer = (int) (Math.random() * (max - min + 1) + min);
        System.out.println("Fund Transfer to Account Number:- " + accountNumberTransfer);
        remainingBalance = remainingBalance - transferAmount;
        System.out.println("Transfer Amount:- " + transferAmount);
        System.out.println("Balance after Transfer:-" + remainingBalance);
    }
    void Display(){
        System.out.println("Account Number:-  " + accountNumber);
        System.out.println("Account Holder Name:-  " + accountHolderName);
        System.out.println("Account Balance:-  " + accountBalance);
        System.out.println("Account Status:-  " + accountStatus);
    }
}
