package fundamentals.oop;

/**
 * Write an application that contains the following classes:
 * BankAccount which is consists of:
 * constructor: with arguments: type and currency (for initializing the fields and the  balance will be initialized
 * with 0 in the constructor)
 * fields: type of the account (SAVING or SPENDING),  balance (the amount of money), currency (USD, EUR),
 * methods:
 * addMoney (adds money to the balance, - if the account is of type SPENDING the amount of money that is added
 * needs to be bigger than 10% of balance otherwise print a suggestive  error message)
 * withdrawMoney ( withdraws  money from the balance - if the account is of type SAVING the remaining balance can
 * not be < 0 otherwise print a suggestive  error message ),
 * covertMoneyToCurrency (that takes 2 arrguments: amountOfMoney to convert, and the currency to convert to and returns the result = the money in the input currency)
 */
public class BankAccount {
    /**
     * Type of the account: SAVING or SPENDING
     */
    private String accountType;
    /**
     * Currency: USD or EUR
     */
    private String currency;
    /**
     * Balance of the account
     */
    public static final double USD_TO_EUR = 0.85;
    public static final double EUR_TO_USD = 1.25;

    private double balance;

    public BankAccount(String accountType, String currency) {// 1fst constructor creere constructor
        // si parametri
        this.accountType = accountType;
        this.currency = currency;
        this.balance = 0;
    }

    public BankAccount() {              //// 2nd constructor
        this.accountType = "SAVING";
        this.currency = "USD";
        this.balance = 0;
    }

    //* addMoney (adds money to the balance, - if the account is of type SPENDING the amount of money that is added
// * needs to be bigger than 10% of balance otherwise print a suggestive  error message)
    public void addMoney(double newMoney) {
        if (this.accountType.equals("SPENDING") && newMoney <= this.balance / 10) {
            System.out.println("Please add at least 10% of your actual balance");
            return;
        }
        this.balance += newMoney;
        System.out.println("Your new balance is: " + this.balance);
    }

    //* withdrawMoney ( withdraws  money from the balance - if the account is of type SAVING the remaining
    // balance can not be < 0 otherwise print a suggestive  error message )
    public void withdrawMoney(double newMoney) {
        if (this.accountType.equals("SAVING") && this.balance - newMoney < 0) {
            System.out.println("Unsufficient founds");
            return;
        }
        this.balance -= newMoney;
        System.out.println("Your new balance is: " + this.balance);
    }

    //* covertMoneyToCurrency (that takes 2 arrguments: amountOfMoney to convert, and the currency to convert
    // to and returns the result = the money in the input currency)
    public static double convertMoneyToCurrency(double amountOfMoney, String inputCurrency, String outputCurrency) {
        if (inputCurrency.equals("EUR") && outputCurrency.equals("USD")) {
            return amountOfMoney * EUR_TO_USD;
        }
        return amountOfMoney * USD_TO_EUR;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "type='" + accountType + '\'' +
                ", currency='" + currency + '\'' +
                ", balance=" + balance +
                '}';
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getCurrency() { //CTRL+Click ne duce direct la metoda
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
