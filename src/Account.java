//Class: CSE 1322L
//Section: J03
//Term: Spring 2023
//Name: Asher Graham

class Account {

    //declare variables
    private static int intAccountNumber = 10001;
    private int intAccount;
    private float fltBalance;


    //constructors
    public Account() {
        intAccount = intAccountNumber;
        intAccountNumber++;
        fltBalance = 0;
    }

    public Account (float balance) {
        intAccount = intAccountNumber;
        intAccountNumber++;
        fltBalance = balance;
    }

    //getters and setters
    public int getIntAccount() {
        return intAccount;
    }

    public float getFltBalance() {
        return fltBalance;
    }

    public void setFltBalance(float fltNewBalance) {
        fltBalance = fltNewBalance;
    }

    //withdrawal and deposit
    public void withdrawal(float fltWithdrawalAmount) {
        fltBalance -= fltWithdrawalAmount;
    }

    public void deposit(float fltDepositAmount) {
        fltBalance += fltDepositAmount;
    }

}