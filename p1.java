public class p1 {
    int balance=1000;
    public void credit(int amount){
        balance=balance+amount;
        System.out.println("After credit : " + balance);
    }

    public void debit(int amount){
        if(balance - amount >= 1000){
            balance=balance-amount;
            System.out.println("After debit : " + balance);
        }
        else{
            System.out.println("Minimum balance must keep.can't withdraw");
        }
       
    }
    public static void main(String []args){
        p1 acc1 = new p1();
        acc1.credit(555);
        acc1.debit(200);

        p1 acc2 = new p1();
        acc2.credit(900);
        acc2.debit(500);
    } 
}