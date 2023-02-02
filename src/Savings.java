//Class: CSE 1322L
//Section: J03
//Term: Spring 2023
//Name: Asher Graham

public class Savings extends Account{

    int intDepositCount = 0;
    //constructor
    public Savings () {
        setFltBalance(500);

    }

    //withdrawal
    @Override
    public void withdrawal (float fltWithdrawalAmount) {
        if ((getFltBalance() - fltWithdrawalAmount) < 500) {
            System.out.println("Charging a fee of $10 because you are below $500");
            setFltBalance(getFltBalance() -10);
        }
        setFltBalance(getFltBalance() - fltWithdrawalAmount);
    }

    //deposit
    @Override
    public void deposit (float fltDepositAmount) {
        intDepositCount++;
        System.out.println("This is deposit " + intDepositCount + " to this account");
        if (intDepositCount >= 6) {
            System.out.println("Charging a fee of $10");
            setFltBalance(getFltBalance() - 10);
        }
        setFltBalance(getFltBalance() + fltDepositAmount);
    }

    public void interest() {
        System.out.println("Customer earned " + (0.015 * getFltBalance()) + " in interest");
        setFltBalance((float) (getFltBalance() + (0.015 * getFltBalance())));
    }
}
