package lab4task1;

public class Main {
    public static void main(String[] args){

        SavingsAccount savings = new SavingsAccount(1000);
        CurrentAccount current = new CurrentAccount(500);
        FixedDepositAccount fixed = new FixedDepositAccount(5000);


        System.out.println("Тест SavingsAccount");
        savings.deposit(200);
        savings.withdraw(1500);
        savings.withdraw(300);

        System.out.println("Тест  CurrentAccount");
        current.deposit(300);
        current.withdraw(1000);

        System.out.println("Тест FixedDepositAcount");
        fixed.withdraw(1000);

        Bank bank = new Bank("Надежный Банк", 10);
        bank.addAccount(savings);
        bank.addAccount(current);
        bank.addAccount(fixed);

        bank.displayAllBalance();

    }
}
