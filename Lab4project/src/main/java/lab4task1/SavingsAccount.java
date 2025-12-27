package lab4task1;

public class SavingsAccount extends BankAccount {
    public SavingsAccount(double InitialBalance) {
        super(InitialBalance);
    }

    @Override
    public void withdraw(double amount){
        if(amount > 0){
             if(amount <= balance){
                 balance -= amount;
                 System.out.println("Сняли" + amount+ ". Новый баланс" + balance);

             } else{
                 System.out.println("Нет столько денег!");
             }
        } else{
            System.out.println("Отрицательная сумма");

        }
    }
}
