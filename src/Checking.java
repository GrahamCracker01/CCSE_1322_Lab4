//Class: CSE 1322L
//Section: J03
//Term: Spring 2023
//Name: Asher Graham

public class Checking extends Account{

    //constructor
    public Checking () {
        setFltBalance(0);
    }

    @Override
    public void withdrawal (float fltWithdrawalAmount) {
        if (getFltBalance() < fltWithdrawalAmount) {
            System.out.println("Charging an overdraft fee of $20 because account is below $0");
            setFltBalance(-20);
        }
        setFltBalance(-fltWithdrawalAmount);
    }
}
