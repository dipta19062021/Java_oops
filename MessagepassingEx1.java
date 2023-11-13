class Bankaccount{
    private double balance;

    public Bankaccount(double balance){
            this.balance=balance;
    }
    public void sendMoney(Bankaccount receipent, double amount){
        this.balance=this.balance-amount;

        receipent.receieveMoney(amount);
    }

    public void receieveMoney(double amount){
        this.balance=this.balance+amount;
    }
    public double getBalance(){
        return this.balance;
    }
}
public class MessagepassingEx1 {
    public static void main(String args[]){
        Bankaccount bank1=new Bankaccount(1000);
        Bankaccount bank2=new Bankaccount(300.58);

        bank1.sendMoney(bank2,400.0);
        System.out.println("The balance of sender is" + bank1.getBalance());
        System.out.println("The balance of receiver is" + bank2.getBalance());
    }
}
