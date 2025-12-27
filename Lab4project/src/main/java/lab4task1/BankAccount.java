package lab4task1;

abstract class BankAccount {
    protected double balance;

    public BankAccount(double InitialBalance) {
        this.balance = InitialBalance;
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Положили " + amount + ". Новый баланс" + balance );
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public abstract void withdraw(double amount);

    public double getBalance(){
        return balance;
    }
}
