package lab4task1;

class FixedDepositAccount extends BankAccount {
    public FixedDepositAccount(double InitialBalance) {
        super(InitialBalance);
    }

    @Override
    public void withdraw(double amount){
        System.out.println("Снятие со срочного вклада запрещено до окончания срока ");
    }
}
