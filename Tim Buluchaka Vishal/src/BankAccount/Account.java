package BankAccount;

public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public Account(){
        this("78954",456.321,"Tim bhai","vbjsdhvb","668");
        System.out.println("Empty Cinstructor Called");
    }
    public Account(String number, double balance, String customerName,String customerEmailAddress, String customerPhoneNumber){
        this.number=number;
        this.balance=balance;
        this.customerName=customerName;
        this.customerEmailAddress=customerEmailAddress;
        this.customerPhoneNumber=customerPhoneNumber;
    }
    public void deposit(double depositAmount){
        this.balance+=depositAmount;
        System.out.println("Deposit of "+ depositAmount+" made .Current balance is "+ this.balance);
    }
    public void withdrawl(double withdrawlAmount){
        if(this.balance-withdrawlAmount<0){
            System.out.println("Only "+ this.balance + " available.Withdrawal not possible");
        }
        else{
            this.balance=balance-withdrawlAmount;
            System.out.println("Withdrawal of " + withdrawlAmount + "processed. Remaining balance is "+ this.balance);
        }
    }
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
