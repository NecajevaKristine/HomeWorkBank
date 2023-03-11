package user;

public class User {

    private String gender;
    private String name;
    private String accountNumber;
    private double balance;

    public User(String gender, String name, String accountNumber, double balance) {
        this.gender = gender;
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void credit (double amount){
        balance += amount;
    }
    public void debit (double amount){
        balance -= amount;
    }

    public String toString(){
        return "Account number: " + accountNumber + "\nBalance: " + balance + "\nName: " + name + "\nGender: " + gender;
    }
}
