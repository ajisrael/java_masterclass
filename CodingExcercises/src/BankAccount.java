public class BankAccount {
    // Challenge:
    // Create a new class for a bank account
    // Create fields for the account number, balance, customer name, email, and phone number.
    //
    // Create getters and setters for each field
    // Create two additional methods
    // 1. To allow the customer to deposit funds (this should increment the balance field).
    // 2. To allow the customer to withdraw funds. This should deduct from the balance field,
    // but will not allow the withdrawal to complete if their are insufficient funds.
    // You will want to create various code in the main class to confirm your code is working.
    // Add some output to the methods above as well

    private String accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;

    public BankAccount() {
        this("00000", 5.00d, "John Smith", "jsmith@email.com", "555-555-5555");
        System.out.println("Empty constructor called");
    }

    public BankAccount(String accountNumber, double balance, String customerName, String customerEmail,
                       String customerPhoneNumber) {
        System.out.println("Account Constructor with parameters called");

        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return customerName;
    }

    public String getEmail() {
        return customerEmail;
    }

    public String getPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void deposit(int amount) {
        this.balance += amount;
        System.out.println(accountNumber + ": Successfully deposited $" + amount + ".");
        System.out.println(accountNumber + ": Current balance is     $" + this.balance + ".");
    }

    public void withdraw(int amount) {
        double withdrawnBalance = this.balance - amount;
        if (withdrawnBalance >= 0) {
            this.balance = withdrawnBalance;
            System.out.println(accountNumber + ": Successfully withdrew  $" + amount + ".");
            System.out.println(accountNumber + ": Current balance is     $" + this.balance + ".");
        } else {
            System.out.println(accountNumber + ": Failed to withdraw $" + amount + " due to");
            System.out.println(accountNumber + ": insufficient funds");
        }
    }

    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.setAccountNumber("123456789");
        ba.setBalance(50);
        ba.setCustomerName("John Smith");
        ba.setCustomerEmail("js1234@email.com");
        ba.setCustomerPhoneNumber("555-555-5555");

        ba.deposit(50);
        ba.withdraw(150);
        ba.deposit(50);
        ba.withdraw(150);

        BankAccount other = new BankAccount("987654321", 50.0, "Bill Stevens", "bill@example.com", "123-456-7890");
    }
}
