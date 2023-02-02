//Class: CSE 1322L
//Section: J03
//Term: Spring 2023
//Name: Asher Graham

import java.util.Scanner;
class Main {
    public static void main(String[] args){

        //declarations
        Scanner scan = new Scanner(System.in);
        boolean boolStop = false;
        float fltInput;
        Checking checkingAccount = new Checking();
        Savings savingsAccount = new Savings();

        //menu
        do {
            System.out.println("1. Withdraw from Checking\n" +
                    "2. Withdraw from Savings\n" +
                    "3. Deposit to Checking\n" +
                    "4. Deposit to Savings\n" +
                    "5. Balance of Checking\n" +
                    "6. Balance of Savings\n" +
                    "7. Award Interest to Savings now\n" +
                    "8. Quit");
            switch (Integer.parseInt(scan.nextLine())) {
                case 1:
                    System.out.println("How much would you like to withdraw from Checking?");
                    fltInput = Float.parseFloat(scan.nextLine());
                    checkingAccount.withdrawal(fltInput);
                    break;
                case 2:
                    System.out.println("How much would you like to withdraw from Savings?");
                    fltInput= Float.parseFloat(scan.nextLine());
                    savingsAccount.withdrawal(fltInput);
                    break;
                case 3:
                    System.out.println("How much would you like to deposit into Checking?");
                    fltInput = Float.parseFloat(scan.nextLine());
                    checkingAccount.deposit(fltInput);
                    break;
                case 4:
                    System.out.println("How much would you like to deposit into Savings?");
                    fltInput = Float.parseFloat(scan.nextLine());
                    savingsAccount.deposit(fltInput);
                    break;
                case 5:
                    System.out.println("Your balance for checking " + checkingAccount.getIntAccount() + " is " + checkingAccount.getFltBalance());
                    break;
                case 6:
                    System.out.println("Your balance for savings " + savingsAccount.getIntAccount() + " is " + savingsAccount.getFltBalance());
                    break;
                case 7:
                    savingsAccount.interest();
                    break;
                case 8:
                    boolStop = true;
                    break;
                default:
                    System.out.println("Please input a valid menu option.");
                    break;
            }
        } while (!boolStop);

    }
}