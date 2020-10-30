public class BankAccount{
  private double balance;
  private int accountID;
  private String password;

  public BankAccount(int a, String p){
    accountID = a;
    password = p;
  }

  public double getBalance(){
    return balance;
  }

  public int getAccountID(){
    return accountID;
  }

  public void setPassword(String pass){
    password = pass;
  }

  public boolean deposit(double amount){
    if (amount<0){
      return false;
    }
    else{
      balance += amount;
      return true;
    }
  }

  public boolean withdraw(double amount){
    if (balance-amount > 0){
      balance = balance - amount;
      return true;
    }
    else{
      return false;
    }
  }

  public String toString(){
    return "#"+Integer.toString(accountID)+"\t"+ "$"+String.valueOf(balance);
  }

  private boolean authenticate(String password){
    return password.equals(this.password);

  }

  public boolean transferTo(BankAccount other, double amount, String password){
    if (authenticate(password)&&withdraw(amount)){
      if (other.deposit(amount)){
        return true;
      }
    }
    return false;
  }

}
