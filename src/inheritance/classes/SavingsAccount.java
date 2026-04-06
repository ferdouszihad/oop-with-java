package inheritance.classes;

public class SavingsAccount extends Account{
    private String savingScheme;
    public SavingsAccount(int accNo, String accName , String savingScheme) {
        super(accNo, accName);
        this.savingScheme=savingScheme;
    }
   public void transferMoney(Account acc , int amount , int pin){
        System.out.println("transfer money");
    }
   public  void availMonthlyProfit(){
        System.out.println("transfer money");

    }

    public String getSavingScheme() {
        return savingScheme;
    }

    public void setSavingScheme(String savingScheme) {
        this.savingScheme = savingScheme;
    }
}
