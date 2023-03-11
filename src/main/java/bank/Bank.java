package bank;

import user.User;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Bank {
    private User user;

    public void registerUser(){
        String accountNumber = JOptionPane.showInputDialog(null, "Enter account number: ");
        double balance = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter balance: "));
        String name = JOptionPane.showInputDialog(null, "Enter name:");
        String gender = JOptionPane.showInputDialog(null, "Enter gender (M/F): ");

        user = new User(gender, name, accountNumber, balance);

       }

    public void replaceUser(){
        String accountNumber = JOptionPane.showInputDialog("Enter account number");
        double balance = Double.parseDouble(JOptionPane.showInputDialog("Enter balance: "));
        String name = JOptionPane.showInputDialog("Enter name: ");
        String gender = JOptionPane.showInputDialog("Enter gender(M/F): ");

        user = new User(gender, name, accountNumber, balance);
    }

    public void creditUser (){
        double amount = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter amount to credit: "));
        user.credit(amount);
        JOptionPane.showMessageDialog(null, "Amount credited successfully");
    }

    public void debitUser () {
        double amount = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter amount to debit: "));
        if (amount> user.getBalance()) {
            JOptionPane.showMessageDialog(null, "Insufficient balance");
        } else {
            user.debit(amount);
            JOptionPane.showMessageDialog(null, "Amount debited successfully.");
        }
    }
    public void showBalance() {
        JOptionPane.showMessageDialog(null, "Balance: " + user.getBalance());
    }

    public void showUserDetails(){
        JOptionPane.showMessageDialog(null, user.toString());
        }


    public void showUserdetails() {
    }
}




