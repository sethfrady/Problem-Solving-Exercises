public class Account {

    public static void main(String[] args) {

//        Account bobsAccount = new Account(234234, 0.00, "Bob Brown", "myemail@bob.com", "(704) 382-2342");
//        bobsAccount.setAccountNumber(123213);
//        bobsAccount.setBalance(0.00);
//        bobsAccount.setCustomerName("Bob Brown");
//        bobsAccount.setEmail("myemail@bob.com");
//        bobsAccount.setPhoneNumber("(704) 124-322");
//
//
//        bobsAccount.withdraw(100.0);
//
//        bobsAccount.deposit(50.0);
//        bobsAccount.withdraw(100.0);
//
//        bobsAccount.deposit(51.0);
//        bobsAccount.withdraw(100.0);
//
//        Account timAccount = new Account("Tim", "tim@email.com", "12332");
//        System.out.println(timAccount.getAccountNumber() + " name " + timAccount.getCustomerName());



    }

    public Account() {
        this(32332, 2.50, "Default name", "Default address", "Default phone");
        System.out.println("Empty constructor called");
    }

    public Account(int accountNumber, double balance, String customerName, String email, String phoneNumber) {
        System.out.println("Account constructor with parameters called ");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Account(String customerName, String email, String phoneNumber) {
        this(999999, 100.55, customerName, email, phoneNumber);
    }

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public void setAccountNumber(int number) {
        this.accountNumber = number;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setCustomerName(String name) {
        this.customerName = name;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPhoneNumber(String number) {
        this.phoneNumber = number;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
    }

    public void withdraw(double withdrawAmount) {
        if (this.balance < withdrawAmount) {
            System.out.println("Only " + this.balance + " available. Withdrawal not processed");
        } else {
            this.balance -= withdrawAmount;
            System.out.println("Withdrawal of " + withdrawAmount + " processed. Remaining balance is = " + this.balance);
        }
    }

}
