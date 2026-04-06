package inheritance.classes;

public class HajjAccount extends DepositAccount{
   private String type;

    public HajjAccount(int accNo, String accName, int depoAmount, int year) {
        super(accNo, accName, depoAmount, year);
        this.type="normal";

    }
    public HajjAccount(int accNo, String accName, int depoAmount, int year , String type) {
        super(accNo, accName, depoAmount, year);
        this.type="premium";

    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
