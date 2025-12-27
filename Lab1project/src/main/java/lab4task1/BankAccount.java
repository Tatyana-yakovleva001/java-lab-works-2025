package lab4task1;

abstract class BankAccount {
    protected double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Положено" + amount + ". Новый баланс " + balance);
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public abstract void withdraw(double amount);

    public double getBalance() {
        return balance;
    }
}
