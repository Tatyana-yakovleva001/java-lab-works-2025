package lab4task1;

 class Bank {
     private String BankName;

     private BankAccount[] accounts;
     private int accountCount;

     public Bank( String bankName, int maxAccounts) {
         this.accounts = new BankAccount[maxAccounts];
         BankName = bankName;
         this.accountCount = accountCount;
     }

     public void addAccount(BankAccount account){
         if(accountCount < accounts.length){
             accounts[accountCount++] = account;
             System.out.println("Счет добавлен в банк" + BankName);
         } else {
             System.out.println("Уже максимальное кол-во счетов ");
         }
     }

     public void displayAllBalance(){
         System.out.println("Состояние счетов в банке " + BankName + ": ");
         for(int i = 0; i < accountCount; i++){
             BankAccount acc = accounts[i];
             System.out.println(acc.getClass().getSimpleName() + " баланс " + acc.getBalance());
         }
     }
 }
