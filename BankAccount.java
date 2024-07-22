public class BankAccount{
    private String accountNumber;
    private double balance;
    private String accountHolderName;

    //constructor
    public BankAccount(String accountNumber,String accountHolderName, double initialBalance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }
    //Getter for accountHolderName
    public String getAccountHolderName(){
        return accountHolderName;

    }
    //getter for balance
    public double getBalance(){
        return balance;
    }
    //Method to deposit money
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
        }
        else{
            System.out.println("invalid deposit amount");
        }
    }
    //Method to withdraw money
    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance-=amount;

        }
        else{
            System.out.println("invalid withdrawal amount");
        }
    }
    //private method to get accountNumber, for internal use only

    private String getAccountNumber(){
        return accountNumber;
    }
    //Main method for testing
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", "Alice", 1000);
        account.deposit(500);
        System.out.println("Balance:" + account.getBalance() );//outputs balance: 1500
        account.withdraw(200);
        System.out.println("Balance: " +account.getBalance()); //outputs balance: 1300
        System.out.println(account.getAccountNumber());
        //account.accountNumber is not acessible here ensuring its protection
    }


    
}