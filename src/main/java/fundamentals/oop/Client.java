package fundamentals.oop;

import java.util.Arrays;

/**
 * Client  which consists of:
 * constructor: with arguments: name and cnp (for initializing the fields and the  bankingAccount array will be
 * initialized with an empty array or only instantiated)
 * fields: bankingAccounts ( array of max 2 banking accounts), name, cnp
 * methods:
 * addBankAccount(takes one argument, bankAccount obj - if there already exists a banking account of the same type
 * in the array an error message is printed)
 * getSavingAccount( returns the bankAccount obj of type SAVING from the array, if there isn’t a saving account a
 * null object is return along with printing an error message)
 * removeAccountByType (takes a string argument which represents the type of the account to be removed from the
 * array and prints a success message if the operations succeeded or error message if not - where the account did
 * not exist in the array)
 * Main class that contains the main method where all the methods are invoked/tested with values inserted by you
 */

public class Client {

    private String name;//tip string, nume field: name
    private String cnp;
    private BankAccount bankAccount;//tip BankAccount (variabila bankAccount este de tipul clasei BankAccount);
    // si clasele sunt tipuri in Java
    private BankAccount[] bankAccounts;//tip array de BankAccount, nume field: bankAccounts

    public BankAccount[] getBankAccounts() {
        return bankAccounts;
    }

    public void setBankAccounts(BankAccount[] bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    public Client(String name, String cnp, BankAccount bankAccount) {
        this.name = name;
        this.cnp = cnp;
        this.bankAccount = bankAccount;
    }

    public Client(String name, String cnp) {
        this.name = name;
        this.cnp = cnp;
        this.bankAccount = new BankAccount();
    }

    public Client() {
        this.bankAccount = new BankAccount();
    }

    //public String toString() { //creere metoda prin care in main prin System.out.println(client)/
    // System.out.println(client.toString()) afiseaza ce este in metoda to string (nume, cnp, banckAccount;
    // return "Name= " + this.name + ", CNP=" + this.cnp + ", Bank account= " + this.bankAccount;

    //}// cu Alt+Ins se poate insera toString si suprascrie metoda de mai sus

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", cnp='" + cnp + '\'' +
                ", bankAccount=" + bankAccount +
                ", bankAccounts=" + Arrays.toString(bankAccounts) +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }
}
