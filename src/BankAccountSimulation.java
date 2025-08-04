public class BankAccountSimulation {
    public static void main(String[] args) {
        BankAccount Harshal = new BankAccount("Harshal Avhad", 500000);
        BankAccount Avhad = new BankAccount("Avhad Harshal", 50000000);

        Harshal.deposit(12000);
        Harshal.showbalance();

        Avhad.withdraw(50000);
        Avhad.showbalance();
    }
}
class BankAccount{
    String accountHolder;
    int balance;

    BankAccount(String acholder, int balance){
        this.accountHolder = acholder;
        this.balance = balance;
    }

    void deposit(int amount){
        System.out.println(this.accountHolder + " Deposited Amount: " +amount);
        this.balance = this.balance + amount;
    }
    void withdraw(int amount){
        System.out.println(this.accountHolder + " Withdraw Amount: "+ amount);
        this.balance = this.balance - amount;
    }
    void showbalance(){
        System.out.println(accountHolder + " Balance: " +this.balance);
    }
}
