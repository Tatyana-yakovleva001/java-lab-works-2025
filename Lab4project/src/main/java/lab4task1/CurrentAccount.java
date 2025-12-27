package lab4task1;

 class CurrentAccount extends BankAccount{
     public CurrentAccount(double InitialBalance) {
         super(InitialBalance);
     }

     @Override
     public void withdraw(double amount){
         if(amount > 0){
             System.out.println("Сняли" + amount + " .Новый баланс" + balance + (balance < 0 ? "(овердрафт)" : ""));

         } else {
             System.out.println("Сумма отрицательная");
         }
     }
 }
