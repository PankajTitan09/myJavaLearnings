package myJavaLearnings.CheckedException.CheckedException;

 class InsufficientFundException extends Exception{
    public InsufficientFundException(String message){
        super(message);
    }

 }
class BankAccount{
    private double balance;

    public BankAccount(double initBalance){
        this.balance =initBalance;
    }
    public static void main(String[] args) {
        try{
        BankAccount bankAccount= new BankAccount(2000);
        bankAccount.withdraw(6000);
        }
        catch(InsufficientFundException e){
            System.out.println("Exception is "+e.getMessage());
        }
    }

    public void withdraw(double amount )throws InsufficientFundException{
if(amount <= balance){
    balance -= amount;
    System.out.println("Withdrawn amount is "+amount + " and balance is "+balance);
} else {
    throw new InsufficientFundException("Insufficient funds for withdrawal");
}
}
  
}
