
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        Account orhunHesap = new Account("Orhunun hesabı" , 100);
        orhunHesap.deposit(20);
        System.out.println(orhunHesap.saldo());
        orhunHesap.toString();
    }
}
