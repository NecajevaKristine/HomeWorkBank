
import bank.Bank;

import javax.swing.*;


public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        int choice;

        do {
            String input = JOptionPane.showInputDialog(null, "Enter Choice:\n1. Register User\n2. Replace User\n3. Credit User\n4. Debit User\n5. Show balance\n6. Show User Details\n7. Exit");
            choice = Integer.parseInt(input);

            switch (choice) {
                case 1:
                    bank.registerUser();
                    break;
                case 2:
                    bank.replaceUser();
                    break;
                case 3:
                    bank.creditUser();
                    break;
                case 4:
                    bank.debitUser();
                    break;
                case 5:
                    bank.showBalance();
                    break;
                case 6:
                    bank.showUserdetails();
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "Exiting program");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid choice");
                    break;

            }
        }while (choice != 0);
    }
}
