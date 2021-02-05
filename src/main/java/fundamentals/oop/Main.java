package fundamentals.oop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BankAccount bankAccount = new BankAccount(); ///am creat un obiect de tip bankAccount
        System.out.println("Account type " + bankAccount.getAccountType());
        System.out.println("Currency " + bankAccount.getCurrency());

        //case 1: give bankaccount to the client from outside (created outside)
        Client client1 = new Client("Dorina", "2790720080082", bankAccount);//am creat un client
        System.out.println(client1);

        client1.getBankAccount().addMoney(12);
        client1.getBankAccount().withdrawMoney(13);
        System.out.println(client1);
        client1.getBankAccount().setAccountType("SPENDING");
        client1.getBankAccount().addMoney(3);
        client1.getBankAccount().withdrawMoney(10);

        //var 1
        BankAccount.convertMoneyToCurrency(10, "EUR", "USD");
        System.out.println(BankAccount.convertMoneyToCurrency(10, "EUR", "USD"));

        //var2.irosire de spatiu in memorie ca sa folosim o variabila pe care nu o mai utilizam in alta parte
        double x = BankAccount.convertMoneyToCurrency(10, "EUR", "USD");
        System.out.println(x);

        BankAccount bankAccount1 = new BankAccount("SAVING", "USD");
        BankAccount bankAccount2 = new BankAccount("SPENDING", "USD");
        BankAccount[] myArray = {bankAccount1, bankAccount2};
        client1.setBankAccounts(myArray);
        System.out.println(myArray[0]);
        System.out.println(client1.getBankAccounts()[0]);


        System.out.println("Input client's name: ");
        String name = scanner.next();
        System.out.println("Input client's cnp: ");
        String cnp = scanner.next();

        //case 2:client has asigned by default a default bank account -create bank account inside the constructor
        Client client2 = new Client(name, cnp);//am creat client cu nume si cnp din afara, si in int constructorului
        //detalii bankAccount
        System.out.println(client2);
    }
}
