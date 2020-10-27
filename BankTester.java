public class BankTester{
  public static void main(String[] args){
    BankAccount b1 = new BankAccount(500.5,1,"hello");
    BankAccount b2 = new BankAccount(100,2,"world");

    System.out.println(b1.getBalance());
    System.out.println(b2.getAccountID());

    b1.setPassword("howdy");

    System.out.println(b1.deposit(500.5));
    System.out.println(b1.getBalance());

    System.out.println(b2.withdraw(500));
    System.out.println(b2.withdraw(50));
    System.out.println(b2.getBalance());

    System.out.println(b1.toString());
    System.out.println(b2.toString());

  }
}
