package inheritance.classes;

public class Account {
    private final int accNo;
    private String accName;
    private int balance;

   public void addMoney(int money , int pin){
      System.out.println("add Money");
    }
    public void withDrawMoney(int money , int pin){
        System.out.println("withDraw Money");
    }




    public Account(int accNo, String accName) {
        this.accNo = accNo;
        this.accName = accName;
    }
    public int getAccNo() {
        return accNo;
    }
    public String getAccName() {
        return accName;
    }
    public void setAccName(String accName) {
        this.accName = accName;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }


}
